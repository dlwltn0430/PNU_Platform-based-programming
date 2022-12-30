import java.util.*;

public class beanMachine {
	public static void main(String[] args) {
		//print name and school numbers
		System.out.println("Name: Lee Jisu");
		System.out.println("School Numbers: 202155592");
		System.out.println();
		
		//generate object of Scanner to get input
		Scanner input = new Scanner(System.in);
		
		//assign the integer input from user to the variable named num_ball
		System.out.print("Enter the number of balls to drop: ");
		int num_ball = input.nextInt();
		//assign the integer input from user to the variable named num_slot
		System.out.print("Enter the number of slots in the bean machine: ");
		int num_slot = input.nextInt();
		
		//declare an array named slots to store the number of balls in a slot
		int[] slots = new int[num_slot];
		for (int i = 0; i < num_ball; i++) {
			//generate a string named path to store the path for the ball
			StringBuilder path = new StringBuilder(num_slot);
			//declare a variable named num_R to count the number of "R" in the path
			int num_R = 0;
			for (int j = 0; j < num_slot - 1; j++) {
				//generate object of Random to get random number
				Random r = new Random();
				//if a return value of r.nextBoolean() is true(1), append "L" to the path
				if (r.nextBoolean()) path.append("L");
				//if a return value of r.nextBoolean() is false(0), append "R" to the path and increase num_R
				else {
					path.append("R");
					num_R++;
				}
			}
			//increase slots[num_R] because the number of "R" is the position of slot where the ball falls
			slots[num_R]++;
			//print the path one by one
			System.out.println(path.toString());
		}
		
		//display the final buildup of the balls in the slots in a histogram
		for (int i = num_ball; i > 0; i--) {
			for (int j = 0; j < num_slot; j++) {
				if (slots[j] >= i) System.out.print("0");
				else System.out.print(" ");
			}
			System.out.println();
		}
		
	}		
}
