package com.simplilearn.basics;
public class Derived extends Parent{
public Derived(String x)
{
super();	
System.out.println("Child constructor");
}
public static void main(String[] args)
{
Derived d = new Derived("Successful login");	
}
}
