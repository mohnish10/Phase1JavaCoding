package com.simplilearn.basics;
import java.util.*;
public class QueueDemo2 {
public static void main(String[] args)
{
Deque<Integer>dq = new LinkedList<Integer>();
dq.add(10);
dq.add(20);
dq.add(30);
dq.add(null);
System.out.println(dq);
dq.addFirst(50);
System.out.println("After adding element deque is :- "+dq);
System.out.println(dq.removeLast());
System.out.println("deque after all operations is-"+dq);
}
}
