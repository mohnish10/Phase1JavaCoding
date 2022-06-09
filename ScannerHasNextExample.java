package com.simplilearn.basics;
import java.util.*;
public class ScannerHasNextExample {
public static void main(String[] args)
{
Scanner sc = new Scanner("Hello World");
while(sc.hasNext())
{
System.out.println(sc.next());
}
sc.close();
}
}