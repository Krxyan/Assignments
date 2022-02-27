import java.util.Scanner;

public class practice2 {
	/**Write a program that declares a variable named inches,
	 *  which holds a length in inches, and assign a value. Display
	 *   the value in feet and inches; for example: 86 inches is 7
	 *    feet and 2 inches. Be sure to use a named constant where appropriate. **/
	/**
	 * @param args
	 */
	

		 public static void main(String args[])
		   {
		      int myCredits = 13;
		      int yourCredits = 17;
		      double rate = 75.84;
		      System.out.println("My tuition: ");
		      TuitionBill(myCredits, rate, yourCredits);
		      System.out.println("Your tuition: ");
		      TuitionBill(myCredits, rate, yourCredits );
		      
		   }
		   public static void TuitionBill(int c, double r, int myCredits)
		   {
		      System.out.println("Total due "  + (c * r));
		      System.out.println("Total due "  + (myCredits * r));
		   }
		}
