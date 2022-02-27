
import java.util.Scanner;
class Insurance {
    public static void main (String args[]) {
    	int curr, birth;
    	try (Scanner input = new Scanner(System.in)) {
			System.out.print("Please enter length >> ");
			curr = input.nextInt();
			
			System.out.print("Please enter height >> ");
			birth = input.nextInt();}
    	System.out.println(calculatePremium(curr, birth));
    	
    
    	
		
    	
        // Write your code here
    }

    public static int calculatePremium(int curr, int birth) {
      return (((curr - birth) / 10) + 15) * 20;
        
		
    }
}
