package exercises;

public class InchesToFeet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int INCHES = 12;
		int numberOfInches = 86;
		int feet;
		int numberOfInchesRemaining;
		feet = numberOfInches / INCHES;
		numberOfInchesRemaining = numberOfInches % INCHES;

		System.out.println("The length is " + feet + " feet and " + numberOfInchesRemaining + " inches.");

		

	}

}
