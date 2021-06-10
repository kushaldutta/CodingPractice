import java.util.Scanner;

public class Factorial {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double n;
        
        do {
        System.out.print("Enter number (enter negative to exit): ");
        n = scanner.nextInt();
        System.out.println(factorial(n)); } while (n >= 0);
    }
    
    public static double factorial(double number) {
        if (number == 0) 
            return 1;
        else
            return number * factorial(number - 1);
    }
}