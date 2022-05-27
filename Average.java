package com.simplilearn.basics;
import java.util.*;
public class Average {
	public static void main(String[] args)
	{
	int a,b,c, average;	
	System.out.println("Please enter the value of a");
	Scanner sc = new Scanner(System.in);
	a = sc.nextInt();
	System.out.println("Please enter the value of b");
	b = sc.nextInt();
	System.out.println("Please enter the value of c");
	c = sc.nextInt();
	average = (a+b+c)/3;
	System.out.println("Average is :"+average);
	}
	}
