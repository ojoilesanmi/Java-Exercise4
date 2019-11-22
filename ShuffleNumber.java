import java.security.SecureRandom;
public class ShuffleNumber {

		public static void shuffle() {
			int[] array = new int[20];
			
			for(int x = 0; x <array.length; x++) {
				array[x]= x + 1;
			}
			
			SecureRandom randomNumber = new SecureRandom();
			for(int counter = 0; counter<array.length; counter++) {
				int firstNumber = randomNumber.nextInt(20);
				int secondNumber = randomNumber.nextInt(20);
				while(firstNumber == secondNumber) {
					secondNumber = randomNumber.nextInt(20);
				}
				int num = array[firstNumber];
				array[firstNumber] = array[secondNumber];
				array[secondNumber] = num;
			}
			for(int count = 0; count<array.length; count++) {
					System.out.printf("%d%s", array[count], " ");
					
				}
				
				
			
				
				
				
			}
		}
	

