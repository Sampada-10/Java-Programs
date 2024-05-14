/*c) Write a menu driven program to perform the following operations
i. Calculate the volume of cylinder. (hint : Volume: π × r² × h)
ii. Find the factorial of given number.
iii. Check the number is Armstrong or not.
iv. Exit*/
package com.assignment1;

import java.util.Scanner;
public class Menudriven {
	Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Menudriven md=new Menudriven();
		while(true) {
		Scanner sc=new Scanner(System.in);
		System.out.println("_____Menu_____");
		System.out.println("1)Volume of cylinder\n2)Factorial\n3)Armstrong\n4)Exit");
	    System.out.println("Enter your choice: ");
	    int ch=sc.nextInt();
	    switch(ch)
	    {
	    case 1:
	    	System.out.println("Volume of Cylinder: "+(md.cylinder()));
	    	break;
	    case 2:
	    	System.out.println("enter no.: ");
	    	int n=sc.nextInt();
	    	double factorial=md.Factorial(n);
	    	System.out.println("factorial of"+n+"is: "+(factorial));
	    	break;
	    case 3:
	    	System.out.println("enter no.: ");
	    	int no=sc.nextInt();
	    	if(md.Armstrong(no))
	    		System.out.println("number is armstrong");
	    	else
	    		System.out.println("number is not armstrong");
	    	break;
	    case 4:
	    	System.exit(0);
	    	break;
	    default: 
	    	System.out.println(" Plz enter valid choice");
	    	sc.close();
	     }
	    
		}
	}
	
	double cylinder() {
		double Pi=3.14,r,h;
		System.out.println("enter radius: ");
		r=sc.nextDouble();
		System.out.println("enter height: ");
		h=sc.nextDouble();
		double volume=Pi*r*r*h;
		return (volume);
	}
    double Factorial(int n) {
		double i=1,sum=1;
		while(i<=n) {
			sum*=i;
			i++;
		}
		return sum;
	}
	boolean Armstrong(int no) {
		 int t,ld=0,count=0,sum=0;
		 t=no;
		 while(t>0) {
			 t/=10;
			 count++;
		 }
		 t=no;
		 while(t>0) {
			 ld=t%10;
			 sum+=(Math.pow(ld,count));
			 t/=10;
		 }
		 if(no==sum)
		   return true;
		 else
		   return false;
	}


}
