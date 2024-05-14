package com.assignment1;
import java.util.*;
public class Sort {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {2,7,8,4,9,10,1,6,5};
		System.out.println("Original array elements: ");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		Arrays.sort(a);
		System.out.println("\nSorted array elements: ");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println("\nSecond Smallest element in array is: "+a[1]);
	}

}
