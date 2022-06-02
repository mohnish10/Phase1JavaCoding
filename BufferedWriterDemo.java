package com.simplilearn.basics;
import java.io.*;
public class BufferedWriterDemo {
public static void main(String[] args) throws Exception
{
BufferedWriter writer = new BufferedWriter(new FileWriter("D:\\files\\file5.txt",true));
writer.write("My name is Sonam");
System.out.println(" Data Written ");
writer.close();
}
}
