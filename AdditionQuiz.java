import java.util.Scanner;
public class AdditionQuiz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number1 =(int) (Math.random() * 10);
		int number2 = (int) (Math.random() * 10);
		int number3 =(int) (Math.random() * 10);
		
		System.out.println(number1 + " " + number2 + " " + number3);
		
		
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("What is the sum of this? ");
		
		int answer = input.nextInt();
		
		int addition = number1 + number2 + number3;
		
		if(addition == answer) {
			System.out.print("Correct! Great job!");
		}
		if(addition != answer) {
			System.out.println("Oops. I am afraid you are worng");
			System.out.println(number1 + "+" + number2 + "+" + number3 + " should be " + (number1 + number2 + number3) );
		}

		
		
	}
		

}
