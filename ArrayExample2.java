package com.simplilearn.basics;
import java.util.*;
public class ArrayExample2 {
	public static void main(String[] args)
	{
	Scanner sc = new Scanner(System.in);	
	int a[] = new int[5];
	for(int i = 0;i<a.length;i++)
	{
		System.out.println("Enter any number");
		a[i] = sc.nextInt();
	}
	System.out.println("Printing an array using for each");
	for(int element : a)
	{
		System.out.println(element);
	}
	}
}
