package com.simplilearn.basics;
public class College {
	public static void main(String[] args)
	{
	Student s1 = new Student();
	s1.setAddress("Germany");
	s1.setName("Mohnish");
	s1.setRollNo(23);
	System.out.println(s1.getAddress()+"\t"+s1.getName()+"\t"+s1.getRollNo());
	}
}
