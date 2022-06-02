package com.simplilearn.basics;
public class ThrowAndThrowsDemo {
public static void check(int  age) throws Exception	
{
if(age<18)
{
System.out.println("You are not allowed to vote");	
}
else
{
System.out.println("You can vote");	
}
}
public static void main(String[] args) throws Exception
{
check(14);
}
}
