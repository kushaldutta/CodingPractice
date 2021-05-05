import java.util.Scanner;

public class SimpleCalculator {
    static Scanner scanner = new Scanner(System.in);

    public static double add(double num1) {
        System.out.println("Addition Format: a + b");
        System.out.print("Enter the second value (b): ");
        double num2 = scanner.nextDouble();
        double result = num1 + num2;
        return result;
    }
    
    public static double subtract(double num1) {
        System.out.println("Subtraction Format: a - b");
        System.out.print("Enter the second value (b): ");
        double num2 = scanner.nextDouble();
        double result = num1 - num2;
        return result;
    }
    
    public static double multiply(double num1) {
        System.out.println("Multiplcation Format: a * b");
        System.out.print("Enter the second value (b): ");
        double num2 = scanner.nextDouble();
        double result = num1 * num2;
        return result;
        
    }
    
    public static double divide(double num1) {
        System.out.println("Division Format: a / b");
        System.out.print("Enter the second value (b): ");
        double num2 = scanner.nextDouble();
        double result = num1 / num2;
        return result;
    }
    
    public static void main(String[] args) {
        int advance, operation;
        double  input;
        do {
            
        System.out.print("What is your first value? ");
        input = scanner.nextDouble();
        
        do {
            System.out.print("Enter '1' for addition, '2' for subtraction, '3' for multiplication, or '4' for division: ");
            operation = scanner.nextInt();
            
            switch (operation) {
                case 1:
                    input = add(input);
                    break;
                case 2:
                    input = subtract(input);
                    break;
                case 3:
                    input = multiply(input);
                    break;
                case 4:
                    input = divide(input);
                    break;
            }
            System.out.println("Result: " + input);
            System.out.print("Enter '1' if you want to continue with this value or '2' if you want to reset: ");
            advance = scanner.nextInt();
        } while (advance == 1);
        
        } while (advance == 2);
    }
}