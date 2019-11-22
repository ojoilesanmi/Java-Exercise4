import java.util.Scanner;

public class CompareTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Compare number = new Compare();
	
	Scanner input = new Scanner(System.in);
	System.out.print("Enter your first integer here: ");
	int num1 = input.nextInt();
	number.setNum1(num1);
	
	System.out.print("Enter your second integer here: ");
	int num2 = input.nextInt();
	number.setNum2(num2);
	
	if(num1 > num2) {
		System.out.printf("The greatest number is %d", number.getNum1());
		
	}
	if(num1 < num2) {
		System.out.printf("The greatest number is %d", number.getNum2());
	
	}
	else {
		System.out.println("Both numbers are equal");
	}
	}

}
