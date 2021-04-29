// calculates grade using percentage in subcategories

import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        double total1, earned1, weight1, total2 = 1, earned2 = 0, 
        weight2 = 0, total3 = 1, earned3 = 0, weight3 = 0, totalWeight,
        percent1, percent2, percent3, total;
        String advance;
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("What percentage is the first category worth? ");
        weight1 = scanner.nextDouble();
        System.out.print("How many points are in first category? ");
        total1 = scanner.nextDouble();
        System.out.print("How many points have you earned in the first category? ");
        earned1 = scanner.nextDouble();
        
        scanner.nextLine();
        
        System.out.println("Are there more categories? Enter 'yes' or 'no'");
        advance = scanner.nextLine();
        
        if (advance.equals("yes")) {
            System.out.print("What percentage is this category worth? ");
            weight2 = scanner.nextDouble();
            System.out.print("How many points are in this category? ");
            total2 = scanner.nextDouble();
            System.out.print("How many points have you earned in this category? ");
            earned2 = scanner.nextDouble();
            
            scanner.nextLine();
            
            System.out.println("Are there any more categories?");
            advance = scanner.nextLine();

            if (advance.equals("yes")) {
                System.out.print("What percentage is this category worth? ");
                weight3 = scanner.nextDouble();
                System.out.print("How many points are in this category? ");
                total3 = scanner.nextDouble();
                System.out.print("How many points have you earned in this category? ");
                earned3 = scanner.nextDouble();
            }
        }
        

        
        totalWeight = ( weight1 + weight2 + weight3 ) / 100;
        percent1 = earned1 / total1;
        percent2 = earned2 / total2; 
        percent3 = earned3 / total3;
        total = ( percent1 * weight1 + percent2 * weight2 + percent3 * weight3 ) / totalWeight ;

        System.out.print("Your grade is " + total);
    }
}