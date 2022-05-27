package com.simplilearn.basics;
public class LocalInner {
	private int a = 10;
	public void print()
	{
		class Inner
		{
		public void authenticate()
		{
		System.out.println("User is authenticated");	
		}
		}
	Inner i = new Inner();
	i.authenticate();
	}
public static void main(String[] args)
{
LocalInner li = new LocalInner();
li.print();
}
}