package com.assignment1;

import java.util.*;
public class mathoperation {
		int i,j,r1,c1,r2,c2;
		Scanner sc=new Scanner(System.in);
		void getdata(int a[][],int b[][],int r1,int c1) {
			
			System.out.print("Enter matrix value: ");
			for(i=0;i<r1;i++) {
				for(j=0;j<c1;j++) {
					a[i][j]=sc.nextInt();
				}
			}
		}
			
		void putdata(int a[][],int b[][],int r1,int c1) {
			for(i=0;i<r1;i++) {
				for(j=0;j<c1;j++) {
					System.out.print(" "+a[i][j]+" ");
				}
				System.out.print("\n");
			}
		}
		void addition(int a[][],int b[][],int c[][]) {
		    if(r1==r2 && c1==c2){
		    	for(i=0;i<r2;i++) {
					for(j=0;j<c2;j++) {
						c[i][j]=a[i][j]+b[i][j];
						System.out.print(" "+c[i][j]+" ");
					}
					System.out.println("\n");
				} 
		    }
		}
		void subtraction(int a[][],int b[][],int c[][]) {
			if(r1==r2 && c1==c2){
		    	for(i=0;i<r2;i++) {
					for(j=0;j<c2;j++) {
						c[i][j]=a[i][j]-b[i][j];
						System.out.print(" "+c[i][j]+" ");
					}
					System.out.println("\n");
				} 
		    }
		}
		void multiplication(int a[][],int b[][],int c[][]) {
			if(c1==r2) {
				for(i=0;i<r2;i++) {
					for(j=0;j<c1;j++) {
						c[i][j]=a[i][j]*b[i][j];
						System.out.print(" "+c[i][j]+" ");
					}
					System.out.println("\n");
				} 
			}
		}
		public static void main(String[] args) {
			int r1,c1,r2,c2,ch;
			Scanner sc=new Scanner(System.in);
			mathoperation m=new mathoperation();
	        int a[][]=new int[15][15];
	        int b[][]=new int[15][15];
	        int c[][]=new int[15][15];
			System.out.println("Enter no.of rows for 1st Matrix: ");
			r1=sc.nextInt();
			System.out.println("Enter no.of columns for 1st Matrix: ");
			c1=sc.nextInt();
			System.out.println("Enter no.of rows for 2nd Matrix: ");
			r2=sc.nextInt();
			System.out.println("Enter no.of columns for 2nd Matrix: ");
			c2=sc.nextInt();
			System.out.println("FOR MATRIX 1ST: ");
	        m.getdata(a,b,r1,c1);
	        m.putdata(a,b,r1,c1);
	        System.out.println("FOR MATRIX 2nd: ");
	        m.getdata(a,b,r2,c2);
	        m.putdata(a,b,r2,c2);
			System.out.println("*****Menu******");
			System.out.println("1)Addition\n2)Subtraction\n3)Multiplication\n4)Exit");
			System.out.println("Enter your choice: ");
			ch=sc.nextInt();
			switch(ch) {
				case 1:
					System.out.println("Addition of two Matrix: ");
			        m.addition(a,b,c);
					break;
				case 2:
					System.out.println("Subtraction of two Matrix: ");
			        m.subtraction(a,b,c);
			        break;
				case 3:
					System.out.println("Multiplication of two Matrix: ");
			        m.multiplication(a,b,c);
					break;
				case 4:
					System.exit(0);
					break;
				default:
					System.out.println("Plz... enter your valid choice");
			}
	        sc.close();
		}
		
}

