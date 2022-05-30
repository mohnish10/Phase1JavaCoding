package com.simplilearn.basics;
import java.sql.*;
public class CheckedExceptionDemo2 {
public static void main(String[] args)
{
try
{
Class.forName("driver");
DriverManager.getConnection(null);
}
catch(ClassNotFoundException e)
{
e.printStackTrace();	
}
catch(SQLException e)
{
e.printStackTrace();	
}
catch(Exception e)
{
e.printStackTrace();
}
}
}
