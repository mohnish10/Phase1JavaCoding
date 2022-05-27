package com.simplilearn.basics;

public class SubClass extends SuperClass{
public SubClass(String x)
{
System.out.println("Child is born");	
}
public static void main(String[] args)
{
SubClass sc = new SubClass("Sucessfully logged in");
}
}
