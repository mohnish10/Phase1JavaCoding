package com.simplilearn.basics;
public class ConstructorDemo2
{
	int rollno;
	String name;
	int age;
	ConstructorDemo2(int rollno, String name, int age)
	{
	this.rollno = rollno;
    this.name = name;
    this.age = age;
	}
public static void main(String[] args)
{
	ConstructorDemo2 cd1 = new ConstructorDemo2(1,"Mohnish", 23);
	ConstructorDemo2 cd2 = new ConstructorDemo2(2,"Pavan", 24);
	ConstructorDemo2 cd3 = new ConstructorDemo2(3,"Manish", 42);
	ConstructorDemo2 cd4 = new ConstructorDemo2(3,"Supriya", 44);
	System.out.println(cd1.name + "\t"+ cd1.age + "\t" + cd1.rollno);
	System.out.println(cd2.name + "\t"+ cd2.age + "\t" + cd2.rollno);
    System.out.println(cd3.name + "\t"+ cd3.age + "\t" + cd3.rollno);
    System.out.println(cd4.name + "\t"+ cd4.age + "\t" + cd4.rollno);
}
}