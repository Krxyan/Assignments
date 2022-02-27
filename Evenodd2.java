import java.util.Scanner;

class Evenodd2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number >> ");
        int num = s.nextInt();
        if ( isEven(num) ) {
            System.out.println(num + " is even");
        }
        else {
            System.out.println(num + " is odd");
        }
        
    }
    public static boolean isEven(int num) {
        if(num % 2 == 0) {
        return true;
      }
        else {
        return false;
          }
    }
}
