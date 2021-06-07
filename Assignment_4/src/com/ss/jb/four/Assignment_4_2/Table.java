package com.ss.jb.four.Assignment_4_2;

import java.util.ArrayList;

public class Table {
	// Gets forks and philosophers initialized
	private ArrayList<Object> forkList = new ArrayList<Object>();
	private ArrayList<Philosopher> philosopherList = new ArrayList<Philosopher>();
	private int num;

	// Takes in a number of philosophers and forks
	public Table(int num) {
		this.num = num;
	}

	// execute the deadlock
	public void eat() {
		// Set the forks down
		for (int i = 0; i < num; i++) {
			forkList.add(new Object());
		}

		// Sit philosophers down and have then try to eat
		for (int i = 0; i < num; i++) {
			Object left = forkList.get(i);
			Object right = forkList.get((i + 1) % num);

			philosopherList.add(new Philosopher(left, right));

			Thread phil = new Thread(philosopherList.get(i));
			phil.start();
		}
	}

}
