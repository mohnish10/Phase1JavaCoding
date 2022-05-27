package com.simplilearn.basics;
import java.util.*;
public class DequeExample {
public static void main(String[] args)
{
Deque<String>deque = new ArrayDeque<String>();
deque.offer("arvind");
deque.offer("vimal");
deque.add("mukul");
deque.offerFirst("Jai");
System.out.println("After offerFirst traversal");
for(String s:deque)
{
System.out.println(s);	
}
deque.pollLast();
System.out.println("After pollLast traversal");
for(String s:deque)
{
System.out.println(s);	
}
}
}