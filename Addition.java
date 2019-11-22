
public class Addition {
	private int firstOperand;
	private int secondOperand;
	
	public Addition (int x, int y) {
		firstOperand = x;
		secondOperand = y;
	}
	
	public Addition () {
		
	}
	public int getFirstOperand() {
		return firstOperand;
	}
	public int getSecondOperand() {
		return secondOperand;
	}
	public int Addition () {
		int sum = getFirstOperand() + getSecondOperand();
		return sum;
		
		
	}
}
