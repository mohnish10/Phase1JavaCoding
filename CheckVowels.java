package com.simplilearn.basics;
import java.util.Scanner;
public class CheckVowels {
	public static void main(String[] args)
	{
		char c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the character to check if it's a vowel or not");
		c = sc.next().charAt(0);
		if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
		{
			System.out.println("The entered character is a vowel");
		}
		else if(c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U')
		{
			System.out.println("The entered character is a vowel");
		}		
		else
		{
			System.out.println("The entered character is not a vowel");
		}
	}

}
