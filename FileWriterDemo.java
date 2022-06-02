package com.simplilearn.basics;
import java.io.*;
public class FileWriterDemo {
public static void main(String[] args) throws IOException
{
FileWriter writer = new FileWriter("D:\\files\\file5.txt");
String message = "Welcome to the world of file handling";
writer.write(message);
System.out.println("File written successfully");
}
}
