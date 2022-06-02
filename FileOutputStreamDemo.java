package com.simplilearn.basics;
import java.io.*;
public class FileOutputStreamDemo {
public static void main(String[] args) throws IOException
{
FileOutputStream fos = new FileOutputStream("D:\\files\\file4.txt", true);
String message = "Good Morning everyone";
fos.write(message.getBytes());
System.out.println("Data written to file is :-");
fos.close();
}
}
