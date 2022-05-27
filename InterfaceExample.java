package com.simplilearn.basics;
interface Animal
{
public void Animalsound();
public void sleep();
}
class Pig implements Animal
{
public void Animalsound()
{
System.out.println("The pig grunts");	
}
public void sleep()
{
System.out.println("The pig is sleeping");	
}
}
public class InterfaceExample {
public static void main(String[] args)
{
Animal a = new Pig();
a.Animalsound();
a.sleep();
}
}
