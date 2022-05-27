package com.simplilearn.basics;
import java.util.*;
public class EmailMatch 
{
public static void main (String[] args)
{
	String enterEmailAddress;
	{
	String s1 = "mohnishpwr10@gmail.com";
	String s2 = "mohnishp@blueplanetinfosolutions.com";
	String s3 = "vishwasenggwrks@gmail.com";
	String s4 = "power2wintheworld@gmail.com";
	Scanner sc = new Scanner(System.in);
	System.out.println("Please enter the email address to login");
	enterEmailAddress = sc.next();
	if(enterEmailAddress.equals(s1) || enterEmailAddress.equals(s2))
	{
	System.out.println("Please enter the password");	
	}
	else if(enterEmailAddress.equals(s3) || enterEmailAddress.equals(s4))
	{
	System.out.println("Please enter the password");
	}
	else
		{
		System.out.println("Please enter the correct email address or check with your system admministrator for further details");	
	}
	}
	}
}
