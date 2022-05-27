package com.simplilearn.basics;
import java.util.*;
public class AccessLinkedList {
public static void main(String[] args)
{
	LinkedList <String> lang = new LinkedList<>();
	lang.add("Python");
	lang.add("Java");
	lang.add("HTML");
	System.out.println("Elements of the LinkedList are :"+lang);
	String str = lang.get(1);
	System.out.println("Element at Index 1 is :"+str);
}
}
