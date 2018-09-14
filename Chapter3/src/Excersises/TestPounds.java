package Excersises;
import java.util.Scanner;
public class TestPounds {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int pounds;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter number of pounds: ");
		pounds = input.nextInt();
		poundsToKilograms(pounds);
		poundsToOunces(pounds);
		poundsToMiligrams(pounds);
		

	}
	public static void poundsToKilograms(int pounds) {
		double kG;
		kG = pounds * 0.453592;
		System.out.println("There are " + kG + " Kilograms in " + pounds + " pounds");
	}
	
	public static void poundsToOunces(int pounds) {
		int oC;
		oC = pounds * 16;
		System.out.println("There are " + oC + " Ounces in " + pounds + " pounds");
	}
	
	public static void poundsToMiligrams(int pounds) {
		int mG;
		mG = pounds * 453592;
		System.out.println("There are " + mG + " Miligrams in " + pounds + " pounds");
	}

}
