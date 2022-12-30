
public class NotCheapStore {
	private String store_name, address, telephone_number;
	private CheckOut cash_register;
	
	//get store_name
	NotCheapStore(String store_name) {
		this.store_name = store_name;
		this.cash_register = new CheckOut();
	}
	
	//add item to cash_register
	public void enterItem(NotCheapStoreItem item) {
		this.cash_register.enterItem(item);
	}
	
	//clear cash_register
	public void clear() {
		this.cash_register.clear();
	}
	
	//calculate number of items
	public int numberOfItems() {
		return this.cash_register.numberOfItems();
	}
	
	//get total cost
	public double totalCost() {
		return this.cash_register.get_total_cost();
	}
	
	//get total tax
	public double totalTax() {
		return this.cash_register.get_total_tax();
	}
	
	//display receipt
	public String displayReceipt() {
		return this.cash_register.displayReceipt();
	}
}
