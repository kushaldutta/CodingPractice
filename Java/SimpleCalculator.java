import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double input1 = 0, input2 = 0, a, b, addResult, subResult, mulResult, divResult;
        int operation;
        String advance;
        do {    
            do {
                System.out.print("Enter '1' for addition, '2' for subtraction, '3' for multiplication, or '4' for division: ");
                operation = scanner.nextInt();
                    if (operation == 1) {
                        System.out.println("Addition Format: a + b");
                        System.out.print("Enter the first value (a): ");
                        input1 = scanner.nextDouble();
                        System.out.print("Enter the second value (b): ");
                        input2 = scanner.nextDouble();
                        addResult = input1 + input2;
                        input1 = addResult;
                        System.out.println("Result: " + addResult);
                    }
                    else if (operation == 2) {
                        System.out.println("Subtraction Format: a - b");
                        System.out.print("Enter the first value (a): ");
                        input1 = scanner.nextDouble();
                        System.out.print("Enter the second value (b): ");
                        input2 = scanner.nextDouble();
                        subResult = input1 - input2;
                        input1 = subResult;
                        System.out.println("Result: " + subResult);
                    }
                    else if (operation == 3) {
                        System.out.println("Multiplacation Format: a * b");
                        System.out.print("Enter the first value (a): ");
                        input1 = scanner.nextDouble();
                        System.out.print("Enter the second value (b): ");
                        input2 = scanner.nextDouble();
                        mulResult = input1 * input2;
                        input1 = mulResult;
                        System.out.println("Result: " + mulResult);
                    }
                    else if (operation == 4) {
                        System.out.println("Division Format: a/b");
                        System.out.print("Enter the first value (a): ");
                        input1 = scanner.nextDouble();
                        System.out.print("Enter the second value (b): ");
                        input2 = scanner.nextDouble();
                        divResult = input1 / input2;
                        input1 = divResult;
                        System.out.println("Result: " + divResult);
                    }
                    scanner.nextLine();
                    System.out.print("Enter '1' if you want to continue with this value or '2' if you want to reset: ");
                    advance = scanner.nextLine();
                } while (advance.equals("2"));
            do {
                System.out.print("Enter '1' for addition, '2' for subtraction, '3' for multiplication, or '4' for division: ");
                operation = scanner.nextInt();
                    if (operation == 1) {
                        System.out.println("Addition Format: a + b (a = " + input1 + ")");
                        System.out.print("Enter the second value (b): ");
                        input2 = scanner.nextDouble();
                        addResult = input1 + input2;
                        input1 = addResult;
                        System.out.println("Result: " + addResult);
                    }
                    else if (operation == 2) {
                        System.out.println("Subtraction Format: a - b (a = " + input1 + ")");
                        System.out.print("Enter the second value (b): ");
                        input2 = scanner.nextDouble();
                        subResult = input1 - input2;
                        input1 = subResult;
                        System.out.println("Result: " + subResult);
                    }
                    else if (operation == 3) {
                        System.out.println("Multiplacation Format: a * b (a = " + input1 + ")");
                        System.out.print("Enter the second value (b): ");
                        input2 = scanner.nextDouble();
                        mulResult = input1 * input2;
                        input1 = mulResult;
                        System.out.println("Result: " + mulResult);
                    }
                    else if (operation == 4) {
                        System.out.println("Division Format: a/b (a = " + input1 + ")");
                        System.out.print("Enter the second value (b): ");
                        input2 = scanner.nextDouble();
                        divResult = input1 / input2;
                        input1 = divResult;
                        System.out.println("Result: " + divResult);
                    }
                    scanner.nextLine();
                    System.out.print("Enter '1' if you want to continue with this value or '2' if you want to reset: ");
                    advance = scanner.nextLine();
                } while (advance.equals("1"));
        } while (advance.equals("2"));
    }
}