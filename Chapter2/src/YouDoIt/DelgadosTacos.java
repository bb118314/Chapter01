package YouDoIt;
import java.util.Scanner;
public class DelgadosTacos {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		double price;
		double tax;
		double pricetax;
		double tacop;
		int tacos;
		double burritosp;
		int burritos;
		double enchp;
		int ench;
		double nachosp;
		int nachos;
		
		 System.out.println("Welcome to Delgados Tacos!");
		 System.out.print("How many tacos would you like? ($1.15): ");
		 tacos = input.nextInt();
		 System.out.print("How many burritos would you like? ($1.50): ");
		 burritos = input.nextInt();
		 System.out.print("How many enchiladas would you like? ($2.00): ");
		 ench = input.nextInt();
		 System.out.println("How many nacho orders would you like? ($1.00): ");
		 nachos = input.nextInt();
		 
		 tacop = tacos * 1.15;
		 burritosp = burritos * 1.50;
		 enchp = ench * 2.00;
		 nachosp = nachos * 1.00;
		 price = tacop + burritosp + enchp + nachosp;
		 tax = price * 0.07;
		 pricetax = price + tax;
		 
		 System.out.println("You ordered " + tacos + " taco(s), " + burritos + " burrito(s), " + ench + " enchilada(s), and " 
		 + nachos + " order(s) of nachos. The cost is $" + price + " before tax. The final cost is $" + pricetax + " with tax. "
		 + "Thank you for choosing Delgado's Tacos!");
		 
			System.out.println("			    ____________    ");
			System.out.println("			   X            X   ");
			System.out.println("			  X              X  ");
			System.out.println("			 X________________X ");
			System.out.println("			XXXXXXXXXXXXXXXXXXXX");
			System.out.println("			XXXDELGADOSXTACOSXXX");
			System.out.println("			XXXXXX_________XXXXX");
			System.out.println("			XXXXXXl        lXXXX");
			System.out.println("			XXXXXX1        1XXXX");
			System.out.println("			XXXXXX1________1XXXX");
			System.out.println("			XXXXXXXXXXXXXXXXXXXX");
			System.out.println("			XXXXXXXXXXXXXXXXXXXX");
			System.out.println("			 O                O ");
		 

	}

}