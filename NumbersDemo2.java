import java.util.Scanner;

public class NumbersDemo2 {
	
	public static void main(String[] args) {
		int num1 = 0; 
		int num2 = 0;
		
		try (Scanner input = new Scanner(System.in)) {
			System.out.print("Please enter an interger >> ");
			num1 = input.nextInt();
			System.out.print("Please enter an interger >> ");
			num2 = input.nextInt();
		}
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



