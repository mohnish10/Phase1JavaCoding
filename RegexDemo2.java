package com.simplilearn.basics;
import java.util.regex.*;
public class RegexDemo2 {
public static void main(String[] args)
{
String myPattern = "^(?=.*[A-Z]).{8}";
String input = "Sonam@123";
Pattern pattern = Pattern.compile(myPattern);
Matcher match = pattern.matcher(input);
if(match.matches())
{
System.out.println("Pattern matched");	
}
else
{
System.out.println("Pattern is not matched");	
}
}
}