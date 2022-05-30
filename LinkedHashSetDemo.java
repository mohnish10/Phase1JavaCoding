package com.simplilearn.basics;
import java.util.*;
public class LinkedHashSetDemo {
	public static void main(String[] args)
	{
Set<Integer>set = new LinkedHashSet<Integer>();
set.add(10);
set.add(20);
set.add(30);
set.add(90);
System.out.println(set);
System.out.println("Size of set is -"+set.size());
set.remove(20);
System.out.println("Set after removal of 1 element is :- "+set + "\t"+ "\n" + "New size of the set is :-"+set.size());
	}
}
