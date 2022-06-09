package com.simplilearn.basics;
public class Stack {
static final int MAX = 1000;
int top;
int a[] = new int[MAX];
boolean isEmpty()
{
return top<0;	
}
Stack()
{
top = -1;	
}
boolean push(int x)
{
if(top>=(MAX-1))
{	
System.out.println("Stack overflow");
return false;
}
else
{
a[++top] = x;
System.out.println(x + "pushed into stack");
return true;
}
}
int pop()
{
if(top<0)
{	
System.out.println("Stack underflow");
return 0;
}
else
{
int x = a[top--];
return x;
}
}
public static void main(String[] args)
{
Stack st = new Stack();
st.push(100);
st.push(200);
st.push(300);
st.push(400);
System.out.println(st.pop() + "popped from stack");
}
}
