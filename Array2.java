package com.simplilearn.basics;
import java.util.*;
public class Array2 {
	public static void main(String[] args)
	{
	int a[] = new int[5];
	int sum = 0;
	Scanner sc = new Scanner(System.in);
	for(int i = 0; i<a.length;i++)
	{
	System.out.println("Please enter the values");
	a[i] = sc.nextInt();
	}
for(int element : a)
{
System.out.println(element);	
}
}
}