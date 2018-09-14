package YouDoIt;
import java.util.Scanner;
public class SpaService {
	private String serviceDescription;
	private double price;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
String service;
double price;
SpaService firstService = new SpaService();
SpaService secondService = new SpaService();
Scanner input = new Scanner(System.in);
System.out.print("Enter service: ");
service = input.nextLine();
System.out.print("Enter price: ");
price = input.nextDouble();
firstService.setServiceDescription(service);
firstService.setPrice(price);

System.out.println("Enter service: ");
service = input.nextLine();
System.out.print("Enter price: ");
price = input.nextDouble();
secondService.setServiceDescription(service);
secondService.setPrice(price);
System.out.print("First service details: ");
System.out.println(firstService.getServiceDescription() + " $" + firstService.getPrice());
System.out.print("Second service details: ");
System.out.println(secondService.getServiceDescription() + " $" + secondService.getPrice());

	}
	public void setServiceDescription(String service) {
		serviceDescription = service;
	}
	public void setPrice(double pr) {
		price = pr;
	}
	public String getServiceDescription() {
		return serviceDescription;
	}
	public double getPrice() {
		return price;
	}
	

}
