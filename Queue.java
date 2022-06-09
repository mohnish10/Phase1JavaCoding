package com.simplilearn.basics;
public class Queue {
static class Node
{
int data;
Node next;
Node(int d)
{
data = d;
next = null;
}
}
Node front, rear;
public Queue()
{
front = rear = null;	
}
void enqueue(int info)
{
Node newNode = new Node(info);
if(rear == null)
front = rear = newNode;
rear.next = newNode;
rear = newNode;
}
void dequeue()
{
if(front == null)
System.out.println("There is nothing to delete now");
Node temp = front;
front = front.next;
System.out.println("Removed"+temp.data);
if(front==null)
rear = null;	
}
public static void main(String[] args)
{
Queue q = new Queue();
q.enqueue(10);
q.enqueue(20);
q.enqueue(30);
q.enqueue(5);
q.dequeue();
q.dequeue();
q.dequeue();
q.enqueue(40);
System.out.println(q.front.data);
System.out.println(q.rear.data);
}
}