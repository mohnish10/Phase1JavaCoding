package com.simplilearn.basics;
import java.io.*;
public class BufferedInputStreamDemo {
public static void main(String[] args)
{
try
{
FileInputStream file = new FileInputStream("D:\\files\\file3.txt");
BufferedInputStream input = new BufferedInputStream(file);
int i = input.read();
while(i!= -1)
{
System.out.println((char)i);
i = input.read();
}
input.close();
}
catch(IOException e)
{
e.getStackTrace();	
}
}
}