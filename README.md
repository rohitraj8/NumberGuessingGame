# Number Guessing Game (Java)

A simple console-based game written in Java where the computer generates a random number between 1 and 100, and the user tries to guess it. After each guess, the program provides hints like "Too low" or "Too high". The game also tracks the number of attempts and ends after a maximum number of guesses.

---

## 🎯 Objective
- Practice basic Java syntax
- Work with loops, conditionals, user input, and random number generation
- Build a fully functioning console application

---

## 🧠 Concepts Used
- `java.util.Random`
- `java.util.Scanner`
- While loop
- If-else conditions
- Input/Output (I/O)

---

## 🛠 How It Works
1. The program generates a random number between 1 and 100.
2. The user is prompted to enter their guess.
3. The program checks if the guess is:
   - Too low
   - Too high
   - Correct
4. The game continues until the correct number is guessed or the maximum attempts are reached.

---

## 📌 Code

```java
import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Random random = new Random();
        int numberToGuess = random.nextInt(100) + 1;
        Scanner scanner = new Scanner(System.in);
        int guess = 0;
        int attempts = 0;
        int maxAttempts = 5;

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
```

---

## 🖥 Example Output

```
Welcome to the Number Guessing Game!
Guess the number between 1 and 100.
Enter your guess: 50
Too low! Try again.
Enter your guess: 75
Too high! Try again.
Enter your guess: 63
🎉 Congratulations! You guessed it in 3 attempts!
```

## 👤 Author
**Rohit**  
Minor Project Submission  
