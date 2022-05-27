package com.simplilearn.basics;
import java.util.*;
public class SimpleScannerUsage {	
	    public static void main(String[] args) {
	        int a,b;
	        long c;
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Please enter the value of a");
	        a = sc.nextInt();
	        System.out.println("Please enter the value of b");
	        b = sc.nextInt();
	        System.out.println("Please enter the value of c");
	        c = sc.nextLong();
	        System.out.println(a);
	        System.out.println(b);
	        System.out.println(c);        
	    }
	}
