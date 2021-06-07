package com.ss.jb.four.Assignment_4_3;

public class Consumer implements Runnable {

	@Override
	public void run() {
		// Consume 10 things
		for (int i = 0; i < 10; i++) {
			int consumable = Assignment_4_3.useFromArray();

			System.out.println("The number is " + consumable);
		}
	}

}
