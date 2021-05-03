import java.util.Scanner;

public class Utility {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int wattsWaterHeater, hoursWaterHeater; 
        int wattsComputerEquipment, hoursComputerEquipment; 
        int wattsLights, hoursLights;
        int totalWattHours;
        double totalCost;
        final int MIN_NUMBER = 0;
        
        for (int i = 0; i < 2; i++) {
            do {
                System.out.print("How many watts for the "
                        + "Water Heater? (> 0): ");
                hoursWaterHeater = scanner.nextInt(); 
                } while (hoursWaterHeater < MIN_NUMBER);
            do {   
                System.out.print("How many hours/day do you "
                        + "run the Water Heater? (>0): ");
                wattsWaterHeater = scanner.nextInt(); 
                } while (wattsWaterHeater < MIN_NUMBER);
            do { 
                System.out.print("\nHow many watts for the "
                        + "Computer Equipment? (> 0): ");
                hoursComputerEquipment = scanner.nextInt(); 
                } while (hoursComputerEquipment < MIN_NUMBER); 
            do { 
                System.out.print("How many hours/day do you "
                        + "run the Computer Equipment? (>0): ");
                wattsComputerEquipment = scanner.nextInt(); 
                } while (wattsComputerEquipment < MIN_NUMBER); 
            do {
                System.out.print("\nHow many watts for the Lights? (> 0): ");
                hoursLights = scanner.nextInt(); 
                } while (hoursLights < MIN_NUMBER);
            do { 
                System.out.print("How many hours/day do you "
                        + "run the Lights? (>0): ");
                wattsLights = scanner.nextInt(); 
                } while (wattsLights < MIN_NUMBER);
        
            totalWattHours = 30 * ( wattsWaterHeater * hoursWaterHeater + 
                    wattsComputerEquipment * hoursComputerEquipment + 
                    wattsLights * hoursLights );
            totalCost = totalWattHours * .00005;
        
            System.out.println("You have used " + totalWattHours 
                    + " Watt-Hours of electricity.");
            System.out.printf("Your total bill this month "
                    + "is $%.2f\n\n", totalCost); 
        }
    }
}