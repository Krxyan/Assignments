import java.util.Scanner;

public class PaintCalculator1 {

	public static void main(String[] args) {
		double length, width, height;
		try (Scanner input = new Scanner(System.in)) {
			System.out.print("Please enter length >> ");
			length = input.nextDouble();
			System.out.print("Please enter width >> ");
			width = input.nextDouble();
			System.out.print("Please enter height >> ");
			height = input.nextDouble();}
		
		
			double cost = calcCost(height, width, length);
			System.out.println("Your total cost at $32/gallon is $" + cost);
      
	}

	public static double calcCost(double h, double w, double l) {
		// TODO Auto-generated method stub
		double wallArea = (h * w * 2) + (h * 1 * 2) ;
		System.out.println("Your fucking room has a wall area of " + wallArea + " sq ft");
		double gallonsNeeded = calcGallons(wallArea);
		System.out.println(gallonsNeeded + " Gallons are needed");
		double total = gallonsNeeded * 32;
		return total;
	}

	public static double calcGallons(double wa) {
		// TODO Auto-generated method stub
		
		return wa / 350;
	}


		
	}
	
	
	
	
	
	

}
