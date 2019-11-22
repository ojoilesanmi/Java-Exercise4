import java.util.Scanner;
public class DateAndWeek {
	private int number;
	private int week;
	private String day;
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public int getWeek() {
		return week;
	}
	public void setWeek() {
		week = getNumber()/7;
	}
	public String getDay() {
		return day;
	}
	public void setDay(String day) {
		this.day = day;
	}
	
	public void dateAndWeek () {
		Scanner input = new Scanner (System.in);
		System.out.println("Enter the number of the day: ");
		number = input.nextInt();
		
		switch(number%7) {
		case 0:
		day = "Sunday";
		break;
		
		case 1:
		day = "Monday";
		break;
		
		case 2:
			day = "Tuesday";
			break;
		case 3:
			day = "Wednesday";
			break;
		case 4:
			day = "Thursday";
			break;
		case 5:
			day = "Friday";
			break;
		case 6:
			day = "Saturday";
			break;
		default:
				System.out.print("Hello there! There is no negative day on the calendar");
	
		
		}
		setWeek();
		System.out.printf("The number you entered, %d , is a %s in week %d ", number, day, week);
		}

	
	
		



}
