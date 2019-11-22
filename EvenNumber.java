import java.util.Scanner;
public class EvenNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner input = new Scanner(System.in);
	
	System.out.println("Enter you integer here please: ");
	int number = input.nextInt();
	int remainder = number % 2;
	if(remainder != 0) {
		System.out.println(number);
		
	}
	else {
		int i = 0;
		
		do {
			
			System.out.println(number);
			number = number +2;
			i++;
		}while(i<5);
	}
	
	}
	

}
