package com.simplilearn.basics;
import java.nio.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.io.*;
import java.util.*;
public class WritingFileUsingNio {
public static void main(String[] args) throws Exception
{
Path path = Paths.get("D:\\files\\file3.txt");
String message = "Hello World";
Files.write(path, message.getBytes(), StandardOpenOption.CREATE);
System.out.println("Data written");
ArrayList<String>list = new ArrayList<String>();
list.add("this is line 3");
list.add("this is line 4");
Files.write(Paths.get("D:\\files\\file3.txt"), list, StandardOpenOption.CREATE,StandardOpenOption.APPEND);
System.out.println("Data written");
}
}
