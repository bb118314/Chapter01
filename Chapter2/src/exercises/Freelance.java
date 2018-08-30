package exercises;
import java.util.Scanner;
public class Freelance {

	public static void main(String[] args) {
		String firstname;
		int num1;
		int num2;
		int total;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter your name: ");
		firstname = input.next();
		System.out.print("Please enter your first integer: ");
		num1 = input.nextInt();
		System.out.print("Please enter your second integer: ");
		num2 = input.nextInt();
		total = num1 + num2;
		
		System.out.println("Your name is " + firstname);
		System.out.println("Your total is  " + total);


	}

}
