package com.simplilearn.basics;
import java.util.*;
public class ChangeLinkedList {
	public static void main(String[] args)
	{		
	LinkedList <String> lang = new LinkedList<>();
	lang.add("Python");
	lang.add("Java");
	lang.add("JavaScript");
	lang.add("Java");
	System.out.println("Elements of the LinkedList are :"+lang);
	lang.set(3,"Kotlin");
	System.out.println("Updated LinkedList :"+lang);
}
}