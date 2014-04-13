import java.util.Random;

public class RPS {

    public static String getComputerChoice() {
	Random rng = new Random( System.nanoTime() );
	double choice = rng.nextDouble();
	if( choice <= 0.33 ) {
	    return "rock";
	}
	if( choice <= 0.66 ) {
	    return "paper";
	}
	return "scissors";
    }

    public static void sayWinner(String choice1, String choice2 ) {
	System.out.print(choice1 + " VS " + choice2 + " -- ");
	if( choice1.equals(choice2) ) {
	    // TIE
	    System.out.println("It's a tie!");
	    return;
	}
	if( choice1.equals("rock") ) {
	    if( choice2.equals("paper") ) {
		System.out.println("Paper covers rock");
	    } else {
		System.out.println("Rock breaks scissors");
	    }
	} else if( choice1.equals("paper") ) {
	    if( choice2.equals("scissors") ) {
		System.out.println("Scissors cuts paper");
	    } else {
		System.out.println("Paper covers rock");
	    }
	} else if( choice1.equals("scissors") ) {
	    if( choice2.equals("paper") ) {
		System.out.println("Scissors cuts paper");
	    } else {
		System.out.println("Rock breaks scissors");
	    }
	} else {
	    System.out.println("???");
	}
    }    

    public static void main( String[] args ) {
	for( int i=0; i<30; i++ ) {
	    sayWinner( getComputerChoice(), getComputerChoice() );
	}
    }
}
