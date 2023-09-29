package com.milan.game;
 
import java.util.Random;
import java.util.Scanner;
 
public class NumberGuessingGame {
     
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 
        Random random = new Random();
        int secretNumber = random.nextInt(100) + 1;
        int attempts = 0;
        int guess;
 
        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("Try to guess the secret number between 1 and 100.");
 
        while (true) {
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();
            attempts++;
 
            if (guess == secretNumber) {
                System.out.println(
                        "Congratulations! You guessed the number " + secretNumber + " in " + attempts + " attempts!");
                break;
            } else if (guess < secretNumber) {
                System.out.println("Too low! Try again.");
            } else {
                System.out.println("Too high! Try again.");
            }
        }
 
        scanner.close();
    }
}




/*OUTPUT:- Welcome to the Number Guessing Game!
Try to guess the secret number between 1 and 100.
Enter your guess: 70
Too high! Try again.
Enter your guess: 35
Too high! Try again.
Enter your guess: 20
Too low! Try again.
Enter your guess: 25 
Too low! Try again.
Enter your guess: 30
Too high! Try again.
Enter your guess: 27
Too low! Try again.
Enter your guess: 28
Congratulations! You guessed the number 28 in 7 attempts!? */
