package JavaPrograms;

import java.util.*;

public class MathOperations {
	Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		MathOperations math=new MathOperations();
		math.Addition();
		int sub=math.Substraction();
		System.out.println("Sub: "+(sub));
		System.out.println("mulltiplication:   ");
		System.out.println("Enter the 1st no.: ");
		int n1=sc.nextInt();
		System.out.println("Enter the 2nd no.: ");
		int n2=sc.nextInt();
		math.Multiplication(n1,n2);
		System.out.println("Division:   ");
		System.out.println("Enter the 1st no.: ");
		int num1=sc.nextInt();
		System.out.println("Enter the 2nd no.: ");
		int num2=sc.nextInt();
		math.Display(math.Division(num1,num2));
	 sc.close();
	}
	void Addition() {
		System.out.println("Sum:   ");
		int a=50;
		int b=10;
		System.out.println("Sum: "+(a+b));
	}
	int Substraction() {
		System.out.println("Substraction:   ");
		System.out.println("Enter the 1st no.: ");
		int x=sc.nextInt();
		System.out.println("Enter the 2nd no.: ");
		int y=sc.nextInt();
		int sub=x-y;
		return sub;
	}
	void Multiplication(int n1,int n2) {
		 int mul=n1*n2;
		 System.out.println("Multiplication: "+(mul));
	}
	int Division(int num1,int num2) {
		int div=num1/num2;
		return div;
	}
	void Display(int div) {
		System.out.println("Division: "+(div));
	}

	}

