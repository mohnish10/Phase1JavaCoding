package com.simplilearn.basics;
import java.util.*;
public class HashTableDemo {
public static void main(String[] args)
{
Map<Integer,String>map = new Hashtable<Integer,String>();
map.put(2, "Sonam");
map.put(10,"Vijay");
map.put(1, "Ravi");
map.put(13,"NiaKelly");
System.out.println(map);
System.out.println("Contains key?"+map.containsKey(2));
System.out.println("Size of the map is -"+map.size());
System.out.println("Value of key 10 is - "+map.get(10));
System.out.println(map.remove(1));
System.out.println(map);
map.clear();
System.out.println(map);
}
}
