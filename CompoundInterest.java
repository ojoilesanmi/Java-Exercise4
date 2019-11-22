import java.util.Scanner;
public class CompoundInterest {

	public double calculateInterest() {
		Scanner input = new Scanner (System.in);
		System.out.print("Enter the amount you want to invest here: ");
		double principal = input.nextDouble();
		
		System.out.print("Enter the number of years you want to invest: ");
		double years = input.nextDouble();
		
		double rate = 0.05;
		double amount;
		
		for(int i =1; i<= years; i++) {
		
		amount = principal * (1 + rate);
		
		principal = amount;
	}
		return principal;
		
	}
}
