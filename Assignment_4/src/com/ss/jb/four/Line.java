package com.ss.jb.four;

public class Line {
	// Points defining the line segment
	private Double x1, y1, x2, y2;
	public Line(Double x1, Double y1, Double x2, Double y2) {
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
	}
	
	public Double getSlope() {
		// Check if vertical
		if(x1 == x2) {
			return Double.POSITIVE_INFINITY;
		}
		// Rise over run
		return (y2 - y1) / (x2 - x1);
	}
	
	public Double getDistance() {
		// Sqrt of (length in x)^2 plus (length in y)^2
		return Math.sqrt(((x2 - x1) * (x2 - x1)) + ((y2 - y1) * (y2 - y1)));
	}
	
	public Boolean parallelTo(Line line) {
		// If slopes are almost the same they are parallel
		if(Math.abs(getSlope() - line.getSlope()) < 0.0001) {
			return true;
		}
		return false;
	}
}
