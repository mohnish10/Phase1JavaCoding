package com.simplilearn.basics;
public class WaitAndSleepDemo {
private static Object obj = new Object(); 
public static void main(String[] args) throws InterruptedException
{
Thread.sleep(1000);
System.out.println(" Thread "+Thread.currentThread().getName()+"is"+" woke up after 1 sec ");
synchronized(obj)
{
obj.wait(2000);	
}
System.out.println(" Object "+obj+" has woke up after waiting for 1 sec ");
}
}
