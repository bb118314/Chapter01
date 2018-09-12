package Excersises;
import java.util.Scanner;
import java.util.Date;
import java.text.SimpleDateFormat;
public class FahrenheitToCelcius {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		double temp;
		Scanner input = new Scanner(System.in);
		Date now = new Date();
		 SimpleDateFormat dateFormatter = new SimpleDateFormat("h:m a");
		System.out.print("Enter the temperature in Farenheit at " + dateFormatter.format(now) + ": ");
		temp = input.nextDouble();
		displayTemp(temp);
		
	}
	public static void displayTemp(double temp) {
		double celcius;
		Date now = new Date();
		 SimpleDateFormat dateFormatter = new SimpleDateFormat("h:m a");
		celcius = (temp - 32) * 5 / 9;
		System.out.print("The temperature at " + dateFormatter.format(now) + " = " + celcius + " degrees Celcius");
	}
}