//derived from the IceCream class
public class Sundae extends IceCream {
	private double toppingCost, cost;
	private String toppingName;
	
	//get name, icecreamCost, toppingName, toppingCost
	public Sundae(String name, double icecreamCost, String toppingName, double toppingCost) {
		super (name, icecreamCost);
		this.toppingName = toppingName;
		this.toppingCost = toppingCost;
	}
	
	//calculate cost
	public double calc_cost() {
		this.cost = super.calc_cost() + this.toppingCost;
		return this.cost;
	}
	
	public String get_item() {
		String item = toppingName + " Sundae with\n" + name;
		item = String.format("%-10s\t%.2f\n", item, cost);
		return item;
	}
}
