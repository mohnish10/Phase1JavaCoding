package com.simplilearn.basics;
public class CommandLineArgumentsDemo {
public static void main(String[] args)
{
try
{
int sum = 0;	
for(int i = 0;i<args.length;i++)
{
sum = sum + Integer.parseInt(args[i]);
}
System.out.println("Sum is :-"+sum);
}
catch(Exception e)
{
System.out.println("Exception occured, one of the command" + "line argument is not a number");
System.out.println(e.getMessage());
e.printStackTrace();
}
}
}