package com.simplilearn.basics;
public class MethodOverriding extends Base
{
public void mobile()
{
System.out.println("Using my own phone now");	
}
public static void main(String[] args)
{
MethodOverriding mo = new MethodOverriding();
mo.mobile();
Base b = new MethodOverriding();
b.mobile();
}
}
