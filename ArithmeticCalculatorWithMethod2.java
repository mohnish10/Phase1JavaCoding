package com.simplilearn.basics;
import java.util.*;
public class ArithmeticCalculatorWithMethod2 {
public int add(int a, int b)
{
return a+b;	
}
public int sub(int a, int b)
{
	return a-b;
}
public int div(int a, int b)
{
	return a/b;
}
public int mult(int a, int b)
{
return a*b;	
}
public static void main(String[] args)
{
ArithmeticCalculatorWithMethod2 ac = new ArithmeticCalculatorWithMethod2();	
int value1, value2, value3;	
Scanner sc = new Scanner(System.in);
System.out.println("Please enter the value of the first number");
value1 = sc.nextInt();
System.out.println("Please enter the value of the second number");
value2 = sc.nextInt();
System.out.println("Please choose the operation which you want to perform");
System.out.println("1. Addition");
System.out.println("2. Subtraction");
System.out.println("3. Division");
System.out.println("4. Multiplication");
value3 = sc.nextInt();
switch(value3)
{
case 1: System.out.println("The addition is :-"+ac.add(value1, value2));
break;
case 2: System.out.println("The subtraction is :-"+ac.sub(value1, value2));
break;
case 3: System.out.println("The division is :-"+ac.div(value1, value2));
break;
case 4: System.out.println("The division is :-"+ac.mult(value1, value2));
break;
default: System.out.println("The multiplication is :" +ac.mult(value1, value2));
}
}
}

