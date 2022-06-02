package com.simplilearn.basics;
import java.io.*;
public class FileCreation {
public static void main(String[] args) throws IOException
{
File file = new File("D:\\files\\file4.txt");
if(file.createNewFile())
{
System.out.println("File created successfully");	
}
else
{
System.out.println("File already exist");	
}
}
}