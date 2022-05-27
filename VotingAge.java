package com.simplilearn.basics;
import java.util.*;
public class VotingAge {
	public static void main(String[] args)
	{
		int age;
		System.out.println("Please enter the value of age is ");
		Scanner sc = new Scanner(System.in);
		age = sc.nextInt();
		if(age>=18)
		{
			System.out.println("You are eligible for voting");
		}
		else
		{
			System.out.println("You are not eligible for voting");
		}
		
	}

}
