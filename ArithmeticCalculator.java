package com.simplilearn.basics;
import java.util.Scanner;
public class ArithmeticCalculator {
	public static void main(String[] args)
	{
		float a,b;
		int value;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the first value");
		a = sc.nextFloat();
		System.out.println("Please enter the second value");
		b = sc.nextFloat();
		System.out.println("Please choose the operation which you want to perform");		
		System.out.println("1. Addition");
		System.out.println("2. Subtraction");
		System.out.println("3. Multiplication");
		System.out.println("4. Division");
		value = sc.nextInt();
		switch(value)
		{
		case 1: System.out.println("The result of addition is : - "+(a+b));		
		break;
		case 2: System.out.println("The result of subtraction is : - "+(a-b));
		break;
		case 3: System.out.println("The result of multiplication is : - "+(a*b));
		break;
		case 4: System.out.println("The result of division is : - "+(a/b));
		break;
		default:System.out.println("Please enter the correct value to select the operation to be performed");
		}
		}
	}
