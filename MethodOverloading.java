package com.simplilearn.basics;
public class MethodOverloading {
	public static void main(String[] args)
	{
	MethodOverloading mo = new MethodOverloading();
	System.out.println("Value of addition is"+"\t"+mo.sum(2, 3));
	System.out.println("Value of addition is"+"\t"+mo.sum(2.5, 5.5));
	System.out.println("Value of addition is"+"\t"+mo.sum(3.3f, 6.6f));	}	
	public int sum(int a,int b)
	{
	return a+b;	
	}
	public double sum(double a, double b)
	{
	return a+b;	
	}
	public float sum(float a, float b)
	{
	return a+b;	
	}
}
