package com.simplilearn.basics;
import java.io.*;
public class FileReading2 {
public static void main(String[] args) throws IOException
{
FileInputStream reader = null;
try
{
reader = new FileInputStream("D:\\files\\file3.txt");
int x = 0;
while((x=reader.read())!=-1)
{
System.out.println((char)x);	
}
}
catch(FileNotFoundException e)
{
e.printStackTrace();	
}
finally
{
try
{
reader.close();	
}
catch(IOException e)
{
e.printStackTrace();	
}
}
}
}
