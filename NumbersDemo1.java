
/**Modify the NumbersDemo application whose main() method holds two integer variables. Assign values to the variables.

In turn, pass each value to methods named displayTwiceTheNumber(), displayNumberPlusFive(), and displayNumberSquared().

Create each method to perform the task its name implies.

An example of the program is shown below:

4 times 2 is 8
4 plus 5 is 9
4 squared is 16
33 times 2 is 66
33 plus 5 is 38
33 squared is 1089 **/



public class NumbersDemo1 {
	 public static void main (String args[]) {
	       int num1 = 4;
	       int num2 = 33;
	       
	       displayTwiceTheNumber(num1);
	       displayNumberPlusFive(num1);
	       displayNumberSquared(num1);
	      
	       displayTwiceTheNumber(num2);
	       displayNumberPlusFive(num2);
	      displayNumberSquared(num2);
	       
	    }
	    public static void displayTwiceTheNumber(int n) {
	    	System.out.println(n + " times 2 is " + n*2  );
	        // Write your code here
	    }
	    public static void displayNumberPlusFive(int n) {
	    	System.out.println(n + " plus 5 is " + (n + 5));

	        // Write your code here
	    }
	    public static void displayNumberSquared(int n) {
	    	System.out.println(n + " squared is  " + n*n  );

	        // Write your code here

	    }
	}

