import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Random random = new Random();
        int numberToGuess = random.nextInt(100) + 1; // Random number between 1 and 100
        Scanner scanner = new Scanner(System.in);
        int guess = 0;
        int attempts = 0;
        int maxAttempts = 5; // You can change this if you want more attempts

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("Guess the number between 1 and 100.");

        while (guess != numberToGuess && attempts < maxAttempts) {
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();
            attempts++;

            if (guess < numberToGuess) {
                System.out.println("Too low! Try again.");
            } else if (guess > numberToGuess) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("🎉 Congratulations! You guessed it in " + attempts + " attempts!");
                break;
            }
        }

        if (attempts == maxAttempts && guess != numberToGuess) {
            System.out.println("Game over! The number was " + numberToGuess);
        }

        scanner.close();
    }
}
