
public class PNUStoreCheckout {
	public static void main(String[] args) {
		NotCheapStore PNUStore = new NotCheapStore("PNUStore");

		 PNUStore.enterItem(new Candy("Peanut Butter Fudge", 2.25, 399));
		 PNUStore.enterItem(new IceCream("Vanilla Ice Cream",105));
		 PNUStore.enterItem(new Sundae("Choc. Chip Ice Cream",145, "Hot Fudge", 50));
		 PNUStore.enterItem(new Cookie("Oatmeal Raisin Cookies", 4, 399));
		 /*System.out.println("\nNumber of items: " + PNUStore.numberOfItems() + "\n");
		 System.out.println("\nTotal cost: " + PNUStore.totalCost() + "\n");
		 System.out.println("\nTotal tax: " + PNUStore.totalTax() + "\n");
		 System.out.println("\nCost + Tax: " + (PNUStore.totalCost() + PNUStore.totalTax()) + "\n");*/
		 System.out.println(PNUStore.displayReceipt());
	
		 PNUStore.clear();

		 PNUStore.enterItem(new IceCream("Strawberry Ice Cream",145));
		 PNUStore.enterItem(new Sundae("Vanilla Ice Cream",105, "Caramel", 50));
		 PNUStore.enterItem(new Candy("Gummy Worms", 1.33, 89));
		 PNUStore.enterItem(new Cookie("Chocolate Chip Cookies", 4, 399));
		 PNUStore.enterItem(new Candy("Salt Water Taffy", 1.5, 209));
		 PNUStore.enterItem(new Candy("Candy Corn",3.0, 109));
		 /*System.out.println("\nNumber of items: " + PNUStore.numberOfItems() + "\n");
		 System.out.println("\nTotal cost: " + PNUStore.totalCost() + "\n");
		 System.out.println("\nTotal tax: " + PNUStore.totalTax() + "\n");
		 System.out.println("\nCost + Tax: " + (PNUStore.totalCost() + PNUStore.totalTax()) + "\n");*/
		 System.out.println(PNUStore.displayReceipt());
	}
}
