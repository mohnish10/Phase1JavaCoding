package com.simplilearn.basics;
import java.util.*;
public class QueueDemo3 {
public static void main(String[] args)
{
Queue<Integer>q = new PriorityQueue<Integer>();
q.add(3);
q.add(5);
q.add(7);
q.add(1);
q.add(9);
System.out.println(q);
System.out.println(q.size()+"-"+q);
System.out.println(q.size()+"-"+q.poll());
System.out.println(q.size()+"-"+q);
}
}
