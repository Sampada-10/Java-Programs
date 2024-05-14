package JavaPrograms;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	   float sum=0;
	   float Max=0;
       Scanner sc=new Scanner(System.in);
       System.out.println("How many no. you want");
       int n=sc.nextInt();
       float arr[]= new float [n];
       for(int i=0;i<arr.length;i++)
       {
           System.out.println("Enter no.: ");
    	   arr[i]=sc.nextFloat();
    	   sum+=arr[i];
       }
    	   System.out.print("average: "+(sum/n));
        for(int i=0;i<arr.length;i++)
        {
        	if(arr[i]>Max)
        	{
        		Max=arr[i];
        	}
        }
        System.out.print("\tMax: "+(Max));
    sc.close();
	    	   
	}

}
