import java.util.Scanner;

public class Fibonacci {
    
    public static void main(String[] args) {
        int term;
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the nth term: ");
        term = scanner.nextInt();
        
        for (int i = 0; i <= term; i++)
            System.out.print(fib(i) + " ");
    }
    
    public static int fib(int n) {
        if (n == 0)
            return 0;
        if (n == 1) 
            return 1;
        else
            return fib(n - 1) + fib(n - 2);
    }
}