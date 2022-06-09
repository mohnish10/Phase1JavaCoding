package com.simplilearn.basics;
import java.util.*;
public class AdditionOfTwoMatrices {
public static void main(String[] args)
{
int r1 = 2, c1 = 2, r2 = 2, c2 = 2;
int a[][] = {{2,3},{4,5}};
int b[][] = {{6,7},{8,9}};
int c[][] = new int[2][2];
int i,j;
for(i = 0; i<a.length;i++)
{
for(j = 0;j<b.length;j++)
{
c[i][j] = a [i] [j] + b [i] [j];
System.out.println(c[i][j]+"");
}
System.out.println();
}
}
}

