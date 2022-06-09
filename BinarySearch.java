package com.simplilearn.basics;
public class BinarySearch {
public static void main(String[] args)
{
int []arr = {3,6,9,12,15};
int key = -2;
int n = arr.length;
binarySearch(arr,0,key,n);
}
public static void binarySearch(int[] arr, int lb, int key, int ub)
{
int midvalue = (lb+ub)/2;
while(lb<ub)
{
if(arr[midvalue]<key)
{
lb = midvalue+1;	
}
else if(arr[midvalue]==key)
{
System.out.println("Element is found at index:"+midvalue);
break;
}
else 
{
ub = midvalue-1;	
}
midvalue = (lb+ub)/2;
}
if(lb>=ub)
{
System.out.println("Element is not found");	
}
}
}
