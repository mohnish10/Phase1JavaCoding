package com.simplilearn.basics;
public class UncheckedExceptionDemo3 {
public static void main(String[] args)
{
int a[] = {0,1,2,3,4};
try
{
System.out.println(a[5]);	
}
catch(Exception e)
{
System.out.println("Error occured:- "+e.getMessage());	
}
}
}
