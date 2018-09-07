package exercises;
import java.util.Scanner;
public class QuartsToGallonsInteractive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int QUARTS = 4;
		int qNeeded;
		int numberOfGallons;
		int numberOfQuarts;
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter how many quarts are needed: ");
		qNeeded = input.nextInt();
		
		numberOfGallons = qNeeded / QUARTS;
		numberOfQuarts = qNeeded % QUARTS;

		System.out.println("You require " + numberOfGallons + " gallons and " + numberOfQuarts + " quarts of paint to complete the project.");

		

	}

}
