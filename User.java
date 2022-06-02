package com.simplilearn.basics;
public class User extends Thread
{
private String name;
private String message;
public Sender res;
public User(Sender res, String name, String message)
{
this.res = res;
this.name = name;
this.message = message;
}
public void run()
{
synchronized(res)
{
res.sendMessage(name, message);	
}
}
}
