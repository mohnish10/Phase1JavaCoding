package com.simplilearn.basics;

public class Rectangle extends Shape{
	private double height, width;
	public Rectangle(String color, double height, double width)
	{
	super(color);	
	this.height = height;
	this.width = width;
	}
public double getArea()
{
	return height*width;
}
public String toString() {
	return "Rectangle color is"+getColor()+"Area"+getArea();
}
}
