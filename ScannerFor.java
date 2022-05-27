package com.simplilearn.basics;
import java.util.*;
public class ScannerFor {
	public static void main(String[] args)
	{
		int a[] = new int [5];
		Scanner sc = new Scanner(System.in);
	for(int i = 0; i<a.length;i++)
	{
		System.out.println("Please enter the value :-");
		a[i] = sc.nextInt();
	}
		System.out.println("Printing an array using for each");
		for(int element : a)
		{
		System.out.println(element);	
		}
}
}