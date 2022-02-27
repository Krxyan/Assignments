/** To encourage good grades, Hermosa High School has decided to award
 *  each student a bookstore credit that is 10 times the student’s grade point average.

In other words, a student with a 3.2 grade point average receives a $32.0 credit.

Create an application that prompts a student for a name and grade point
 average, and then passes the values to a method (computeDiscount) that
  displays a descriptive message. The message uses the student’s name,
   echoes the grade point average, and computes and displays the credit.

An example of the program is shown below:**/







import java.util.Scanner;
public class BookstoreCredit {
    public static void main (String args[]) {
        String name;
        double num2 = 0.0;
        
        try (Scanner input = new Scanner(System.in)) {
			System.out.print("Please enter your cute name >> ");
			name = input.nextLine();
			System.out.print("Please enter your gpu that everyone cares about until u have a mental breakdown >> ");
			num2 = input.nextDouble();}
        
        computeDiscount(name, num2);
        
        
    }

    public static void computeDiscount(String name, double num2) {
    	System.out.println( name + ", your GPA is " + num2  + ", so your credit is $" + (num2 * 10) );
        
    }

}
