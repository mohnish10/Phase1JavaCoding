package com.simplilearn.basics;
public class ThrowsDemo2 {
public static void check(int age) throws NotValidAgeException
{
if(age<18)
{
System.out.println("You are not eligible to vote");	
}
else
{
System.out.println("You are eligible to vote");	
}
}
public static void main(String[] args) throws NotValidAgeException
{
check(14);	
}
}