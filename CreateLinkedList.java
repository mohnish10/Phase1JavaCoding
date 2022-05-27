package com.simplilearn.basics;

import java.util.LinkedList;

public class CreateLinkedList {
	public static void main(String[] args)
	{
		LinkedList<String> animals = new LinkedList<>();
		animals.add("Dog");
		animals.add("Cat");
		animals.add("Cow");
		System.out.println("LinkedList elements are :"+animals);
	}
}
