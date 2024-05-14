package JavaPrograms;

import java.util.*;

public class Addition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	   Scanner sc=new Scanner(System.in);
       System.out.println("Enter the value of a: ");
       int a= sc.nextInt();
       System.out.println("Enter the value of b: ");
       int b= sc.nextInt();
       int sum=a+b;
       System.out.println("sum: "+(sum));
       sc.close();
	}

}
