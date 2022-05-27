package com.simplilearn.basics;
public class StringBuilderDemo {
	public static void main(String[] args)
	{
StringBuilder sbl = new StringBuilder("Good Morning");
System.out.println("Value of sbl is :-"+sbl);
System.out.println("Appended string sb1 :-"+sbl.append("Amol"));
System.out.println("Current value of sbl is :-"+sbl);
System.out.println("Reverse of sbl is :-"+sbl.reverse());
System.out.println("The length of sbl is :-"+sbl.length());
String s2 = new String("Shinde");
StringBuffer sbl1 = new StringBuffer(s2);
System.out.println(sbl1);
	}
	}
