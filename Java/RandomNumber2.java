// random number guessing game with feedback after every guess

import java.util.Scanner;
import java.util.Random;

public class RandomNumber2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int guess;
        String repeat;
        
        do {
            
        int number = random.nextInt();
        
            do {
                System.out.print("Guess the number: ");
                guess = scanner.nextInt();
            
                if (guess < number) {
                    System.out.println("Too low, try again");
                }
                
                else if (guess > number) {
                    System.out.println("Too high, try again");
                }
                
                else {
                    System.out.println("Congrats, you guessed the number " + number);
                }
            
            } while (guess != number);
            
            scanner.nextLine();
            System.out.println("Do you want to play again? Enter 'yes' or 'no': ");
            repeat = scanner.nextLine();
        
        } while (repeat.equals("yes"));
    }
}