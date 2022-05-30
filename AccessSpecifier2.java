package com.simplilearn.basics;
class PrivateAccessSpecifier
{
private void display()
{
System.out.println("You are using private access Specifier");	
}
}
public class AccessSpecifier2 {
public static void main(String[] args)
{
System.out.println("Private Access Specifier");
PrivateAccessSpecifier pas = new PrivateAccessSpecifier();
}
}