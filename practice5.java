import java.util.Scanner;

class practice5
{
  public static void main(String[] args) {

     long inches;
     final long INCHES_IN_FOOT = 12;
    
     @SuppressWarnings("resource")
        Scanner inputDevice = new Scanner(System.in);

            System.out.println("Enter inches >> ");
        inches = inputDevice.nextInt();
         long inchesLeft = inches % 12;
        long in, ft;
        in = inches;
        ft = inches / INCHES_IN_FOOT;
     System.out.println(inches + " inches is " +
        ft + " feet and " + inchesLeft + " inches");
  }
}