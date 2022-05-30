package com.simplilearn.basics;
public class UncheckedExceptionDemo1 {
public static void convert(String obj)
{
int num = Integer.parseInt(obj);
System.out.println("Converted String :- "+num);
}
public static void main(String[] args)
{
String s1 = "Sonam";
try
{
convert(s1);	
}
catch(Exception e)
{
System.out.println(e.getMessage());
e.printStackTrace();
}
}
}