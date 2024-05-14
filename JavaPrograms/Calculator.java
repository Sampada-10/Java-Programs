package JavaPrograms;

import java.util.*;
public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double num1;
		double num2;
		char operator;
		double result;
		
		System.out.println("_______Calculator______________");
		System.out.println("Enter 1st no. : ");
		num1=sc.nextDouble();
	    System.out.println("Enter operator (+,-,*,/): ");
		operator = sc.next().charAt(0);
		System.out.println("Enter 2nd no. : ");
		num2=sc.nextDouble();
		
		switch(operator) {
		case '+':
			result=num1+num2;
			System.out.println("Result: " + result);
			break;
		case '-':
			result=num1-num2;
			System.out.println("Result: " + result);
			break;
		case '*':
			result=num1*num2;
			System.out.println("Result: " + result);
			break;
		case '/':
			if (num2 != 0) {
                result = num1 / num2;
                System.out.println("Result: " + result);
            } else {
                System.out.println("Error: Division by zero");
               
            }
            break;
         default:
        	 System.out.println("Enter valid operator");
		}
		sc.close();
		}
}
