package exercises;

public class QuartsToGallons {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int QUARTS = 4;
		int qNeeded = 18;
		int numberOfGallons;
		int numberOfQuarts;
		numberOfGallons = qNeeded / QUARTS;
		numberOfQuarts = qNeeded % QUARTS;

		System.out.println("You require " + numberOfGallons + " gallons and " + numberOfQuarts + " quarts of paint to complete the project.");

		

	}

}
