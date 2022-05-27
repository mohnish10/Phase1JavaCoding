package com.simplilearn.basics;

public abstract class Shape {
	static String color;
	public abstract String toString();
public Shape(String color)
{
this.color = color;	
}
public String getColor()
{
return color;	
}
}
