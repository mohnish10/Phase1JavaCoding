package com.simplilearn.basics;
import java.util.Scanner;
public class UncheckedExceptionDemo2 {
public static void main(String[] args)
{
	int num1, num2, div;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter any 2 numbers");
	num1 = sc.nextInt();
	num2 = sc.nextInt();
try
{
div = num1/num2;
System.out.println("Division is :-"+div);
}
catch(ArithmeticException e)
{
System.out.println("Exception occured");
System.out.println("Kindly try after some time");
System.out.println("Error message :-"+e.getMessage());
}
}
}
