package com.simplilearn.basics;
public class NotValidAgeException extends Exception{
public NotValidAgeException()
{
super("You are not allowed to vote");	
}
public NotValidAgeException(String message)
{
super(message);	
}
}
