package Excersises;
import java.util.Scanner;
public class BookstoreCredit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double gpa;
		int credit = 10;
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter your GPA: ");
		gpa = input.nextDouble();
		calculateCredit(gpa, credit);
		
	}
	public static void calculateCredit(double gpa, int credit) {
		double total;
		total = gpa * credit;
		System.out.print("You will receive $" + total + " of credit.");
	}

}
