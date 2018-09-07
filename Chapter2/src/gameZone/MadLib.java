package gameZone;

import java.util.Scanner;

public class MadLib {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String noun1;
		String noun2;
		String verb1;
		String verb2;
		String adjective1;
		String adjective2;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an object: ");
		noun1 = input.next();
		System.out.print("Enter another object: ");
		noun2 = input.next();
		System.out.print("Enter a verb (past tense): ");
		verb1 = input.next();
		System.out.print("Enter another verb (present tense): ");
		verb2 = input.next();
		System.out.print("Enter an adjective: ");
		adjective1 = input.next();
		System.out.print("Enter another adjective: ");
		adjective2 = input.next();
		
		System.out.println("A " + noun1 + " was sitting at the park when suddenly a(n) " + adjective1 + " " + noun2
				+ " " + verb1 + " and nearly killed the " + noun1 + "! Luckily, the " + noun1 + " was quick enough to " + 
				verb2 + " the " + adjective2 + " " + noun2 + " and saved the day!");

	}

}
