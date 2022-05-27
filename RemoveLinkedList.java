package com.simplilearn.basics;
import java.util.*;
public class RemoveLinkedList {
public static void main(String[] args)
{
	LinkedList <String> lang = new LinkedList<>();
	lang.add("English");
	lang.add("Marathi");
	lang.add("Hindi");
	lang.add("Spanish");
	System.out.println("Original LinkedList :- "+lang);
	String str = lang.remove(1);
	System.out.println("Updated  LinkedList :"+lang);
}
}
