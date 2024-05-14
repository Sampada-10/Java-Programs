/*d) Write a program to accept the array element and display in reverse order.*/
package com.assignment1;
import java.util.*;
public class ReverseArray {
	Scanner sc=new Scanner(System.in);
	void accept(int array[]) {
		System.out.println("Enter array elements: ");
		for(int i=0;i<array.length;i++) {
			array[i]=sc.nextInt();
		}
	}
	void display(int array[]) {
		System.out.println("Entered array: ");
		for(int i=0;i<array.length;i++) {
			System.out.println(" "+array[i]);
		}
	}
	void reverseorder(int array[]) {
		System.out.println("Reverse order array Elements: ");
		for(int i=array.length-1;i>=0;i--) {
			System.out.println(" "+array[i]);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		ReverseArray a=new ReverseArray();
		System.out.println("How many elements you want in Array: ");
		int n=sc.nextInt();
		int array[]=new int[n];
		a.accept(array);
		a.display(array);
		a.reverseorder(array);
	sc.close();
	}

}
