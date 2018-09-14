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
		savings = computeDiscountInfo(price, discount);
		System.out.println("Special this week on any service over " + price);
		System.out.println("Discount of " + discount + "%");
		System.out.println("That's savings of at least $" + savings);
	}
	
	public static void displayInfo() {
		System.out.println("Paradise Day Spa wants to pamper you.");
		System.out.println("We will make you look good.");
	}
	public static double computeDiscountInfo(double price, double discount) {
		double savings;
		savings = price * discount / 100;
		return savings;


}
}