package com.simplilearn.basics;
class Bank
	{
		float getRateOfInterest()
		{
			return 0;
		}
	}
	class Sbi extends Bank
	{
		float getRateOfInterest()
		{
			return 9.4f;
		}
	}
class Icici extends Bank
{
	float getRateOfInterest()
	{
		return 9.8f;
		}
}
class PolymorphismTest {
public static void main(String[] args)
{
Bank b;	
b = new Sbi();
System.out.println("Roi of sbi is : " +b.getRateOfInterest());
b = new Icici();
System.out.println("Roi of icici is : " +b.getRateOfInterest());
}
}
