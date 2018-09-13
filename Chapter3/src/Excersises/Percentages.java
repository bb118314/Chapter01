package Excersises;
import java.util.Scanner;
public class Percentages {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double x;
		double y;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter your first number (x): ");
		x = input.nextInt();
		System.out.print("Please enter your second number (y): ");
		y = input.nextInt();
		computePercent(x, y);
	}
	public static void computePercent(double x, double y) {
		double compute;
		compute = (x / y) * 100;
		
		System.out.print(x + " is " + compute + "% of " + y);
	}

}
