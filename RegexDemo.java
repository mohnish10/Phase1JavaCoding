package com.simplilearn.basics;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class RegexDemo {
	public static void main(String[] args)
	{
	String myPattern = "[a-z0-9]+";
	String input ="sonam13";
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
