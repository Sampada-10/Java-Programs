package VoterRegistration;

public class VoterDetails{

    public String fname,mname,lname,email,address;
    long phoneno,aadhar;
    public int age,i=0;
    String username,password;
    VoterDetails(String fname,String mname,String lname,String address,int age ){
        this.fname=fname;
        this.mname=mname;
        this.lname=lname;
    }
    VoterDetails(long phoneno,long aadhar){
        this.phoneno=phoneno;
        this.aadhar=aadhar;
    }
    VoterDetails(String username,String password){
        this.username=username;
        this.password=password;
    }
    VoterDetails(){}
}
