package com.simplilearn.basics;
public class ThrowDemo {
public static void check(int age)
{
if(age<18)
{
System.out.println("You are not eligible to vote");	
}
else
{
System.out.println("You can vote");
}
}
public static void main(String[] args)
{
try
{
check(14);	
}
catch(Exception e)
{
System.out.println("Error handled"+e.getMessage());	
}
}
}
