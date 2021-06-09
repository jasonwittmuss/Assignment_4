package com.ss.jb.four.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;

import com.ss.jb.four.Singleton;

public class SingletonTest {

	@Test
	public void test() {
		Singleton single = Singleton.getInstance();
		Singleton single2 = Singleton.getInstance();
		Singleton single3 = Singleton.getInstance();
		Singleton single4 = Singleton.getInstance();
	}

}
