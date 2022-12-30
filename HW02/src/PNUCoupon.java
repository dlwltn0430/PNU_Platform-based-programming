import java.util.Random;

public class PNUCoupon {
	public static int i = 0;
	public static int digits;
	Random rnd = new Random();
	StringBuffer buf = new StringBuffer();

	public PNUCoupon() {
		i++;
		digits = (int)(Math.random() * (9999 - 1000 + 1)) + 1000;

		for(int i = 0; i < 4; i++){
			if(rnd.nextBoolean())
				buf.append((char)((int)(rnd.nextInt(26)) + 97));
			else
				buf.append((char)((int)(rnd.nextInt(26)) + 65));
			}
		}
	
	public void Display() {
		System.out.println("Sequence ID: " + i);
		System.out.println("Name: Americano Tall");
		System.out.println("Expiration date: October 1");
		System.out.println("Bar code number: " + digits + "-" + buf);
		}
	
	public static void main(String[] args) {
		PNUCoupon starbucks1 = new PNUCoupon();
		starbucks1.Display();
		
		PNUCoupon starbucks2 = new PNUCoupon();
		starbucks2.Display();
		
		PNUCoupon starbucks3 = new PNUCoupon();
		starbucks3.Display();
		
		PNUCoupon starbucks4 = new PNUCoupon();
		starbucks4.Display();
		
		PNUCoupon starbucks5 = new PNUCoupon();
		starbucks5.Display();
		}
}
