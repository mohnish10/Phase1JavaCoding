package com.simplilearn.basics;
import java.util.*;
public class StackSearchMethodExample {
	public static void main(String[] args)
	{
		Stack <String> stk = new Stack<>();
		stk.push("Asus");
		stk.push("HP");
		stk.push("Dell");
		stk.push("Lenovo");
		System.out.println("Stack : "+stk);
		int a = stk.search("HP");
		System.out.println("Location of HP is :"+a);
	}

}
