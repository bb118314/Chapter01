package YouDoIt;
import java.util.Scanner;
public class ParadiseInfo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double price;
		double discount;
		double savings;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter cutoff price for discount: ");
		price = input.nextInt();
		System.out.print("Enter discount rate as whole number: ");
		discount = input.nextInt();
		displayInfo();
	}
	
	public static void displayInfo() {
		System.out.println("Paradise Day Spa wants to pamper you.");
		System.out.println("We will make you look good.");
	}
	public static double computeDiscountInfo(double pr, double dscnt) {
		

}
}