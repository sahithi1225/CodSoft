import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        int min = 1;
        int max = 100;
        int maxAttempts = 10;
        int score = 0;
        
        boolean playAgain = true;
        
        while (playAgain) {
            int targetNumber = random.nextInt(max - min + 1) + min;
            int attempts = 0;
            
            System.out.println("Enter a number in the range 1 to 100");            
            
            while (attempts < maxAttempts) {
                System.out.print("Enter your guess: ");
                int userGuess = scanner.nextInt();
                attempts++;
                
                if (userGuess < targetNumber) {
                    System.out.println("Your guess is too low.");
                } else if (userGuess > targetNumber) {
                    System.out.println("Your guess is too high.");
                } else {
                    System.out.println("Congratulations! You guessed the number in " + attempts + " attempts.");
                    score++;
                    break;
                }
            }
            
            if (attempts >= maxAttempts) {
                System.out.println("You've used all your attempts. The correct number was " + targetNumber);
            }
            
            System.out.println("Your current score: " + score);
            System.out.print("Do you want to play again? (yes/no): ");
            String playAgainInput = scanner.next();
            playAgain = playAgainInput.equalsIgnoreCase("yes");
        }
        
        System.out.println("Thanks for playing!");
    }
}