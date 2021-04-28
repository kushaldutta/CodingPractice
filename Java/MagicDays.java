/* takes user input for a specific date and prints if the day is magic
 * magic day means day * month = year (two digit year) (Ex: 6/10/60)
*/
import java.util.Scanner;

public class MagicDays {
    public static void main(String[] args) {
        int month, day, year;
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter month (in numeric form): ");
        month = scanner.nextInt();
        
        System.out.print("Enter day: ");
        day = scanner.nextInt();
        
        System.out.print("Enter last two digits of year: ");
        year = scanner.nextInt();
        
        if (month * day == year) {
            System.out.println("The day is magic");
        }
        else {
            System.out.println("The day is not magic");
        }
    }
}