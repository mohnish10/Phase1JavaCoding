package com.simplilearn.basics;
import java.util.*;
class Dog implements Comparator<Dog>, Comparable<Dog> 
{
private String name;
private int age;
Dog()
{
}
Dog(String n, int a)
{
this.name = n;
this.age = a;
}
public String getDogName()
{
return name;	
}
public int getDogAge()
{
return age;	
}
public int compareTo(Dog d)
{
return (this.name).compareTo(d.name);	
}
public int compare(Dog d, Dog d1)
{
return d.age - d1.age;	
}
}
public class ComparatorExample {
public static void main(String[] args)
{
List<Dog> list = new ArrayList<Dog>();
list.add(new Dog("Shaggy",3));
list.add(new Dog("Lacy",2));
list.add(new Dog("Roger",10));
list.add(new Dog("Tommy",4));
list.add(new Dog("Tammy",1));
Collections.sort(list);
for(Dog a: list)
System.out.print(a.getDogName()+ ",");
Collections.sort(list, new Dog());
System.out.println("");
for(Dog a: list)
System.out.print(a.getDogName()+ ":"+a.getDogAge()+",");	
}
}
