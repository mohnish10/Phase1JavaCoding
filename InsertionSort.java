package com.simplilearn.basics;
public class InsertionSort {
void sort(int a[])
{
int n = a.length;
for(int i = 1; i<n; ++i)
{
int key = a[i];
int j = i-1;
while(j>=0 && a[j] > key)
{
a[j+1] = a[j];
j = j-1;
}
a[j+1] = key;
}
}
static void printArray(int a[])
{
for(int i = 0; i < a.length;i++)
{
System.out.print(a[i] + " ");
System.out.println();
}
}
public static void main(String[] args)
{
int a[] = {12,11,13,5,6};
InsertionSort obj = new InsertionSort();
obj.sort(a);
System.out.println("Sorted array is:-");
obj.printArray(a);
}
}
