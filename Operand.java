import java.util.Scanner;
public class Operand {
	private int firstOperand;
	private int secondOperand;
	private String operation;
	
	public int getFirstOperand() {
		return firstOperand;
	}
	public void setFirstOperand(int firstOperand) {
		this.firstOperand = firstOperand;
	}
	public int getSecondOperand() {
		return secondOperand;
	}
	public void setSecondOperand(int secondOperand) {
		this.secondOperand = secondOperand;
	}
	public String getOperation() {
		return operation;
	}
	public void setOperation(String operation) {
		this.operation = operation;
	}
	

	public void performOperation() {
		for(int i =0; i<5; i++) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the first operand here: ");
		int firstOperand = input.nextInt();	
		
		System.out.println("Enter the second operand here: ");
		int secondOperand = input.nextInt();	
		
		System.out.println("Enter the operation you want to perform here: ");
		String operation = input.next();
		
		
		switch(operation){
		case "+": 
			System.out.printf("The sum of %d and %d is %d%n", firstOperand, secondOperand, firstOperand + secondOperand);
			break;
		
		case "-": 
			System.out.printf("The difference between %d and %d is %d%n",firstOperand, secondOperand, firstOperand - secondOperand);
			break;
			
		
		case "*": 
			System.out.printf("The product of %d and %d is %d%n", firstOperand, secondOperand, firstOperand * secondOperand);
			break;
		
		case "/": 
			if(secondOperand == 0) {
				System.out.println("You can't divide by zero");
			}
			else {
			System.out.printf("%d divided by %d is %d%n", firstOperand, secondOperand, firstOperand / secondOperand);
			break;
			}
			
		default:
			System.out.println("Oops. I am afraid I cannot perform this operation");
							
			}
			
		
		
		}
			
		
		}
		
	}

