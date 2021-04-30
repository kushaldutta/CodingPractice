import java.util.Scanner;

public class BmiKDa3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		final double bmi, heightCm, weightKg;
        
        System.out.print("Enter Height: "); 
        heightCm = scanner.nextDouble(); 
        
        System.out.print("Enter Weight: ");
        weightKg = scanner.nextDouble(); 
        
        bmi = ( weightKg / heightCm / heightCm ) * 10000;
		
        System.out.printf("Your BMI is %.2f \n", bmi); 
        if (bmi < 18.5) {
            System.out.println("You are underweight");
        }
        else if (bmi < 24.9) {
            System.out.println("You are normal weight");
        }
        else if (bmi < 29.9) {
            System.out.println("You are overweight");
        }
        else {
            System.out.println("You are obese");
        }
    }
}
