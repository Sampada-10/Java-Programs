/*Define a class MyNumber having one private int data member. Write a default
constructor to initialize it to 0 and another constructor to initialize it to a value
(Use this). Write methods isNegative, isPositive, isZero, isOdd, isEven. Create an
object in main. Use command line arguments to pass a value to the object
(Hint : convert string argument to integer) and perform the above tests. Provide*/
//javadoc comments for all constructors and methods and generate the html help file
package com.assignment1;
public class MyNumber {
	private int no;
	public MyNumber()
	{
		no=0;
	}
	public MyNumber(int no)
	{
		this.no=no;
	}
	public void ispositive()
	{
		if(no>0)
		{
			System.out.println("To check number is positive or not?");
			System.out.println("Number is positive");
		}
	}
	public void isnegative()
	{
		if(no<0)
		{
			System.out.println("To check number is negative or not?");
			System.out.println("Number is negative");
		}
	}
	public void iszero()
	{
		if(no==0)
		{
			System.out.println("To check number is equal to zero or not?");
			System.out.println("Number is zero");
		}
	}
	public void isodd()
	{
		if(no%2!=0)
		{
			System.out.println("To check number is odd?");
			System.out.println("Number is odd");
		}
	}
	public void iseven()
	{
		if(no%2==0)
		{
			System.out.println("To check number is even?");
			System.out.println("Number is even");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyNumber mn1=new MyNumber();
		MyNumber mn2=new MyNumber(Integer.parseInt(args[0]));
		mn2.ispositive();
		mn2.isnegative();
		mn2.iszero();
		mn2.isodd();
		mn2.iseven();
	}
	

}
