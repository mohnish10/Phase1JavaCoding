package com.simplilearn.basics;
public class TableWithArrayElements {
	public static void main(String[] args)
	{
		int num = 6;
		int a[] = {1,2,3,4,5,6,7,8,9,10};
		for(int i = 0; i<a.length;i++)
		{
		System.out.println(+(num*a[i]));
		}
	}
}
