import java.util.Date;

public class Human {
	private Date dateOfBirth;
	
	public Human () {
		dateOfBirth = new Date();
	}
	

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
}
	
