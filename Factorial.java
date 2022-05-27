package com.simplilearn.basics;
import java.util.Scanner; 
public class Factorial {
public static void main(String[] args)
{
	int i;
	double fact = 1;
	int n;
	Scanner sc = new Scanner(System.in);
	System.out.println("Please enter the number for which you want to calculate factorial");
	n = sc.nextInt();
	for (i = 1; i <= n;i++)
	{
		fact = fact * i;
	}
	System.out.println("The factorial value is :-" +fact);
}
}
