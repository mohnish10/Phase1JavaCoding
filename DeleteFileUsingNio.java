package com.simplilearn.basics;
import java.io.IOException;
import java.nio.file.*;
import java.util.*;
public class DeleteFileUsingNio {
public static void main(String[] args) throws Exception
{
try
{
if(Files.deleteIfExists(Paths.get("D:\\files\\file3.txt")))
{
System.out.println("File has been deleted");	
}
else
{
System.out.println("No such file exists");
}
}
catch(NoSuchFileException e)
{
System.out.println("No such file available"+e.getMessage());	
}
catch(DirectoryNotEmptyException e)
{
System.out.println("Directory is not empty exception"+e.getMessage());	
}
catch(IOException e)
{
e.printStackTrace();	
}
}
}
