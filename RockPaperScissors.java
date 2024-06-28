import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {

    public static void main(String[] args) {
        String personPlay; // User's play -- "R", "P", or "S"
        String computerPlay = ""; // Computer's play -- "R", "P", or "S"
        int computerInt; // Randomly generated number used to determine
                         // computer's play

        Scanner scan = new Scanner(System.in);
        Random generator = new Random();

        // Generate computer's play (0,1,2)
        computerInt = generator.nextInt(3) + 1;

        // Translate computer's randomly generated play to string
        switch (computerInt) {
            case 1:
                computerPlay = "R";
                break;
            case 2:
                computerPlay = "P";
                break;
            case 3:
                computerPlay = "S";
                break;
        }

        // Get player's play from input
        System.out.print("Enter your play (R, P, S): ");
        personPlay = scan.next().toUpperCase();

        // Display computer's play
        System.out.println("Computer play is: " + computerPlay);

        // Determine the winner
        if (personPlay.equals(computerPlay)) {
            System.out.println("It's a tie!");
        } else if (personPlay.equals("R")) {
            if (computerPlay.equals("S")) {
                System.out.println("Rock crushes scissors. You win!!");
            } else {
                System.out.println("Paper covers rock. You lose!!");
            }
        } else if (personPlay.equals("P")) {
            if (computerPlay.equals("R")) {
                System.out.println("Paper covers rock. You win!!");
            } else {
                System.out.println("Scissors cuts paper. You lose!!");
            }
        } else if (personPlay.equals("S")) {
            if (computerPlay.equals("P")) {
                System.out.println("Scissors cuts paper. You win!!");
            } else {
                System.out.println("Rock crushes scissors. You lose!!");
            }
        } else {
            System.out.println("Invalid input. You must enter R, P, or S.");
        }

        scan.close();
    }
}
