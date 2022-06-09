package com.simplilearn.basics;
import java.util.*;
public class ArrayPrint {
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.println("Please enter the size of the array");
int n = sc.nextInt();
int a[] = new int[n];
System.out.println("Please enter the value of the elements");
for(int i = 0; i<n;i++)
{
a[i] = sc.nextInt();
}
for(int i = 0; i<n;i++)
{
System.out.println(a[i]);	
}
}
}
