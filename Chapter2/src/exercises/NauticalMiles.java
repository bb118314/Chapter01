package exercises;

public class NauticalMiles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double kilometers = 1.852;
		double kilometers2;
		double miles = 1.150779;
		double miles2;
		double nMiles = 21;
		
		kilometers2 = nMiles * kilometers;
		miles2 = nMiles * miles;
		System.out.println("There are " + miles2 + " miles in a nautical mile. (" + kilometers2 + " for you metric folk.)");

	}

}
