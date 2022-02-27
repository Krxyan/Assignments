import java.util.Scanner;


public abstract class CarlysEventPrice {

	public static void main(String[] args) {
		int guest;
		final int price = 35;                                                          
		try (Scanner next = new Scanner(System.in)) {
			System.out.println("How many guests will attend this event");
			guest= next.nextInt();
			@SuppressWarnings("unused")
			int totalguest = (guest * price);
		
			
		}
			if (guest <= 50) {
				int totalguest = (guest * price);
				System.out.println("\n**********************************************");
				System.out.println("*Carly's makes the food that makes it a party*");
				System.out.println("**********************************************");
				System.out.println("\nTotal number of guest is >>> " + guest +
						"\nThe meals per guest is >>> $" + price + 
						" \nThe total would bring the price to >>> $" + totalguest+
						"\nAnd since this is an event with less then 50 guest it is considered a Small event ");
				
			} else {
				int totalguest = (guest * price);
				System.out.println("\n**********************************************");
				System.out.println("*Carly's makes the food that makes it a party*");
				System.out.println("**********************************************");
				System.out.println("\nTotal number of guest is >>> " + guest +
						"\nThe meals per guest is >>> $" + price + 
						" \nThe total would bring the price to $>>> " + totalguest+
						"\nAnd since this is an event with more then 50 guest it is considered a Large event ");
				
			}
		
		
		
		

	}

}
