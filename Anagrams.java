package com.simplilearn.basics;
import java.util.Arrays;
import java.util.*;
public class Anagrams 
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.println("Please enter the first string");
String s1 = sc.next();
System.out.println("Please enter the second string");
String s2 = sc.next();
String a = s1.toLowerCase();
String b = s2.toLowerCase();
if(a.length()==b.length())
{
char[] charArray1 = a.toCharArray();
char[] charArray2 = b.toCharArray();
Arrays.sort(charArray1);
Arrays.sort(charArray2);
boolean result = Arrays.equals(charArray1, charArray2);
if(result)
{
System.out.println(a + " and " + b + " are Anagram ");
}
else
{
System.out.println(a + " and " + b + " are not Anagrams ");	
}
}
else
{
System.out.println(a + " and " + b + " are not Anagram ");	
}
}
}
