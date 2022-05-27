package com.simplilearn.basics;
public class StringDemo {
	public static void main(String[] args)
	{
String s1 = " Hello World ";
String s2  = "Good Morning";
System.out.println(s1);
System.out.println(s2);
System.out.println("The character at  index  3 is :- "+s1.charAt(3));
System.out.println("The string s1 in upper case is :-"+s1.toUpperCase());
System.out.println("The string s2 in lower case is :-"+s2.toLowerCase());
System.out.println("The concatenation of String s1 and s2 is :-"+s1.concat(s2));
System.out.println("The substring of string s1 is - "+s1.substring(2));
System.out.println("The length of string s1 is :-"+s1.length());
System.out.println("String s1 without space is :- "+s1.trim());
System.out.println("The comparision between Strings s1 and s2 is :-"+s1.compareToIgnoreCase(s2));
s1 = "Updated Hello World";
System.out.println("Updated s1 is :- "+s1);
}
}
