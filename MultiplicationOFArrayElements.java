package com.simplilearn.basics;
public class MultiplicationOFArrayElements {
public static void main(String[] args)
{
int a[] = {1,2,3,4,5,6,7,8,9,10};
int mult = 1;
for(int i = 0; i<a.length;i++)
{
mult = mult*a[i];	
}
System.out.println("Multiplication of the elements is :-"+mult);
}
}
