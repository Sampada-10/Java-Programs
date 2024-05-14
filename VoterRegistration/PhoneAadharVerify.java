package VoterRegistration;

import java.util.Scanner;

public class PhoneAadharVerify {
    Scanner sc= new Scanner(System.in);
    long checkAadhar(){
        int count=0;
        long temp,addhar;
        System.out.println("Enter 12 digit Adhar no. (without Space):  ");
        temp=addhar=sc.nextLong();
        while(temp!=0){
            temp/=10;
            count++;
        }
        if(count==12){
            return addhar;
        }
        else {
        	System.out.println("Aadhar no. is not 12 digit plz...");
            checkAadhar();
        }
        return addhar;
    }

    long checkPhone() {
        int count = 0;
        long temp, phone;
        System.out.println("Enter 10 digit Mobile no. (without Space):  ");
        temp = phone = sc.nextLong();
        while (temp != 0) {
            temp /= 10;
            count++;
        }
        if (count == 10) {
            return phone;
        } else {
        	System.out.println("Mobile no. is not 10 digit plz...");
            checkPhone();
        }
        return phone;
    }
}
