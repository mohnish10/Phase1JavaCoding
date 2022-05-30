package com.simplilearn.basics;
import java.util.*;
public class TreeSetDemo {
public static void main(String[] args)
{
Set<Integer>set = new TreeSet<Integer>();
set.add(100);
set.add(50);
set.add(200);
set.add(25);
System.out.println("Set elements are :- "+set);
System.out.println("Size of the list is :-"+set.size());
set.remove(100);
System.out.println("Set elements after removal are :- "+set);
System.out.println("Size of the updated list is :-"+set.size());
}
}
