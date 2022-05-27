package com.simplilearn.basics;
import java.util.Scanner;
public class ComparisionOFThreeNumbers {
	public static void main(String[] args)
	{
	int a,b,c;
	Scanner sc = new Scanner(System.in);
	System.out.println("Please enter  the first value :- ");
	a = sc.nextInt();
	System.out.println("Please enter the second value :-");
	b = sc.nextInt();
	System.out.println("Please enter the third value :-");
	c = sc.nextInt();
	if(a>b && a>c)
	{
			System.out.println("a is greatest amongst a,b and c");
		}
		else if (a<b && b<c)
		{
			System.out.println("c is greatest amongst a,b and c");
		}
		if(a<b && c<b)
	{	

			System.out.println("b is greatest amongst a,b and c");
	}
	}
	}
