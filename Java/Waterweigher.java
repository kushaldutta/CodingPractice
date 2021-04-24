import java.util.Scanner;

public class Waterweigher {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double gallons, pounds;

		System.out.print("Enter amound of gallons of water: ");
		gallons = scanner.nextDouble();
		pounds = 8.33 * gallons;
		System.out.println("You have " + pounds + " pounds");
	}
}
