package com.simplilearn.basics;
import java.util.*;
public class ArrayOfSum {
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.println("Please enter the length of the expected array");
int n = sc.nextInt();
int a[] = new int[n];
int sum = 0;
System.out.println("Please enter the number of elements");
for(int i = 0;i<a.length;i++)
{
a[i] = sc.nextInt();	
}
for(int i = 0; i<a.length;i++)
{
sum+=a[i];	
}
System.out.println("Sum of the array elements is :-"+sum);
}
}
