// random number guessing game

import java.util.Random; 
import java.util.Scanner;

public class RandomNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int intRandom, intUser;
        String repeat;
        
        do {
            intRandom = random.nextInt();
            
            System.out.print("Guess the number: ");
            intUser = scanner.nextInt();
            
            if (intUser == intRandom)
                System.out.println("Congratulations! You guessed the random number");
            else
                System.out.println("Incorrect. The number was " + intRandom);
            
            System.out.print("Do you want to repeat? ");
            scanner.nextLine();
            repeat = scanner.nextLine();
        } while (repeat.equals("yes"));    
    }
}