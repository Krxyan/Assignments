/**Assume that a gallon of paint covers about 350 square feet of wall space. 
 * Create an application with a main() method that prompts the user for the
 *  length, width, and height of a rectangular room. Pass these three values
 *   to a method that does the following:

Calculates the wall area for a room
Passes the calculated wall area to another method that calculates and returns 
the number of gallons of paint needed
Displays the number of gallons needed
Computes the price based on a paint price of $32 per gallon, assuming that the 
painter can buy any fraction of a gallon of paint at the same price as a whole gallon
Returns the price to the main() method
The main() method displays the final price. For example:

You will need 2.0 gallons
The price to paint the room is $64.0**/








import java.util.Scanner;
public class PaintCalculator {
    public static void main (String args[]) {
        int length = 0;
        int width = 0;
        int height= 0;
        try (Scanner input = new Scanner(System.in)) {
			System.out.print("Please enter length >> ");
			length = input.nextInt();
			System.out.print("Please enter width >> ");
			width = input.nextInt();
			System.out.print("Please enter height >> ");
			height = input.nextInt();}
       computeArea(length, width, height);
        
        
    }

    public static double computeArea(double length, double width, double height) {
        double Wallarea = ( length * width * height);
		return Wallarea;
    }
    public static double computeGallons(double area) {
        // Write your code here
    }
}




















