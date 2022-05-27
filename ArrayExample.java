package com.simplilearn.basics;
public class ArrayExample {
	public static void main(String[] args)
	{
		int a[] = {1,2,3,4,5,6,7,8,9,10};
int i;
for(i=0;i<a.length;i++)
{
System.out.println(a[i]);	
}
System.out.println("The length of the array is :"+a.length);
System.out.println("Get element at the 4th index :"+a[4]);
}
}