package com.simplilearn.basics;
import java.util.*;
public class TreeMapDemo {
public static void main(String[] args)
{
Map<Integer, String>map = new TreeMap<Integer, String>();
map.put(2, "Sonam");
map.put(10, "Vijay");
map.put(1, "Ravi");
map.put(13, "NiaKelley");
System.out.println(map);
System.out.println("Contains key?"+map.containsKey(10));
System.out.println(map.size());
System.out.println("Get value of key 13 :-"+map.get(13));
System.out.println(map.remove(2));
System.out.println(map);
map.clear();
System.out.println(map);
}
}
