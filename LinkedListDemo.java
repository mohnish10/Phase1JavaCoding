package com.simplilearn.basics;
import java.util.*;
public class LinkedListDemo {
public static void main(String[] args)
{
LinkedList<String>list = new LinkedList<String>();
list.add("Mohnish");
list.add("Amol");
list.add("Harshad");
list.add("Umesh");
list.add("Alka mam");
list.add("Avi Kulkarni");
System.out.println("The list elements are :- "+list);
list.add(6, "Yogesh Ghadge");
list.element();
System.out.println("The updated list elements is :- "+list);
list.remove(4);
list.remove(3);
System.out.println("List after removal of the elements is :- "+list);
System.out.println("The list size is :-"+list.size());
Iterator<String>it = list.iterator();
while(it.hasNext())
{
System.out.println(it.next());
it.remove();
}
System.out.println("The final list after  all these operations is :-"+list);
}
}

