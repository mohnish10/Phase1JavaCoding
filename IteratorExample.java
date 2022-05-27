package com.simplilearn.basics;
import java.util.*;
import java.io.*;
public class IteratorExample {
public static void main(String[] args)
{
ArrayList<String> cityNames= new ArrayList<String>();
cityNames.add("Delhi");
cityNames.add("Mumbai");
cityNames.add("Chandigarh");
cityNames.add("Kolkata");
cityNames.add("Noida");
Iterator i = cityNames.iterator();
System.out.println("cityNames elements");
while(i.hasNext())
{
System.out.print(i.next()+"\t");	
}
}
}