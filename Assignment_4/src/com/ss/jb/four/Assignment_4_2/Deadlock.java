package com.ss.jb.four.Assignment_4_2;

public class Deadlock {
	// Make a table object to create a deadlock
	public Deadlock() {
		
	}
	
	public void Eat(int p) {
		Table t = new Table(p);
		t.eat();
	}
}
