package JavaPrograms;

import java.util.Random;
import java.util.Scanner;
public class RockPaperScissor {
	public static void main(String[] args) {
		RockPaperScissor r =new RockPaperScissor();
		System.out.print(r.hashCode());
	 	Scanner sc = new Scanner(System.in);
	    Random rand = new Random();
	    String [] choices = {"Rock","Paper","Scissors"};
	    while(true){
	        System.out.println("\nChoose your move: ");
	        System.out.println("1. Rock");
	        System.out.println("2. Paper");
	        System.out.println("3. Scissor");
	        System.out.println("4. Quit");

	        int yourchoice= sc.nextInt();
	        int computerChoice = rand.nextInt(3) + 1;

	        if (yourchoice == 4) {
	            System.out.println("Thanks for playing.... Goodbye!");
	            break;
	            
	        }
	        if (yourchoice < 1 || yourchoice > 4) {
	            System.out.println("Invalid choice(*_*) . Please select a valid option.");
	            continue;
	        }
	        System.out.println("You chose: " + choices[yourchoice - 1]);
	        System.out.println("Computer chose: " + choices[computerChoice - 1]);
	        if (yourchoice == computerChoice) {
	            System.out.println("=>It's a tie!!!!");
	        }
	        else if ((yourchoice == 1 && computerChoice == 3) || 
	        		(yourchoice == 2 && computerChoice == 1) || (yourchoice == 3 && computerChoice == 2))
	        {
	            System.out.println("=>You win! (*_*)  ");
	        }
	        else {
	            System.out.println("Computer wins!");
	        }
	    }
	    sc.close();
	}
}
