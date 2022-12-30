abstract class Food extends Item {
	int calories;
	/**
	* Construct a Food item with specified name, cost, and calorie count.
	* @param name the name of the food.
	* @param cost the cost of the food.
	* @param calories the number of calories per serving.
	*/
	public Food(String name, double cost, int calories)  {
		super( name, cost );
		this.calories = calories;
	}
	/**
	* Get the number of calories per serving of this Food.
	* @return the number of calories per serving.
	*/
	public int getCalories()
	{
	return this.calories;
	}
	/**
	* Set the number of calories per serving of this Food.
	* @param calories the calories per serving.
	*/
	public void setCalories(int calories)
	{
	this.calories = calories;
	}
	/**
	* Return a string representation of this Food.
	* @return a string in format Name -- Cost: $cost Calories: calories.
	*/
	public String toString()
	{
	return super.toString() + " Calories: " + calories;
	}
}

class Pastry extends Food {
	String flavor;
	
	//constructor
	public Pastry(String name, double cost, int calories, String flavor) {
		super(name, cost, calories);
		this.flavor = flavor;
	}
	
	//set flavor(mutator)
	public void setFlavor(String flavor) {
		this.flavor = flavor;
	}
	//get flavor(accessor)
	public String getFlavor() {
		return flavor;
	}
}

class Caviar extends Food implements LuxuryItem {
	String origin;
	double tax;
	static final double tax_rate = 0.15; //final double constant
	
	//constructor
	public Caviar(String name, double cost, int calories, String origin) {
		super(name, cost, calories);
		this.origin = origin;
	}
	
	//set origin(mutator)
	public void setOrigin(String origin) {
		this.origin = origin;
	}
	
	//get origin(accessor)
	public String getOrigin() {
		return this.origin;
	}
	
	//override LuxuryItem's method named 'calculateLuxuryIax'
	@Override
	public double calculateLuxuryTax() {
		tax = cost * tax_rate;
		return this.tax;
	}
}