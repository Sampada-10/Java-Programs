package com.assignment1;

import java.util.Scanner;
public class SecondSmallest 
{
	Scanner sc = new Scanner(System.in);
	public void accept(int []a,int n)
	{
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
	}
	public void Sort(int []a,int n) {
		for(int i=0;i<n-1;i++) {
			for(int j=i+1;j<n;j++) {
				if(a[i]>a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
	}
	public void display(int []a,int n)
	{
		for(int i=0;i<n;i++) {
			System.out.print(a[i]+" ");
		}
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		SecondSmallest s=new SecondSmallest();
		System.out.println("How many elements you want?\n");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter array elements: ");
		s.accept(a, n);
		s.display(a,n);
		System.out.println("\nSorted array elements: ");
		s.Sort(a, n);
		s.display(a,n);
		System.out.println("\nSecond Smallest element in array is: "+a[1]);
		sc.close();
	}
}
