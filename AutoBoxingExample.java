package com.simplilearn.basics;
public class AutoBoxingExample {
	@SuppressWarnings("deprecation")
	public static void main(String[] args)
	{
int a = 50;
Integer a2 = new Integer(a);
Integer a3 = 5;
System.out.println(a2+"\t"+a3);
	}
}
