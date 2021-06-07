// calculates grade using percentage in categories with other options

import java.util.Scanner;

public class GradeCalculator {
    
    Scanner scanner = new Scanner(System.in);
    int amountOfCategories;
    static double[] grades;
    static double[] weight;
    static double[] totalPoints;
    static double[] earnedPoints;
    
    public static void main(String[] args) {
        System.out.println("Freshman's Grades:");
        GradeCalculator Freshman = new GradeCalculator();
        Freshman.Points();
        Freshman.AddGrade();
        
        System.out.println("Sophomore's Grades:");
        GradeCalculator Sophomore = new GradeCalculator();
        Sophomore.Points();
        Sophomore.AddGrade();
    }
    
    /**
     * Default Constructor asks for amount of assignment categories
     */
    public GradeCalculator() {
        System.out.print("Enter the amount of categories: ");
        amountOfCategories = scanner.nextInt();
        grades = new double[amountOfCategories];
        weight = new double[amountOfCategories];
        totalPoints = new double[grades.length];
        earnedPoints = new double[grades.length];
    }
      
    /**
     * Points method gets the points and weight of each assignment category
     */
    public void Points() {
        for (int i = 0; i < grades.length; i++) {
            System.out.println("\nCategory #" + (i + 1));
            
            System.out.print("How many total points are in this category? ");
            totalPoints[i] = scanner.nextDouble();
            
            System.out.print("How many points have you earned in this category? ");
            earnedPoints[i] = scanner.nextDouble();
            
            System.out.print("What percentage is this category worth? ");
            weight[i] = scanner.nextDouble();
            
            grades[i] = FindPercentage(i);
        }     
        System.out.printf("%nYour grade is %.3f", Calculate());
        System.out.println("%\n");
    }
    
    /**
     * FindPercentage method uses the points to find percentage of each assignment category
     * @param category index in array
     * @return percentage for specific category
     */
    public double FindPercentage(int category) {
        return earnedPoints[category] / totalPoints[category];
    }
    
    /**
     * TotalWeight method adds the weight of all categories
     * @return totalWeight sum of weights
     */
    public double TotalWeight() {
        double totalWeight = 0;
        for (int i = 0; i < weight.length; i++) {
            totalWeight += weight[i];
        }
        return totalWeight;
    }
    
    /**
     * Calculate method find total worth of one assignment category
     * @return subPercent total percentage earned from one assignment category
     */
    public double Calculate() {
        double subPercent = 0;
        for (int i = 0; i < grades.length; i++) {
            subPercent += (grades[i] * 100 * weight[i]) / TotalWeight();
        }
        return subPercent;
    }
    
    /** 
     * AddGrade method adds a grade into a specific assignment category and prints new grade
     */
    public void AddGrade() {
        int category;
        double newGrade;
        System.out.print("Which category # is this grade in? ");
        category = scanner.nextInt();
        
        System.out.print("Enter the total points of this assignment: ");
        totalPoints[category - 1] += scanner.nextDouble();
        
        System.out.print("Enter the points earned from this assignment: ");
        earnedPoints[category - 1] += scanner.nextDouble();   
                
        grades[category - 1] = FindPercentage(category - 1);
        newGrade = Calculate();
        
        System.out.printf("Your new grade is %.3f", newGrade);
        System.out.println("%\n");
    }
}

/*
Freshman's Grades:
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
How many total points are in this category? 40
How many points have you earned in this category? 38
What percentage is this category worth? 50

Your grade is 88.400%

Which category # is this grade in? 3
Enter the total points of this assignment: 10
Enter the points earned from this assignment: 10
Your new grade is 88.900%

Sophomore's Grades:
Enter the amount of categories: 2

Category #1
How many total points are in this category? 25
How many points have you earned in this category? 20
What percentage is this category worth? 40

Category #2
How many total points are in this category? 100
How many points have you earned in this category? 96
What percentage is this category worth? 50

Your grade is 88.889%

Which category # is this grade in? 2
Enter the total points of this assignment: 50
Enter the points earned from this assignment: 47
Your new grade is 88.519%
*/