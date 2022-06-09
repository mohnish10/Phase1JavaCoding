package com.simplilearn.basics;
public class DLL {
Node head;
DLL()
{
head = null;	
}
class Node
{
int data;
Node prev;
Node next;
Node(int d)
{
data = d;	
}
}
public void push(int new_data)
{
Node new_Node = new Node(new_data);
new_Node.next = head;
new_Node.prev = null;
if(head!=null)
head.prev = new_Node;
head = new_Node;
}
public void InsertAfter(Node prev_Node, int new_data)
{
if(prev_Node==null)
{	
System.out.println("The given previous node cannot be null");
return;
}
Node new_Node = new Node(new_data);
new_Node.next = prev_Node.next;
prev_Node.next = new_Node;
new_Node.prev = prev_Node;
if(new_Node.next!=null)
new_Node.next.prev = new_Node;	
}
void append(int new_data)
{
Node new_Node = new Node(new_data);
new_Node.next = null;
Node last = head;
if(head == null)
{
new_Node.prev = null;
head = new_Node;
return;
}
while(last.next!=null)
last = last.next;
last.next = new_Node;
new_Node.prev = last;
}
public void printList(Node node)
{
Node last = null;
System.out.println("Traversal in forward direction");
while(node!=null)
{
System.out.println(node.data+"");
last = node;
node = node.next;
}
System.out.println();
System.out.println("Traveral in reverse direction");
while(last!=null)
{
System.out.print(last.data+"");
last = last.prev;
}
}
public static void main(String[] args)
{
DLL dll = new DLL();
dll.append(6);
dll.push(7);
dll.push(1);
dll.append(4);
dll.InsertAfter(dll.head.next,8);
System.out.println("Created DLL is");
dll.printList(dll.head);
}
}
