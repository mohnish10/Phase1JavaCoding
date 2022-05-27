package com.simplilearn.basics;
import java.util.*;
public class VectorDemo {
public static void main(String[] args)
{
Vector<Integer>list = new Vector<Integer>();
list.add(10);
list.add(20);
list.add(30);
list.add(40);
list.add(50);
System.out.println("The list elements are :- "+list);
list.remove(2);
list.remove(3);
System.out.println("The updated list is :- "+list);
System.out.println("Size of the list is :-"+list.size());
Iterator<Integer>it = list.iterator();
while(it.hasNext())
{
System.out.println(it.next());	
}
}
}
