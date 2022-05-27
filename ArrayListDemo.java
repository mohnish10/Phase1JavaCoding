package com.simplilearn.basics;
import java.util.*;
public class ArrayListDemo {
public static void main(String[] args)
{
ArrayList<Integer>list = new ArrayList<Integer>();
list.add(100);
list.add(200);
list.add(300);
list.add(400);
list.add(500);
list.add(600);
System.out.println("The list elements are :-"+list);
list.add(2, 700);
list.remove(4);
System.out.println("Current list elements are :-"+list);
System.out.println("The size of the list is - "+list.size());
Iterator<Integer>it = list.iterator();
while(it.hasNext())
{
System.out.println(it.next());	
}
System.out.println("The current list after all the operations is :-"+list);
}
}
