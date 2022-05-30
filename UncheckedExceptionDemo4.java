package com.simplilearn.basics;
public class UncheckedExceptionDemo4 {
public static void main(String[] args)
{
String name = null;
try
{
System.out.println(name.equals("Sonam"));
}
catch(NullPointerException e)
{
System.out.println(e.getMessage());	
}
}
}
