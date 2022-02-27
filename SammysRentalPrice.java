import java.util.Scanner;
public class SammysRentalPrice {

	public static void main(String[] args) {
		
		int minute;
		int minute_hour = 60;
		
		try (Scanner next = new Scanner(System.in)) {
			System.out.println("How many minute will you rent the equipment for >>> ");
			minute = next.nextInt();
			}
	
		int totalhour;
		int extraMin;
		
		totalhour = minute / minute_hour;
	     extraMin = minute % minute_hour;
	     double total1 = totalhour * 40;
	     double total2 = extraMin * 1;
	     double total3 = total1 + total2;
	 	System.out.println("SSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS");
		System.out.println("S Sammy’s makes it fun in the sun. S");
		System.out.println("SSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS\n");
		System.out.println("Rented the equipment for >>> " + totalhour + " hours and " +
		extraMin + " min " + " \nWhich brings the total price to >>> $"+ total3);
}
}
