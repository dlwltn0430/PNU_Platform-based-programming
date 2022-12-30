import java.util.ArrayList;

public class CheckOut {
	private static final double tax_rate = 0.02;
	private ArrayList<NotCheapStoreItem> item_list = new ArrayList<>();;
	private double cost1, cost2, tax;
		
	//get store_name
	public CheckOut(String store_name) {
		cost1 = 0.0;
		cost2 = 0.0;
		tax = 0.0;
	}
	
	CheckOut() {
		
	};
	
	//add item to cash_register
	public void enterItem(NotCheapStoreItem item) {
		this.item_list.add(item);
	}
	
	//clear cash_register
	public void clear() {
		this.item_list.clear();
		System.out.println("\n");
	}
	
	//calculate number of items
	public int numberOfItems() {
		return this.item_list.size();
	}
	
	//set cost before tax
	public void set_cost_before_tax() {
		for (int i = 0; i < item_list.size(); i++) {
			cost1 = cost1 + item_list.get(i).calc_cost();
		}
	}
	
	//set tax
	public void set_tax() {
		this.tax = tax_rate * this.cost1 / 100;
		this.tax = Math.round(this.tax * 100) / 100.0;
	}
	
	//set total cost
	public void set_total_cost() {
		this.cost2 = this.cost1 + this.tax;
	}
	
	//get cost before tax
	public double get_cost_before_tax() {
		return this.cost1;
	}
	
	//get total tax
	public double get_total_tax() {
		return this.tax;
	}
	
	//get total cost
	public double get_total_cost() {
		return this.cost2;
	}
	
	//display receipt
	public String displayReceipt() {
		set_cost_before_tax();
		set_tax();
		set_total_cost();
		
		String receipt = "PNUStore\n" + "------------------\n\n";
		
		for (int i = 0; i < item_list.size(); i++) {
			NotCheapStoreItem item = item_list.get(i);
			receipt = receipt + item.get_item();
		}
		receipt = receipt + "\n";
		receipt = receipt + String.format("%-10s\t%.2f\n", "Tax", this.tax);
		receipt = receipt + String.format("%-10s\t%.2f\n", "Total cost", this.cost2);
		return receipt;
	}
	}



