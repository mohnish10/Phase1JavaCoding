package com.simplilearn.basics;
import java.util.*;
import java.io.*;
public class LockedMePrototypeCopy{
public static void main(String[] args) throws IOException
{
Scanner sc = new Scanner(System.in);
while(true) // Loop for the operations to repeat unless someone opts out of it
{	
System.out.println("Welcome to LockedMe");
System.out.println("Name :- Mohnish Pawar" + "\n" + "Email :- mohnishpwr10@gmail.com" + "\n" + "Mobile No :- 9960393318");
System.out.println("Please find the operations which can be done below");
System.out.println("0. Sort" + "\n" + "1. Add a file" + "\n" + "2. Delete a file" + "\n" + "3. Search a file" + "\n" + "4. Go Back to the main menu" + "\n" + "5. Exit the application");
System.out.println("Please enter the option (Integer only please) to choose the operation to be done");
int option = sc.nextInt(); // Take input from user only in integers 
switch(option) // Menu to select which option to choose
{
case 0 : sort();
break;
case 1 : System.out.println("Please enter the name of the file which you want to add");
add();
break;
case 2 : System.out.println("enter file name:");
String s1 = sc.next();
delete(s1);
break;
case 3: System.out.println("enter file name:");
String s2=sc.next();
int r=search(s2);
if(r==1)
System.out.println("File Found");
else
System.out.println("File Not found");
break;
case 4: System.out.println("Returned to main menu");
break;
case 5 : System.exit(0); // Exit the application
break;
default : System.out.println("You have chosen an incorrect option" + "\n" + "Please choose the correct option"); // Urge the user to enter the choice as mentioned by the menu only
break;
}
}
}


private static void sort() // function for sorting the files and displaying the file names in the ascending order
{
File file=new File("D:\\Phase 1\\LockedMe\\");
String[] files = file.list();
Arrays.asList(files); 
Arrays.sort(files); // sort the files in ascending order 
System.out.println("The Sorted files are:");
for(String i:files) // loop for printing the sorted files 
System.out.print(i+" ");
System.out.println();
}


private static void add() throws IOException // function is complete
{
Scanner sc = new Scanner(System.in);	
String fileName = sc.next();
fileName = fileName + ".txt";
String path = "D:" + File.separator + "Phase 1" + File.separator + "LockedMe" + File.separator + fileName; // setting the path for the file to get saved there
File file = new File(path);
if(file.createNewFile())
{
System.out.println("File created successfully");	
}
else
{
System.out.println("File already exists");	
}
}


private static void delete(String fileName) throws IOException 
{
File file = new File("D:\\Phase 1\\LockedMe\\"+fileName);
int k = search(fileName);
if(k==1)
{
file.delete();	
System.out.println(file.getName() + "deleted successfully" );	
}
else
{
System.out.println(file.getName() + "not found");	
}
}	
	

	
	
	
	
	
	
private static int search(String fileName) throws IOException // function is complete
{
File file = new File("D:\\Phase 1\\LockedMe\\");
String[] files = file.list();
for(int i  = 0; i < files.length;i++) //loop the array to check if the file is present
{
if(files[i].equals(fileName))
return 1;
}
return 0;
}
}




