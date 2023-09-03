import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {

    public static void main(String[] args) {
        // Create a scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Create a random object for computer choice
        Random random = new Random();

        // Create an array of moves
        String[] moves = {"rock", "paper", "scissors"};

        // Create variables to store the scores
        int userScore = 0;
        int computerScore = 0;

        // Create a loop for 10 rounds
        for (int i = 0; i < 10; i++) {
            // Prompt the user to enter their move
            System.out.println("Round " + (i + 1) + ": Enter your move (rock, paper, or scissors):");
            String userMove = scanner.nextLine().toLowerCase();

            // Validate the user move
            if (!userMove.equals("rock") && !userMove.equals("paper") && !userMove.equals("scissors")) {
                System.out.println("Invalid move. Try again.");
                i--; // Repeat the round
                continue; // Skip the rest of the loop
            }

            // Generate a random move for the computer
            int computerIndex = random.nextInt(3);
            String computerMove = moves[computerIndex];

            // Display the moves
            System.out.println("You chose: " + userMove);
            System.out.println("Computer chose: " + computerMove);

            // Compare the moves and update the scores
            if (userMove.equals(computerMove)) {
                System.out.println("It's a tie!");
            } else if (userMove.equals("rock") && computerMove.equals("scissors") ||
                       userMove.equals("paper") && computerMove.equals("rock") ||
                       userMove.equals("scissors") && computerMove.equals("paper")) {
                System.out.println("You win!");
                userScore++;
            } else {
                System.out.println("You lose!");
                computerScore++;
            }

            // Display the scores
            System.out.println("Your score: " + userScore);
            System.out.println("Computer score: " + computerScore);
        }

        // Display the final result
        if (userScore > computerScore) {
            System.out.println("You won the game!");
        } else if (userScore < computerScore) {
            System.out.println("You lost the game!");
        } else {
            System.out.println("The game ended in a draw!");
        }

        // Close the scanner object
        scanner.close();
    }
}