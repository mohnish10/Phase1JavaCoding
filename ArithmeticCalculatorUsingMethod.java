package com.simplilearn.basics;
public class ArithmeticCalculatorUsingMethod {
	public int sum(int a, int b)
	{
		return a+b;
	}
	public int subs(int a , int b)
	{
	return a-b;	
	}
	public float div(float a , float b)
	{
		return a/b;
	}
	public int mult(int a , int b)
	{
		return a*b;
	}
	public static void main(String[] args)
	{
		ArithmeticCalculatorUsingMethod ac = new ArithmeticCalculatorUsingMethod(); 	
	System.out.println("The value of addition is :-" +ac.sum(100, 50));
	System.out.println("The value of substraction is :-" +ac.subs(100, 50));
	System.out.println("The value of division is :-" +ac.div(100.2f,50.5f));
	System.out.println("The value of multiplication is :-" +ac.mult(100,50));
	}
}


