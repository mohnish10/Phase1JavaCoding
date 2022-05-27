package com.simplilearn.basics;
interface A
{
public default void stayHome()
{
System.out.println("Staying at home now");	
}
}
interface B
{
public default void stayHome()
{
System.out.println("Staying at home and working now");	
}
}
public class DiamondProblem1 implements A,B{
public void stayHome()
{
System.out.println("Staying at Home and working now");	
}
public static void main(String[] args)
{
DiamondProblem1 dp = new DiamondProblem1();
dp.stayHome();
}
}
