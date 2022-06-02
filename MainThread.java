package com.simplilearn.basics;
public class MainThread implements Runnable{
public static int count = 0;
public void run()
{
while(MainThread.count<=10)
{
try
{
System.out.println(Thread.currentThread().getName()+" "+(MainThread.count++));
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
MainThread obj1 = new MainThread();
Thread t1 = new Thread(obj1);
t1.setName("Thread1");
t1.start();

MainThread obj2 = new MainThread();
Thread t2 = new Thread(obj2);
t2.setName("Thread2");
t2.start();

while(MainThread.count<=10)
{
try
{
System.out.println("Main Thread:"+(MainThread.count++));
Thread.sleep(1000);
}
catch(Exception e)
{
e.printStackTrace();	
}
}
System.out.println("Main Thread completed");
}
}
