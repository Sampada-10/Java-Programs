/*a) Write a program to accept n names of country and display them in descending
order*/

package com.assignment1;
import java.util.*;
public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("How many Strings You Want=");
		int n=sc.nextInt();
		String a[]=new String[n];
		System.out.println("Enter Strings=");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.next();
		}
		System.out.println("Display entered country");
		for(int i=0;i<n;i++)
		{
			System.out.println(" "+a[i]);
		}
		Arrays.sort(a);
		System.out.println("Display sorted country");
		for(int i=0;i<n;i++)
		{
			System.out.println(" "+a[i]);
		}
		sc.close();	
	}

}
