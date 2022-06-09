package com.simplilearn.basics;
import java.util.*;
public class SubArray {
public static void main(String[] args)
{
int count = 0;
int i,j;
Scanner sc = new Scanner(System.in);
System.out.println("Please enter the size of the array");
int n = sc.nextInt();
int a[] = new int[n];
System.out.println("Please enter the elements");
for(i=0;i<n;i++)
{
a[i] = sc.nextInt();	
}
for(i = 0; i<n;i++)
{
System.out.print(a[i] + " ");	
}
for(i = 0;i<n;i++)
{
int sum = 0;
for(j = i;j<n;j++)
{
sum += a[j];
if(sum<0)
{	
count++;	
}
}
}
System.out.println("Count of the negative subarray is :-" +count);
}
}
