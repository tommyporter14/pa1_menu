package pa1_menu;
import java.text.NumberFormat;
import java.util.Scanner;

public class pa1_menu {

	public static void main(String[] args) {
		
		
		int burgerCount = 0;
		int sodaCount = 0;
		
		Scanner scnr = new Scanner(System.in);
		do
		{
			System.out.println("1. Burger");
			System.out.println("2. Soda");
			System.out.println("3. Exit");
			System.out.println("Select an option:");
		 	
		 	int userChoice = scnr.nextInt();
		 	
		 	if (userChoice == 1)
		 	{
		 		burgerCount ++;
		 		continue;
		 	}
		 	else if (userChoice == 2)
		 	{
		 		sodaCount ++;
		 		continue;
		 	}
		 	else if (userChoice ==3)
		 	{
		 		break;
		 	}
		 	else
		 	{
		 		System.out.println("Sorry I didn't understand, let's try again.");
		 		continue;
		 	}
		 	
		}while (true);
		
		 	double subTotal = calculateSubtotal(burgerCount, sodaCount);
		
		 	NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance();
		 	System.out.println("Subtotal: " + currencyFormatter.format(subTotal));
		 	addTaxDisplayTotal(subTotal);
		 	
		 	System.out.print("Burgers: ");
		 	for (int i=0; i<burgerCount; i++)
		 	{
		 	    System.out.print("*");
		 	}
		 	System.out.print("\nSodas: ");
		 	for (int i=0; i<sodaCount; i++){
		 	    System.out.print("*");
		 	}
		
		scnr.close(); 
	}
	
	public static double calculateSubtotal (int a, int b)
	{
		double subtotal = ((a * 2.50) + (b * 1.25));
		return subtotal;
		
	}
	
	public static void addTaxDisplayTotal(double s)
	{
		double total = s+ (s * 0.07);
		System.out.println("Total: $" + String.format("%.2f",total));
	}	
		
}

