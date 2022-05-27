package com.simplilearn.basics;

public class TypeCastingDemo {
	public static void main(String[] args)
	{
		// Implicit type casting starts
		System.out.println("Implicit type casting");
		byte b = 20;
		System.out.println("Byte value is :-"+b);
		short s = b;
		System.out.println("Short value is :-"+s);
		int i = s;
		System.out.println("Integer value is :-"+i);
		long l = i;
		System.out.println("Long value is :-"+l);
		float f = l;
		System.out.println("float value is :-"+f);
		double d = f;
		System.out.println("Double value is :-"+d);
		// Implicit type casting ends
		// Explicit type casting starts
		System.out.println("Explicit type casting");
		float n = 24.2f;
		int k;
		k = (int) n;
		System.out.println(k);
	}
}
