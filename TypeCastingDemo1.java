package com.simplilearn.basics;

public class TypeCastingDemo1 {
	public static void main(String[] args)
	{
		char a = 'c';
		System.out.println("Char is :- "+a);
		int i, d;
		i = a;
		System.out.println("Int is :- "+i);
		d = i+32;
		char b = (char) d;
		System.out.println("Updated value is :-"+'b');
		}
}
