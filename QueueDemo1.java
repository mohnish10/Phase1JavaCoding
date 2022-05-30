package com.simplilearn.basics;
import java.util.*;
public class QueueDemo1 {
	public static void main(String[] args)
	{
Queue<Integer> q = new PriorityQueue<Integer>();
q.add(10);
q.add(20);
q.add(30);
System.out.println(q);
System.out.println(q.peek());
q.poll();
System.out.println(q);
q.poll();
System.out.println(q);
q.poll();
System.out.println(q);
}
}