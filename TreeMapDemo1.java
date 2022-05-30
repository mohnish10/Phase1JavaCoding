package com.simplilearn.basics;
import java.util.*;
public class TreeMapDemo1 {
public static void main(String[] args)
{
Map<String,String> map = new TreeMap<String, String>();
map.put("b","Sonam");
map.put("z","Vijay");
map.put("y","Ravi");
map.put("a","NiaKelley");
System.out.println(map);
System.out.println("Contains key?"+map.containsKey("a"));
System.out.println(map.size());
System.out.println("Get value of key b - "+map.get("b"));
map.remove("z");
System.out.println(map);
map.clear();
System.out.println(map);
}
}
