package com.simplilearn.basics;
import java.util.*;
public class MultiDimensionalArray3 {
	public static void main(String[] args)
	{
int a[][] = new int[3][3];
Scanner sc = new Scanner(System.in);
for(int i = 0;i<a.length;i++)
{
for(int j= 0;j<a[i].length;j++)
{
System.out.println("Please enter the values");
a[i][j] = sc.nextInt();
}
}
System.out.println("The elements of the array are");	
for(int i = 0;i<a.length;i++)
{
for(int j= 0;j<a[i].length;j++)
{
System.out.print(a[i][j] + "\t");
}
System.out.println();
}
}
}