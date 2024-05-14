package VoterRegistration;

public class NotEligibleForVoting extends Exception{
    NotEligibleForVoting(String str){
        System.out.println(str);
    }
}
