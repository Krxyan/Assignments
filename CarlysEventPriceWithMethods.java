import java.util.Scanner;

public class CarlysEventPriceWithMethods {
	
	public static void main(String[] args) {
		displayMotto();
		int guest=getNumberOfGuests();
		computeEventPrice(guest);
		
	
	}

public static int getNumberOfGuests()

{



try (Scanner scanner = new Scanner(System.in)) {
	int numGuests;

	System.out.println("Enter number of guests :");

	

	numGuests=scanner.nextInt();

	return numGuests;
}
}

	public static void computeEventPrice(int numGuests) {
	
		final int Price_Person=35;
		int totalPrice = 0;
		boolean isLargeParty=false;
		totalPrice=numGuests*Price_Person;
		if(numGuests>=50)

			isLargeParty=true;
		System.out.println

		("Number of Guests : "+numGuests);
		System.out.println("Total Price $: "+totalPrice);
		if(isLargeParty)
			System.out.println("It is a Large Party: ");

		else
			System.out.println

			("It is not large party.");
		}
	public static void displayMotto()

	{

	

	String carlyMotto= "Carly's makes the food that makes it a party";

	System.out.println("Carly's Motto");

	System.out.println("*************************" +

	"********************************");

	

	System.out.println("*\t"+carlyMotto+"\t*");

	System.out.println("*************************" +

	"********************************");

	
	}

	public static String getEventNumber() {
		// TODO Auto-generated method stub
		return null;
	}
	
	


	}
	


