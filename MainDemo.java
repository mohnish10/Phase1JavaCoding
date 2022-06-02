package com.simplilearn.basics;
public class MainDemo {
public static void main(String[] args)
{
Sender res = new Sender();
User u1 = new User(res,"Sonam","Good Morning");
User u2 = new User(res,"Mohnish","Hi");
u1.start();
u2.start();
}
}