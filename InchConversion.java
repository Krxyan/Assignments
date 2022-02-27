/**Modify the class named InchConversion. Its main() method accepts a value 
 * in inches from a user at the keyboard, and in turn passes the entered
 *  value to two methods. One converts the value from inches to feet, 
 *  and the other converts the same value from inches to yards.

There are 12 inches in a foot and 3 feet in a yard.

Each method displays the results with appropriate explanation.

An example of the program is shown below:

Enter inches >> 430
430 inches is 35.833333333333336 feet
430 inches is 11.944444444444445 yards **/




import java.util.Scanner;
public class InchConversion {
    public static void main (String args[]) {
    	double num1 = 0;
    	             
        try (Scanner input = new Scanner(System.in)) {
			System.out.print("Please enter Inches >> ");
			num1 = input.nextInt();}
        convertToFeet(num1);
    	convertToYards(num1);
    	  
    }

    public static void convertToFeet(double num1) {
    	System.out.println( num1 + ", inches is " + num1/12  + " feet" );
    }
    public static void convertToYards(double num1) {
    	System.out.println( num1 + " inches is  " + num1/36  + " yards");
    }
}
