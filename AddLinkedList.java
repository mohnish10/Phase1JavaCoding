package com.simplilearn.basics;
import java.util.*;
public class AddLinkedList {
public static void main(String[] args)
{
	LinkedList <String> lt = new LinkedList<>();
	lt.add("Dog");
	lt.add("Cat");
	lt.add("Cow");
	System.out.println("LinkedList elements are :-"+lt);
	lt.add(1,"Horse");
	System.out.println("Updated LinkedList :- "+lt);
}
}
