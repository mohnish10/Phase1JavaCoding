package com.simplilearn.basics;
interface C
{
public void stayHome();	
}
interface D
{
public void stayHome();		
}
public class DiamondProblem implements C,D
{
	public void stayHome() {
System.out.println("I am working from home now");		
	}
public void test()
{
System.out.println("Personal method of DiamondProblem class");	
}
public static void main(String[] args)
{
DiamondProblem dp = new DiamondProblem();
dp.stayHome();
}
}