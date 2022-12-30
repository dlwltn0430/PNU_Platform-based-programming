//derived from the NotCheapStoreItem class
public class Cookie extends NotCheapStoreItem {
	private int number;
	private double price_per_dozen, cost;
	
	//get name, number, price_per_dozen
	public Cookie(String name, int number, double price_per_dozen) {
		this.name = name;
		this.number = number;
		this.price_per_dozen = price_per_dozen;
	}
	
	//calculate cost
	public double calc_cost() {
		this.cost = Math.round(number * price_per_dozen / 12 * 100) /100.0;
		return this.cost;
	}
	
	//print number and price_per_dozen
	public String get_item() {
		String item = number + "@" + price_per_dozen + "/dz.\n";
		item = item + String.format("%-10s\t%.2f\n", name, cost);
		return item;
	}

}
