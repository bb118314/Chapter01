package exercises;

import java.util.Scanner;

public class Eggs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double eggs = 0.45;
		double dozen = 3.25;
		int numofeggs;
		double total;
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter how many eggs you need: ");
		numofeggs = input.nextInt();
		dozen = numofeggs / 12;
		eggs = dozen % numofeggs;
		total = dozen + eggs;
		System.out.println("You can buy " + dozen + " dozen(s) for $3.25 each and " + eggs + " egg(s) sperately for $0.45 each. Your total will be " + total);

	}

}
