import java.util.Random;
import java.util.Scanner;
public class Craps {
    public static void main(String[] args) {
        Random rnd = new Random();
        Scanner in = new Scanner(System.in);
        boolean playAgain = true;

        while (playAgain) {
            System.out.println("\n rolling the dice...");
            int die1 = rnd.nextInt(6) + 1;
            int die2 = rnd.nextInt(6) + 1;
            int sum = die1 + die2;

            System.out.println("die 1: " + die1 + " die 2: " + die2);
            System.out.println("Total: " + sum);

            if (sum == 2 || sum == 3 || sum == 12) {
                System.out.println("you crapped out! you lose.");
            } else if (sum == 7 || sum == 11) {
                System.out.println("Natural! you win!");
            } else {
                int point = sum;
                System.out.println("The point is now: " + point);
                boolean tryingForPoint = true;

                while (tryingForPoint) {
                    System.out.println("\n rolling again...");
                    die1 = rnd.nextInt(6) + 1;
                    die2 = rnd.nextInt(6) + 1;
                    sum = die1 + die2;

                    System.out.println("Die 1: " + die1 + " Die 2: " + die2);
                    System.out.println("Total: " + sum);

                    if (sum == point) {
                        System.out.println("You made the point! you win!");
                    } else if (sum == 7) {
                        System.out.println("You rolled a 7! You lose.");
                        tryingForPoint = false;
                    } else {
                        System.out.println("Still trying for the point...");
                    }

                }
            }
            System.out.print("\n Do you want to play again? (yes/no): ");
            String response = in.next().toLowerCase();
            playAgain = response.equals("yes");
        }
        System.out.println("Thanks for playing!");
        in.close();
    }
}
