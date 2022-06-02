package com.simplilearn.basics;
import java.io.*;
public class BufferedReaderDemo {
public static void main(String[] args)
{
char[] array = new char[100];
try
{
FileReader file = new FileReader("D:\\files//file3.txt");
BufferedReader input = new BufferedReader(file);
input.read(array);
System.out.println("Data in the file is :-");
System.out.println(array);
input.close();
}
catch(IOException e)
{
e.getStackTrace();	
}
}
}
