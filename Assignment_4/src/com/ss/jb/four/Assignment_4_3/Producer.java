package com.ss.jb.four.Assignment_4_3;

import java.util.Random;

public class Producer implements Runnable {

	@Override
	public void run() {
		// Produce 10 things
		for(int i = 0; i < 10; i++)	{
			Random rand  = new Random();
			int product = rand.nextInt(100);
			
			Assignment_4_3.addToArray(product);
		}
	}

}
