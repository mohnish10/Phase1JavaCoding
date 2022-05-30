package com.simplilearn.basics;
import java.io.*;
public class CheckedExceptionDemo {
public static void main(String[] args)
{
try
{
FileReader fileReader = new FileReader("D.//sonam//file.txt");
}
catch(FileNotFoundException e)
{
e.printStackTrace();	
}
}
}
