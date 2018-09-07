package exercises;
import java.util.Scanner;
public class IncesToFeetInteractive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int INCHES = 12;
		int numberOfInches = 86;
		int feet;
		int numberOfInchesRemaining;
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter how many quarts are needed: ");
		numberOfInches = input.nextInt();
		feet = numberOfInches / INCHES;
		numberOfInchesRemaining = numberOfInches % INCHES;

		System.out.println("The length is " + feet + " feet and " + numberOfInchesRemaining + " inches.");

		

	}

}
