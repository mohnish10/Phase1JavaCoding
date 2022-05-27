package com.simplilearn.basics;
public class Employee {
	int emp_id;
	String name;
	String designation;
	Employee(int emp_id, String name, String designation)
	{
		this.emp_id = emp_id;
		this.name = name;
		this.designation = designation;
	}
public static void main(String[] args)
{
Employee e1 = new Employee(1000,"Mohnish","Quality Analyst");
Employee e2 = new Employee(1001,"Amol","Team coach");
Employee e3 = new Employee(1002,"Umesh","Operations Manager");
Employee e4  = new Employee(1004,"Alka","Director");
System.out.println(e1.emp_id + "\t" + e1.name + "\t" + e1.designation);
System.out.println(e2.emp_id + "\t" + e2.name + "\t" + e2.designation);
System.out.println(e3.emp_id + "\t" + e3.name + "\t" + e3.designation);
System.out.println(e4.emp_id + "\t" + e4.name + "\t" + e4.designation);
}
}
