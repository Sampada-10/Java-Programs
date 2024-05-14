package JavaPrograms;

import java.util.*;
public class multiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		//System.out.println("How many "
		int a[][]=new int[2][2];
		int b[][]=new int[2][2];
		int c[][]=new int[2][2];
		int i,j,k;
		System.out.println("Enter 1st Matrix");
		for(i=0;i<2;i++)
		{	for(j=0;j<2;j++)
			{
			   a[i][j]=sc.nextInt();
			}
		}
		System.out.println("1st Matrix: ");
		for(i=0;i<2;i++)
		{	for(j=0;j<2;j++)
			{
			System.out.print(a[i][j]+"\t"); 
			}
		  System.out.println();
		}
		System.out.println("Enter 2nd Matrix");
		for(i=0;i<2;i++)
		{	for(j=0;j<2;j++)
			{
			   b[i][j]=sc.nextInt();
			}
		}
		System.out.println("2nd Matrix: ");
		for(i=0;i<2;i++)
		{	for(j=0;j<2;j++)
			{
			System.out.print(b[i][j]+"\t"); 
			}
		  System.out.println();
		}
		
		for(i=0;i<2;i++)
		{	for(j=0;j<2;j++)
			{
			   for(k=0;k<2;k++)
			   {
				   c[i][j]=c[i][j]+a[i][k]*b[k][j];
			   }
				  System.out.println();
			}
		}
		System.out.println("Multiplication of two Matrix: ");
		for(i=0;i<2;i++)
		{	for(j=0;j<2;j++)
			{
			System.out.print(c[i][j]+"\t"); 
			}
		  System.out.println();
		}
		
	}
	

}
