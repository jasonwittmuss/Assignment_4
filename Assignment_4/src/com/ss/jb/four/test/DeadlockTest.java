package com.ss.jb.four.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.ss.jb.four.Assignment_4_2.Deadlock;

public class DeadlockTest {

	@Test
	public void test() {
		Deadlock dead = new Deadlock();
		
		dead.Eat(1);
		dead.Eat(5);
	}

}
