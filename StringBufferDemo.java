package com.simplilearn.basics;
public class StringBufferDemo {
public static void main(String[] args)
{
StringBuffer s1 = new StringBuffer("Hello");
System.out.println("Value of s1 :- "+s1);
s1.append("World");
System.out.println("The appended value of String s1 is :-"+s1);
System.out.println(s1.replace(0, 11, "Morning"));
System.out.println("The updated value of s1  is :-"+s1);
System.out.println("Reverse of string s1 is :-"+s1.reverse());
String s2 = new String("Darling");
StringBuffer s3 = new StringBuffer(s2);
System.out.println(s3);
}
}
