import java.util.Scanner;
class EvenOdd {
    public static void main(String[] args) {
      int number;
      
      System.out.println("Please enter an Integer Number");
      Scanner scan = new Scanner(System.in);
      number= scan.nextInt();
      scan.close();
      isEven(number);
    }
   public static void isEven(int number) {
	   
	   int remainder;
	   
	   remainder = number % 2;
	   if( remainder == 0)
		   System.out.println(number + " is an even number");
	   else
		   System.out.println(number + "is an odd number");
		   
	   
	   
	   
	
	
    }
}
