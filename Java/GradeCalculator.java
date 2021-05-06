// calculates grade using percentage in categories

import java.util.Scanner;

public class GradeCalculator {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        double grade;
        double sub1, sub2, sub3, sub4, sub5;
        
        System.out.print("What is the total weight (all weight percentages added)? ");
        double totalWeight = scanner.nextDouble();
        System.out.println("Please enter 0 for total points, earned points, and weight if there are no more categories");
        
        sub1 = subPercentage(); sub2 = subPercentage(); sub3 = subPercentage(); sub4 = subPercentage(); sub5 = subPercentage();
        
        grade = (sub1 + sub2 + sub3 + sub4 + sub5 ) / ( totalWeight / 100 );
        System.out.println("Your grade is " + grade);
    }
    
    public static double subPercentage() {
        System.out.print("What percentage is this category worth? ");
        double weight = scanner.nextDouble();
        
        System.out.print("How many points are in this category? ");
        double total = scanner.nextDouble();
        if (total == 0)
            total = 1;
        
        System.out.print("How many points have you earned in this category? ");
        double earned = scanner.nextDouble();
        
        double percent = earned / total * weight;
        return percent;
    }
}