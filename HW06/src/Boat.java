abstract class Boat extends Item
{
int horsepower;
/**
* Construct a Boat item with specified name, cost, and horsepower.
* @param name the name of the food.
* @param cost the cost of the food.
* @param horsepower the horsepower of the boat's engine.
*/
public Boat( String name, double cost, int horsepower )
{
super( name, cost );
this.horsepower = horsepower;
}
/**
* Get the number of horsepower for this Boat.
* @return the horsepower of this boat's engine.
*/
public int getHorsepower()
{
return this.horsepower;
}
/**
* Set the number of horsepower for this boat.
* @param horsepower the boat engine's horsepower.
*/
public void setHorsepower(int horsepower)
{
this.horsepower = horsepower;
}
/**
* Return a string representation of this Food.
* @return a string in format Name -- Cost: $cost Horsepower: horsepower.
*/
public String toString()
{
return super.toString() + " Horsepower: " + horsepower;
}
}

class Motorboat extends Boat {
	int seats;
	
	//constructor
	public Motorboat(String name, double cost, int horsepower, int seats) {
		super(name, cost, horsepower);
		this.seats = seats;
	}
	
	//set seat(mutator)
	public void setSeat(int seats) {
		this.seats = seats;
	}
	
	//get seat(accessor)
	public int getSeat() {
		return seats;
	}
}

class Yacht extends Boat implements LuxuryItem {
	int cabins;
	double tax;
	static final double tax_rate = 0.1; //final double constant
	
	//constructor
	public Yacht(String name, double cost, int horsepower, int cabins) {
		super(name, cost, horsepower);
		this.cabins = cabins;
	}
	
	//set cabin(mutator)
	public void setCabin(int cabins) {
		this.cabins = cabins;
	}
	
	//get cabin(accessor)
	public int getCabin() {
		return cabins;
	}
	
	//override LuxuryItem's method named 'calculateLuxuryIax'
	@Override
	public double calculateLuxuryTax() {
		tax = this.cost * tax_rate;
		return this.tax;
	}
}
