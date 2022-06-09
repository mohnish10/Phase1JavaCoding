package com.simplilearn.basics;
import java.util.*;
public class LinearSearch {
public static int linearing(int a[], int search)
{
int n = a.length;
for(int i = 0;i<a.length;i++)
{
if(a[i]==search)
{
return i;	
}
}
return -1;
}
public static void main(String[] args)
{
int[] arr = {10,20,30,40,50};
Scanner sc = new Scanner(System.in);
System.out.println("Enter the element to be searched");
int searchValue = sc.nextInt();
int result = linearing(arr, searchValue);
if(result == -1)
{	
System.out.println("Element is not present");
}
else
{
System.out.println("Element found at" + result + "and the search key is" +arr[result]);	
}
}
}
