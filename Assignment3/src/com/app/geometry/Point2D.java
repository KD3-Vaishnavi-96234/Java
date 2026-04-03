package com.app.geometry;

public class Point2D {
	double x;
	double y;

	public Point2D(double x, double y) {
		super();
		this.x = x;
		this.y = y;
	}

	public Point2D() {

	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public String getDetails() {
		return "Point2D [x=" + x + ", y=" + y + "]";
	}

	public boolean isEqual(Object obj) {

		if (obj == null) {
			return false;
		}
		if (this == obj) {
			System.out.println("Validation: p1 and p2 are the exact same Object (Referential Equality).");
			return true;
		}

		if (!(obj instanceof Point2D)) {
			return false;
		}
		Point2D other = (Point2D) obj;

		return x == other.x && y == other.y;
	}

	public double calculateDistance(Point2D other) {
		return Math.sqrt(Math.pow(other.x - this.x, 2) + Math.pow(other.y - this.y, 2));
	}

}
