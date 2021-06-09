package com.ss.jb.four.Assignment_4_3;

import java.util.ArrayList;

public class Assignment_4_3 {
	public static ArrayList<Integer> array = new ArrayList<Integer>();
	public static int wait = 0;
	
	public Assignment_4_3(int wait) {
		Assignment_4_3.wait = wait;
		
		Producer producer = new Producer();
		Thread p = new Thread(producer);

		Consumer consumer = new Consumer();
		Thread c = new Thread(consumer);

		p.start();
		c.start();
	}

	// Add a resource to the shared array
	public static void addToArray(int product) {
		array.add(product);
	}

	// wait 20 ms then consume a resource
	public static int useFromArray() {
		try {
			Thread.sleep(wait);

			int consumable = array.get(0);
			array.remove(0);

			return consumable;

		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (IndexOutOfBoundsException e2) {
			e2.printStackTrace();
		}
		return 0;
	}
}
