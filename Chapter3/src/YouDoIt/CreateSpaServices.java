package YouDoIt;
import java.util.Scanner;
public class CreateSpaServices {

	public static void main(String[] args) {
		String service;
		double price;
		SpaService firstService = new SpaService();
		SpaService secondService = new SpaService();
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter service >> ");
		service = keyboard.nextLine();
		System.out.print("Enter price >> ");
		price = keyboard.nextDouble();
		firstService.setServiceDescription(service);
		firstService.setPrice(price);
		System.out.println("Enter service: ");
		service = keyboard.nextLine();
		System.out.print("Enter price: ");
		price = keyboard.nextDouble();
		secondService.setServiceDescription(service);
		secondService.setPrice(price);

	}

}
