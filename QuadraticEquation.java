import java.util.Scanner;
public class QuadraticEquation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the value of a: ");
		double a = input.nextDouble();
		
		System.out.print("Enter the value of b: ");
		double b = input.nextDouble();
		
		System.out.print("Enter the value of c: ");
		double c = input.nextDouble();
		
		double d = b*b - (4*a*c);
	
		if(d< 0) {
			System.out.print("This equation has no real roots");
		}
		if(d >= 0){

			double e = (-b + Math.pow(d, 0.5));
			double f= 2*a;
			double r1 = e/f;
			
			double g = (-b-Math.pow(d, 0.5));
			
			double r2 = g/f;
				if(r1 == r2) {
					System.out.printf("The equation has 1 root %.2f", r1);
				}
				else {
			
			System.out.printf("%s%f%s%f", "The equation has two roots ", r1, " and ", r2);
			
			
		}
		
		
		}
		
		

	}

}
