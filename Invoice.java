
public class Invoice {
	private String partNumber;
	private String partDescription;
	private int quantityOfItem;
	private double priceOfItem;
	
	public Invoice (String partNumber, String partDescription, int quantityOfItem, double priceOfItem) {
		this.partNumber=partNumber;
		this.partDescription = partDescription;
		this.quantityOfItem = quantityOfItem;
		this.priceOfItem = priceOfItem;
		
		
	}

	public String getPartNumber() {
		return partNumber;
	}

	public void setPartNumber(String partNumber) {
		this.partNumber = partNumber;
	}

	public String getPartDescription() {
		return partDescription;
	}

	public void setPartDescription(String partDescription) {
		this.partDescription = partDescription;
	}

	public int getQuantityOfItem() {
		return quantityOfItem;
	}

	public void setQuantityOfItem(int quantityOfItem) {
		this.quantityOfItem = quantityOfItem;
	}

	public double getPriceOfItem() {
		return priceOfItem;
	}

	public void setPriceOfItem(double priceOfItem) {
		this.priceOfItem = priceOfItem;
	}
	
	public double getInvoiceAmount() {
		if(priceOfItem < 0) {
			priceOfItem = 0.0;
		}
		if(quantityOfItem < 0) {
			quantityOfItem = 0;
		}
		double amount = getQuantityOfItem() * getPriceOfItem();
		return amount;
	}
		
	
}
