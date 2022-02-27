import java.util.Scanner;

public class practice3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		long a;
		// prompt the user for the amount of eggs 
	      Scanner scan = new Scanner(System.in);
	      System.out.println("Enter the amount of eggs you want to buy \n");

	      a = scan.nextInt();
	      long eggs = a;

	      

	    final long EGGS_IN_DOZEN = 12;
	    long dozen_eggs;
	     long looseEggs;
	     dozen_eggs = eggs / EGGS_IN_DOZEN;
	     looseEggs = eggs % EGGS_IN_DOZEN;
	     double total1 = dozen_eggs * 3.25;
	     double total2 = looseEggs * .45;
	     double total3 = total1 + total2;
	     
	     
	     System.out.println("You ordered "+ a +" eggs. That's "+
	        dozen_eggs + " dozen at $ 3.25 per dozen and " + looseEggs + " loose eggs at 45 cents each for a total of " + total3);
	}

}
