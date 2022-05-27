package com.simplilearn.basics;
public class RegularInnerClass {
private int a = 10;	
class Inner
{
	public void print()
	{
	System.out.println("Printing the value of a :- "+a);	
	}
}
public static void main(String[] args)
{
	RegularInnerClass ric = new RegularInnerClass();
	RegularInnerClass.Inner in = ric.new Inner(); 
in.print();
}
}
