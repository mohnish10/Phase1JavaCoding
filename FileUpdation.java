package com.simplilearn.basics;
import java.io.*;
public class FileUpdation {
public static void modifyFile(String filename, String oldString, String newString)
{
File fileToModify = new File(filename);
String oldContent = "";
BufferedReader reader = null;
FileWriter writer = null;
try
{
reader = new BufferedReader(new FileReader(fileToModify));
String line = reader.readLine();
while(line!=null)
{
oldContent = oldContent+line+System.lineSeparator();
line = reader.readLine();
}
String newContent = oldContent.replace(oldString, newString);
writer = new FileWriter(fileToModify);
writer.write(newContent);
System.out.println("File updated successfully");
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
writer.close();
}
catch(Exception e)
{
e.printStackTrace();	
}
}
}
public static void main(String[] args)
{
modifyFile("D:\\files\\file5.txt","line","record");	
}
}

