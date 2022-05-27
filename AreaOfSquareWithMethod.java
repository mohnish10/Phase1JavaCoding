package com.simplilearn.basics;
import java.util.*;
public class AreaOfSquareWithMethod {
	public double area(double side)
	{
	return side*side;	
	}
public static void main(String[] args)
{
	double value;
Scanner sc = new Scanner(System.in);
System.out.println("Please enter the value of side :-");
value = sc.nextDouble();
AreaOfSquareWithMethod aos = new AreaOfSquareWithMethod();
System.out.println("Area of the square is :- "+aos.area(value));
}
}