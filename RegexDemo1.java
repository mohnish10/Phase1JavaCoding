package com.simplilearn.basics;
import java.util.regex.*;
public class RegexDemo1 {
	public static void main(String[] args)
	{
String myPattern = "[987]{3}{0-9}{7}";
String input = "9985678686";
Pattern pattern = Pattern.compile(input);
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