package com.simplilearn.basics;
import java.util.*;
import java.nio.*;
import java.nio.charset.StandardCharsets;
import java.io.*;
import java.nio.file.Paths;
import java.nio.file.Files;
public class ReadingFileUsingNio {
public static void main(String[] args)
{
List<String>list = Collections.emptyList();
try
{
list = Files.readAllLines(Paths.get("D:\\files\\file4.txt"),StandardCharsets.UTF_8);
Iterator<String>it = list.iterator();
while(it.hasNext())
{
System.out.println(it.next());	
}
}
catch(Exception e)
{
e.printStackTrace();	
}
}
}
