package com.simplilearn.basics;
public class ThreadDemo extends Thread{
public void run()
{
System.out.println("Thread is running");	
}
public static void main(String[] args)
{
ThreadDemo t1 = new ThreadDemo();
ThreadDemo t2 = new ThreadDemo();
t1.start();
t2.start();
}
}
