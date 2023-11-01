package studio7;

import edu.princeton.cs.introcs.StdDraw;

public class Rectangle {
	private double length; 
	private double width;

	public Rectangle (double length, double width) {
		this.length = length;
		this.width = width;
	}
	public double getArea () {
		return length * width;
	}
	public double getPerimeter () {
		return (2 * length) + (2* width);
	}
	public void drawRectangle () {
		double halfWidth = width /2;
		double halfLength = length/2;
		StdDraw.rectangle(width, length, halfWidth, halfLength);
		StdDraw.show ();
	}
	public static void main (String []args) {
		Rectangle A = new Rectangle (0.5,0.3);
		A.drawRectangle();
	}
	}
