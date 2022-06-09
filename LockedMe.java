package com.simplilearn.basics;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class LockedMe {

	public static void main(String[] args) throws IOException  {
		System.out.println("Welcome To Company Lockers LockedMe Application");
		System.out.println("Developer Name: Yaswanth Dande \nContact details:\nemail:yasu24122000@gmail.com\nMobile No:9999999999");
		System.out.println("User Interactions:");
		System.out.println("1.Add a file to existing directory list\n2.Delete a file from existing directory\n3.To Search a file in a directory \n4.Sort files in a directory\n");
		Scanner sc=new Scanner(System.in);
		while(true) 				
		{	System.out.println("-----#***Main Menu***#-----");
			System.out.println("A.Generic Features:\n 0.Arrange File Names in ascending order(Sort).\nB.Bussiness-level operations:\n 1.Add File\n 2.Delete File\n 3.Search File\n 4.Exit Main Menu\n 5.Exit Application\n");
			System.out.println("Enter your choice from the above options:");
			int choice=sc.nextInt();
			switch(choice)
			{
			case 0: sort();
					break;
					
			case 1: System.out.println("enter file name:");
					String s=sc.next();
					addFile(s);
					break;
					
			case 2:	System.out.println("enter file name:");
					String s1=sc.next();
					deleteFile(s1);
					break;

			case 3:System.out.println("enter file name:");
				String s2=sc.next();
				int r=searchFile(s2);
				if(r==1)
					System.out.println("File Found");
				else
					System.out.println("File Not found");
				break;
				
			case 4:System.out.println("Returned to Main Menu");
					break;	
					
			case 5:System.exit(0);
					break;
					
			default:System.out.println("Wrong choice!!! Please select the listed choices");
					break;
			}
		}
			
		}
	
	
	private static void addFile(String st)
	{
		File fi=new File("D:\\FullStackJava\\LockedMe\\"+st);
		try 
		{
			if(fi.createNewFile())
				System.out.println("File created with name:"+st);
			else
				System.out.println("File already exists");
		} 
		catch (IOException e) {}
	}
	
	private static void deleteFile(String st) 
	{
		File f=new File("D:\\FullStackJava\\LockedMe\\"+st);
		int k=searchFile(st);
		if(k==1)
			{
			f.delete();
			System.out.println("File deleted with name: "+st+"\n");
			}
		else
			System.out.println("File not exists\n");	
	}
	
	private static int searchFile(String st) 
	{
		File fi=new File("D:\\FullStackJava\\LockedMe\\"+st);
		String[] files = fi.list();
		for(String a : files)
		{
			if(a.equals(st))
		            return 1;
		}
		return 0;
	}
	
	private static void sort() 
	{
		File fi=new File("D:\\FullStackJava\\LockedMe\\");
		String[] files = fi.list();
		Arrays.asList(files);
		Arrays.sort(files);
		System.out.println("The Sorted files are:");
		for(String i:files)
			System.out.print(i+" ");
		System.out.println();
	}
	
}
