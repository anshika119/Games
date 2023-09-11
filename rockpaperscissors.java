import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] choices = {"Rock", "Paper", "Scissors"};

        System.out.println("Welcome to Rock, Paper, Scissors!");
        System.out.print("Enter your choice (Rock, Paper, or Scissors): ");
        String userChoice = scanner.nextLine();
        userChoice = userChoice.toLowerCase();

        int computerChoiceIndex = random.nextInt(3);
        String computerChoice = choices[computerChoiceIndex];

        System.out.println("Computer chose: " + computerChoice);

        if (userChoice.equals(computerChoice.toLowerCase())) {
            System.out.println("It's a tie!");
        } else if (userChoice.equals("rock")) {
            if (computerChoice.equals("scissors")) {
                System.out.println("You win!");
            } else {
                System.out.println("Computer wins!");
            }
        } else if (userChoice.equals("paper")) {
            if (computerChoice.equals("rock")) {
                System.out.println("You win!");
            } else {
                System.out.println("Computer wins!");
            }
        } else if (userChoice.equals("scissors")) {
            if (computerChoice.equals("paper")) {
                System.out.println("You win!");
            } else {
                System.out.println("Computer wins!");
            }
        } else {
            System.out.println("Invalid input. Please enter Rock, Paper, or Scissors.");
        }

        scanner.close();
    }
}
