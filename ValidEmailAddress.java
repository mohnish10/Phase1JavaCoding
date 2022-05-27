package com.simplilearn.basics;
import java.util.*;
import java.util.regex.*;
public class ValidEmailAddress {
public static void main(String[] args)
{
String emailAddress;
Scanner sc = new Scanner(System.in);
System.out.println("Please enter the email address keeping the following things in mind");
System.out.println("There should be atleast 1 upper case character");
System.out.println("There should be atleast 1 integer involved");
emailAddress = sc.next();
String myPattern = "^[A-Za-z0-9+_.-]+@(.+)$";
Pattern pattern = Pattern.compile(myPattern);
Matcher match = pattern.matcher(emailAddress);
if(match.matches())
{
System.out.println("This is a valid email address");
System.out.println("Please enter the password");
}
else
{
System.out.println("This is not a valid email address");	
}
}
}
