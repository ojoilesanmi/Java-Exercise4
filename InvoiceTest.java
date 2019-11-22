import java.util.Scanner;
public class InvoiceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Invoice calcInvoice = new Invoice("Ojo", "Samuel", 987, 89.77656);
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the part number here: ");
		String partNumber = input.next();
		calcInvoice.setPartNumber(partNumber);
		
		System.out.println("Enter the product description here: ");
		String partDescription = input.next();
		calcInvoice.setPartDescription(partDescription);
		
		
		System.out.println("Enter the quantity of item: ");
		int quantityOfItem = input.nextInt();
		calcInvoice.setQuantityOfItem(quantityOfItem);
		
		System.out.println(" Enter the price of the items here: " );
		double priceOfItem = input.nextDouble();
		calcInvoice.setPriceOfItem(priceOfItem);
		
		
		double amount = calcInvoice.getInvoiceAmount();
		
		System.out.printf("%s%n%s%n%s%n%s%n%s%n%s%n%f","Dear customer here is your invoice ", "Part number: ", partNumber, "Part Description is :", partDescription, "Total amount is: ", amount);
		
	}

}
