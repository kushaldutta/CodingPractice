// calculates grade using percentage in categories

import java.util.Scanner;

public class GradeCalculator {
    static Scanner scanner = new Scanner(System.in);
    static int advance = 1, amountOfCategories = 0;
    static double totalWeight = 0;
    public static void main(String[] args) {
        double grade;
        double sub1 = 0, sub2 = 0, sub3 = 0, sub4 = 0, sub5 = 0;
               
        sub1 = subPercentage(); 
        if (advance == 1)
            sub2 = subPercentage(); 
        if (advance == 1)
            sub3 = subPercentage(); 
        if (advance == 1)
            sub4 = subPercentage();
        if (advance == 1)
            sub5 = subPercentage();
        
        grade = (sub1 + sub2 + sub3 + sub4 + sub5 ) / ( totalWeight / 100 );
        System.out.printf("Your grade is %.3f\n", grade);
    }
    
    public static double subPercentage() {
        amountOfCategories++;
        if (amountOfCategories > 1)
            advance = advance();
        if (advance == 2) 
            return 0; 
       
        double weight = weight();
        System.out.print("How many points are in this category? ");
        double total = scanner.nextDouble();
        if (total == 0)
            total = 1;
        
        System.out.print("How many points have you earned in this category? ");
        double earned = scanner.nextDouble();
        double percent = earned / total * weight;
        return percent;
    }
    
    public static int advance() {
        System.out.print("Type 1 to continue or 2 if there are no more categories: ");
        advance = scanner.nextInt(); 
        return advance;
    }
    
    public static double weight() {
        System.out.print("What percentage is this category worth? ");
        double weight = scanner.nextDouble();
        totalWeight += weight;
        return weight;
    }
}

/*
What percentage is this category worth? 10
How many points are in this category? 76
How many points have you earned in this category? 73
Type 1 to continue or 2 if there are no more categories: 1
What percentage is this category worth? 30
How many points are in this category? 40
How many points have you earned in this category? 35.67
Type 1 to continue or 2 if there are no more categories: 1
What percentage is this category worth? 60
How many points are in this category? 16
How many points have you earned in this category? 15
Type 1 to continue or 2 if there are no more categories: 2
Your grade is 92.608
*/