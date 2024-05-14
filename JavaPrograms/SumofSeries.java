package JavaPrograms;

import java.util.Scanner;

public class SumofSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("How many no. you want: ");
        int n=sc.nextInt();
        for(int i=0;i<=n;i++)
        {
        	sum+=i;
        }
        System.out.println("sum of n natural numbers: "+(sum));
        sc.close();
	}

}
