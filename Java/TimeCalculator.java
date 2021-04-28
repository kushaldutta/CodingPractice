// converts amount of seconds to amount of days, hours, minutes, and seconds

import java.util.Scanner;

public class TimeCalculator {
    public static void main(String[] args) {
        int inputSeconds, seconds, minutes, hours, days;
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter amount of seconds: ");
        inputSeconds = scanner.nextInt();
        seconds = inputSeconds;
        
        days = seconds / 86400;
        seconds = seconds % 86400;
        
        hours = seconds / 3600;
        seconds = seconds % 3600;
        
        minutes = seconds / 60;
        seconds = seconds % 60;
        
        System.out.println(inputSeconds + " seconds is equal to " + days + " days, " + hours 
                + " hours, " + minutes + " minutes, and " + seconds + " seconds");
    }
}