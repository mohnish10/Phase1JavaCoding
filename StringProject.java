package com.simplilearn.basics;
import java.util.*;
public class StringProject {
public static void main(String[] args)
{
String email;	
String a[] = {"mohnishpwr10@gmail.com","mohnishp@blueplanetinfosolutions.com","vishwasenggwrks@rediff.com","jyotithecaringmother@gmail.com"};
ArrayList<String> alist = new ArrayList<>(Arrays.asList(a));
Scanner sc = new Scanner(System.in);
System.out.println("Please enter the value of the email");
email = sc.next();
if(alist.contains(email))
{
System.out.println("Valid email");	
}
else
{
	System.out.println("Please enter the valid email");		
}
}
}

