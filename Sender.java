package com.simplilearn.basics;
public class Sender {
public void sendMessage(String name, String message)
{
System.out.println(name+ " is sending message "+message);
try
{
Thread.sleep(1000);	
}
catch(Exception e)
{
e.printStackTrace();	
}
System.out.println(name+ " Message sent successfully ");
}
}
