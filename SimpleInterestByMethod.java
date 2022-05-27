package com.simplilearn.basics;
public class SimpleInterestByMethod {
	public int simpleinterest(int p, int r, int n)
	{
		int si;
		si = (p*r*n)/100;
		return si;
	}
public static void main(String[] args)
{
	SimpleInterestByMethod sibm = new SimpleInterestByMethod();
	System.out.println("The value of simple interest is :- "+sibm.simpleinterest(100, 9, 5));
}
}
