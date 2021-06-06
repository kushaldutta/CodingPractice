// calculates grade using percentage in categories

import java.util.Scanner;

public class GradeCalculator {
    
    static Scanner scanner = new Scanner(System.in);
    static int amountOfCategories;
    static double[] grades;
    static double[] weight;
    
    public static void main(String[] args) {
        GradeCalculator Freshman = new GradeCalculator();
        Freshman.Percentage();
        System.out.printf("%nYour grade is %.3f", Freshman.Calculate());
        System.out.println("%");
    }
    
    /**
     * Default Constructor asks for amount of assignment categories
     */
    public GradeCalculator() {
        System.out.print("Enter the amount of categories: ");
        amountOfCategories = scanner.nextInt();
        grades = new double[amountOfCategories];
        weight = new double[amountOfCategories];
    }
      
    /**
     * Percentage method gets percentage and weight of each assignment category
     */
    public void Percentage() {
        for (int i = 0; i < grades.length; i++) {
            double totalPoints;
            double earnedPoints;
            
            System.out.println("\nCategory #" + (i + 1));
            
            System.out.print("How many total points are in this category? ");
            totalPoints = scanner.nextDouble();
            
            System.out.print("How many points have you earned in this category? ");
            earnedPoints = scanner.nextDouble();
            
            System.out.print("What percentage is this category worth? ");
            weight[i] = scanner.nextDouble();
            
            grades[i] = earnedPoints / totalPoints;
        }
    }
    
    /**
     * Calculate method find total worth of one assignment category
     * @return subPercent total percentage earned from one assignment category
     */
    public double Calculate() {
        double subPercent = 0;
        for (int i = 0; i < grades.length; i++) {
            subPercent += (grades[i] * 100 * weight[i]) / totalWeight();
        }
        return subPercent;
    }
    
    /**
     * totalWeight method adds the weight of all categories
     * @return totalWeight sum of weights
     */
    public double totalWeight() {
        double totalWeight = 0;
        for (int i = 0; i < weight.length; i++) {
            totalWeight += weight[i];
        }
        return totalWeight;
    }
}

/*
Enter the amount of categories: 3

Category #1
How many total points are in this category? 40
How many points have you earned in this category? 35
What percentage is this category worth? 20

Category #2
How many total points are in this category? 10
How many points have you earned in this category? 7.8
What percentage is this category worth? 30

Category #3
How many total points are in this category? 50
How many points have you earned in this category? 48
What percentage is this category worth? 50

Your grade is 88.900%
*/