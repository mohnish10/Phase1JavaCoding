package com.simplilearn.basics;
import java.util.*;
public class QueueOperations {
public static void main(String[] args)
{
	Queue <Integer> que = new LinkedList<>();
	que.add(10);
	que.add(20);
	que.add(30);
	que.add(40);
	que.add(50);
	System.out.println("Elements of a queue are :"+que);
	System.out.println("Element removed from the queue is :" +que.remove());
	System.out.println("Head of the queue is : "+que.element());
	System.out.println("poll() : Returned head of the queue is : "+que.poll());
	System.out.println("peek() : Head of the queue is :" +que.peek());
	System.out.println("Final queue is :"+que);
	}
}
