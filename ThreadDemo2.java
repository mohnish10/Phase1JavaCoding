package com.simplilearn.basics;
public class ThreadDemo2 implements Runnable{
public void run()
{
for(int i = 0;i<5;i++)
{
System.out.println(Thread.currentThread().getName()+" "+i);	
try
{
Thread.sleep(1000);	
}
catch(Exception e)
{
e.printStackTrace();	
}
}
}
public static void main(String[] args)
{
Runnable obj1 = new ThreadDemo2();
Runnable obj2 = new ThreadDemo2();
Thread t1 = new Thread(obj1);
Thread t2 = new Thread(obj2);
t1.setName("one");
t2.setName("two");
t1.start();
t2.start();
}
}