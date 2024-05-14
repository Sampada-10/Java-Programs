package VoterRegistration;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class SignUp extends VoterDetails{
    VoterDetails [] voter=new VoterDetails[5];
    int i=0;
    BufferedReader br;
    void personalDetails(){
        br=new BufferedReader(new InputStreamReader(System.in));
        String fname,mname,lname,address;
        int age;
        try {
        	System.out.println("___________Welcome to voter registration form__________");
            System.out.print("Enter first name: ");
            fname=br.readLine();
            System.out.print("Enter middle name: ");
            mname=br.readLine();
            System.out.print("Enter last name: ");
            lname=br.readLine();
            System.out.print("Enter address: ");
            address=br.readLine();
            System.out.print("Enter age: ");
            age=Integer.parseInt(br.readLine());
            Age a=new Age();
            if(a.checkAge(age)){}
            else {
                return;
            }
            voter[i]=new VoterDetails(fname,mname,lname,address,age);
            contactDetails();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
    void contactDetails(){
        long aadhar,pno;
        try {
            pno=new PhoneAadharVerify().checkPhone();
            aadhar=new PhoneAadharVerify().checkAadhar();
            voter[i]=new VoterDetails(pno,aadhar);
            createUserName();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    void createUserName(){
        String username,password;
        try {
            System.out.println("Create user name");
            username= br.readLine();
            System.out.println("Create password");
            password= br.readLine();
            voter[i]=new VoterDetails(username,password);
            i++;
        }
        catch (Exception e){
            e.printStackTrace();
        }

    }
    void viewDetail(){
        String user,pass;
        System.out.println(voter[0].username+" "+voter[0].password);
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter username");
        user=sc.next();
        System.out.println("Enter password");
        pass=sc.next();
        boolean result=false;
        for(int k=0;k<i;k++){
            if(voter[k].username.equals(user) && voter[k].password .equals(pass)){
                result=true;
                System.out.println("\nPersonal Detail");
                System.out.println("\nName:-"+voter[k].fname+" "+voter[k].mname+" "+voter[k].lname);
                System.out.println("\nAddress:-"+voter[k].address);
                System.out.println("\nAge:-"+voter[k].age+"\nContact Detail");
                System.out.println("\nAddhar No:-"+voter[k].aadhar+"Phone No:-"+voter[k].phoneno);
                break;
            }
        }
        if(!result){
            System.out.println("Record not found");
        }
    }
}

