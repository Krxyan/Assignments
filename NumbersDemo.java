
/*Create an application named NumbersDemo whose main()
method holds two integer variables. Assign values to
the variables. In turn, pass each value to methods 
named displayTwiceTheNumber(), displayNumberPlusFive(),
and displayNumberSquared(). Create each method to perform
the task its name implies.
 */


public class NumbersDemo {

	public static void main(String[] args) {
		int num1 = 4; 
		int num2 = 5;
		
		displayTwiceTheNumber(num1);
		displayTwiceTheNumber(num2);
		
		displayNumberPlusFive(num1);
		displayNumberPlusFive(num2);
		
		displayNumberSquared(num1);
		displayNumberSquared(num2);
		
		
	}
	
	
	public static void displayNumberSquared(
			int number) {
		System.out.println(number + " squared = " +  (number * number));

		
	}


	public static void displayTwiceTheNumber(int number) {
		System.out.println(number + " times 2 equals " + (number * 2));
		
		
	}
	
	public static void displayNumberPlusFive(int number) {
		System.out.println(number + " plus 5 equals " + (number + 2));

		
	}
	
	
	

}
