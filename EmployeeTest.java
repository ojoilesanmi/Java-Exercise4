
public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee james = new Employee ("James", "Gbadebo", 657);
		Employee samuel = new Employee ("Samuel", "James", 78);
		
		double amount = james.getYearlySalary();
		System.out.printf("Your salary is %.2f%n", amount);
		
		double value = samuel.getYearlySalary();
		System.out.printf("Your salary is %.2f%n", value);
		
		double increment = james.getIncreasedYearlySalary();
		System.out.printf("Your increased salary is %.2f%n",increment);
		
		double increase = samuel.getIncreasedYearlySalary();
		System.out.printf("Your increased salary is %.2f%n", increase);

	}

}
