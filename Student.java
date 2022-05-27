package com.simplilearn.basics;
public class Student
{
private int rollNo;
private String name;
private String address;
public Student()
{
	this.rollNo = rollNo;
	this.name = name;
	this.address = address;	
}
Student(int rollNo, String name, String address)
{
this.rollNo = rollNo;
this.name = name;
this.address = address;
}
public int getRollNo() {
	return rollNo;
}
public void setRollNo(int rollNo) {
	this.rollNo = rollNo;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
}
