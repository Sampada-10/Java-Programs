/*b) Write a program to calculate perimeter and area of rectangle.
(hint : area = length * breadth , perimeter=2*(length+breadth))*/
package com.assignment1;
import java.util.*;

public class Rectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	   Scanner sc=new Scanner(System.in);
	   double l,b,area,perimeter;
	   System.out.println("Enter the length: ");
	   l=sc.nextDouble();
	   System.out.println("Enter the breadth: ");
	   b=sc.nextDouble();
	   area=l*b;
	   System.out.println("Area of Rectangle: "+(area));
	   perimeter=2*(l+b);
	   System.out.println("Perimeter of rectangle: "+(perimeter));
	   sc.close();

	}

}
