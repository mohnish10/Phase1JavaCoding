package com.simplilearn.basics;
import java.util.*;
public class HashSetDemo {
public static void main(String[] args)
{
Set<Integer> set = new HashSet<Integer>();
set.add(10);
set.add(20);
set.add(30);
set.add(90);
System.out.println(set);
set.remove(90);
System.out.println(set.size());
System.out.println("Set after the removal of element is :-"+set);
}
}
