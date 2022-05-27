package com.simplilearn.basics;

public class Circle extends Shape
{
private double radius;
	public Circle(String color, double radius) 
	{
		super(color);
this.radius = radius;
	}
public double getArea()
{
return Math.PI*radius*radius;	
}
public String toString()
{
return "Circle color is"+getColor()+"Area:"+getArea(); 	
}
}
