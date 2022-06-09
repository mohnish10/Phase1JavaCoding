package com.simplilearn.basics;
public class RotateArray {
public void rotate(int a[], int k)
{
if(k>a.length)
k = k%a.length;
int result[] = new int[a.length];
for(int i=0;i<k;i++)
{
result[i]=a[a.length-k+i];
}
int j =0;
for(int i = k;i<a.length;i++)
{
result[i]=a[j];
j++;
}
System.arraycopy(result, 0 , a, 0, a.length);
}
public static void main(String[] args)
{
RotateArray r = new RotateArray();
int arr[] = {1,2,3,4,5,6,7};
r.rotate(arr,15);
for(int i = 0;i<arr.length;i++)
{
System.out.println(arr[i]+"");	
}
}
}
