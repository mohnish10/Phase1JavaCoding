package com.simplilearn.basics;
import java.util.*;
public class FinallyDemo {
public static void main(String[] args)
{
int num1, num2, div;
Scanner sc = new Scanner(System.in);
System.out.println("Please enter any 2 numbers");
num1 = sc.nextInt();
num2 = sc.nextInt();
try
{
div = num1/num2;
System.out.println("Division is :- "+div);
}
catch(Exception e)
{
System.out.println("Exception occured");
System.out.println("Kindly try after some time");
System.out.println("Error message :-"+e.getMessage());
}
finally
{
sc.close();
System.out.println("Scanner closed successfully");
}
}
}
