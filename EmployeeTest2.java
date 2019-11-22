import java.util.Scanner;
public class EmployeeTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Employee mufu = new Employee("Date", "Date", 663553.09);
		
		System.out.println("Enter your first name please: ");
		String firstName = input.next();
		mufu.setFirstName(firstName);
		
		System.out.println("Enter your last name please: ");
		String lastName = input.next();
		mufu.setLastName(lastName);
		
		System.out.println("Enter your current monthly salary: ");
		double monthlySalary = input.nextDouble();
		mufu.setMonthlySalary(monthlySalary);
		
		System.out.printf("s%s%s%s%f","Dear ", mufu.getFirstName(), mufu.getLastName(), "Your increased yearly salary is ", mufu.getIncreasedYearlySalary());
		
		
	}

}
