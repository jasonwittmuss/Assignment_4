package com.ss.jb.four.Assignment_4_2;

public class Philosopher implements Runnable {

	private Object left;
	private Object right;

	// Gets access to the left and right forks
	public Philosopher(Object left, Object right) {
		this.left = left;
		this.right = right;
	}

	@Override
	public void run() {

		for (int i = 0; i < 2; i++) {
			// Pick up left fork
			synchronized (left) {
				System.out.println("Left fork");
				// pick up right fork
				synchronized (right) {
					System.out.println("Right fork");
					System.out.println("Eating");
					System.out.println("Setting forks down");
				}
			}
		}

	}

}
