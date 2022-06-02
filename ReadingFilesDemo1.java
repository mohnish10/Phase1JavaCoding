package com.simplilearn.basics;
import java.io.*;
public class ReadingFilesDemo1 {
public static void main(String[] args)
{
FileReader reader = null;
try
{
File file = new File("D:\\files\\file3.txt");
reader = new FileReader(file);
char[] array = new char[(int) file.length()]; 
reader.read(array);
String data = new String(array);
System.out.println("files Data"+"\t"+data);
}
catch(FileNotFoundException e)
{
e.printStackTrace();	
}
catch(IOException e)
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
