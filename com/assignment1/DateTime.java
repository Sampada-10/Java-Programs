/*a) Write a java program to display the system date and time in various formats shown
below:
Current date is : 31/08/2021
Current date is : 08-31-2021
Current date is : Tuesday August 31 2021
Current date and time is : Fri August 31 15:25:59 IST 2021
Current date and time is : 31/08/21 15:25:59 PM +0530
Current time is : 15:25:59
Current week of year is : 35
Current week of month : 5
Current day of the year is : 243
Note: Use java.util.Date and java.text.SimpleDateFormat class*/
package com.assignment1;
//import java.time.LocalDateTime;
import java.util.Date;
import java.text.SimpleDateFormat;
public class DateTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date date=new Date();
		SimpleDateFormat simpledate=new SimpleDateFormat("dd/MM/yyyy");
		System.out.println("Current date is: "+(simpledate.format(date)));
		
		System.out.println("Current date is: "+(java.time.LocalDate.now()));
		
		java.util.Date dt=new java.util.Date();
		System.out.println("Current date and time is: "+dt);
		
		SimpleDateFormat datetime=new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		System.out.println("Current date is: "+(datetime.format(date)));
		
		SimpleDateFormat simpletime=new SimpleDateFormat("HH:mm:ss");
		System.out.println("Current date is: "+(simpletime.format(date)));
	}

}
