package com.simplilearn.basics;
import java.io.*;
import java.util.*;
public class StringTokens {
public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
StringTokenizer str = new StringTokenizer(s);
int n = str.countTokens();
System.out.println(n);  
while(str.hasMoreElements())
{
System.out.println(str.nextElement());    
}
    }
    }
