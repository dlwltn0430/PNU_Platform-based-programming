//derived from the NotCheapStoreItem class
public class Candy extends NotCheapStoreItem {
	//get weight, price_per_pound, cost
	private double weight, price_per_pound, cost;
	
	public Candy(String name, double weight, double price_per_pound) {
		this.name = name;
		this.weight = weight;
		this.price_per_pound = price_per_pound;
	}
	
	//calculate cost
	public double calc_cost() {
		this.cost = Math.round(weight * price_per_pound * 100) / 100.0;
		return this.cost;
	}
	
	//print weight and price_per_pound
	public String get_item() {
		String item = weight + " lbs.@ " + price_per_pound + " /lb.\n";
		item = item + String.format("%-10s\t%.2f\n", name, cost);
		return item;
	}
}
