package com.simplilearn.basics;
import java.util.*;
public class StackPeekMethodExample {
	public static void main(String[] args)
	{
	Stack <String> stk = new Stack<>();
	stk.push("Apple");
	stk.push("Mango");
	stk.push("Grapes");
	stk.push("Orange");
	System.out.println("Stack :" +stk);
	String fruits = stk.peek();
	System.out.println("Element at top : "+fruits);
	}
}
