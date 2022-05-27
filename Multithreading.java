package com.simplilearn.basics;
class RunnableDemo implements Runnable
{
private Thread t;
private String threadName;
RunnableDemo(String name)
{
this.threadName = name;
System.out.println("Creating"+"\t" +threadName);
}
public void run()
{
System.out.println("Running"+"\t" +threadName);
try
{
for(int i = 4; i>0;i--)
{
System.out.println("Thread"+threadName + ","+i);	
Thread.sleep(50);
}
}
catch (InterruptedException ie)
{
System.out.println("Thread"+ threadName + "interrupted");	
}
System.out.println("Thread" + threadName + "Exiting");
}
public void start()
{
System.out.println("Starting"+threadName);
if(t == null)
{
t = new Thread(this, threadName);
t.start();
}
}
}
public class Multithreading
{
public static void main(String[] args)
{
RunnableDemo r1 = new RunnableDemo("Thread-1");
r1.start();
RunnableDemo r2 = new RunnableDemo("Thread-2");
r2.start();
}
}
