package com.ss.jb.four;

public class Singleton {
	// Volatile to write to main memory
	private static volatile Singleton instance;

	public static Singleton getInstance() {
		// First check
		if (instance == null) {
			// One thread at a time
			synchronized (Singleton.class) {
				// Second check
				if (instance == null) {
					instance = new Singleton();
				}
			}
		}
		return instance;
	}
}
