package com.simplilearn.basics;
import java.util.*;
public class KthSmallestDemo {
public int KthSmallest(int array[], int k)
{
Arrays.sort(array);
return array[k-1];
}
	public static void main(String[] args) {
int nums[] = {10,2,9,16,5,0};
KthSmallestDemo obj = new KthSmallestDemo();
System.out.println(obj.KthSmallest(nums, 4));
}
}
