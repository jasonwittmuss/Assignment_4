package com.ss.jb.four.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.ss.jb.four.Line;

public class LineTest {

	@Test
	public void test() {
		Line line1 = new Line(0.0, 0.0, 1.0, 1.0);
		Line line2 = new Line(1.0, 0.0, 2.0, 1.0);
		Line line3 = new Line(0.0, 0.0, 0.0, 2.0);
		assert (line1.parallelTo(line2));
		assert (!line1.parallelTo(line3));
		assertEquals(line1.getSlope(), (Double) 1.0);
		assertEquals(line3.getSlope(), (Double) Double.POSITIVE_INFINITY);
		assertEquals(line1.getDistance(), (Double) Math.sqrt(2));
	}

}
