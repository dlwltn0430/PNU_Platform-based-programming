//derived from the NotCheapStoreItem class
public class IceCream extends NotCheapStoreItem {
	private double cost;
	
	//get name, cost
	public IceCream(String name, double cost) {
		this.name = name;
		this.cost = cost;
	}
	
	//calculate cost
	public double calc_cost() {
		return this.cost;
	}
	
	public String get_item() {
		String item = String.format("%-10s\t%.2f\n", name, cost);
		return item;
	}
}
