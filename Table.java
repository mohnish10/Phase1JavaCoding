package com.simplilearn.basics;
import java.util.Scanner;
public class Table {
	public static void main(String[] args)
	{
		int n;
	Scanner sc = new Scanner(System.in);
	System.out.println("Please enter the value for which you want a table for");
	n = sc.nextInt();
	for(int i = 1; i <= 10;i++)
	{
     System.out.println(n*i);
	}
}
}