package com.simplilearn.basics;
import  java.util.*;
public class PriorityQueue1 {
	public static void main(String[] args)
	{
PriorityQueue<Integer> numbers = new PriorityQueue<>();
numbers.add(4);
numbers.add(2);
System.out.println("Priority Queue :-"+numbers);
numbers.offer(1);
System.out.println("Updated priority queue :-"+numbers);
	}
}
