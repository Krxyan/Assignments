import java.util.*;
public class EvenEntryLoop {
    public static void main (String args[]) {
       @SuppressWarnings("unused")
	//final int sentinel=999;
       int remainder;
       int number;
       System.out.println("Please enter an Even Number");
	      Scanner scan = new Scanner(System.in);
	      number= scan.nextInt();
      
	      
	      while (number != 999) {
	    	  
	    	
	   	   
		   	   	remainder = number % 2;
		   	   	if( remainder == 0)
		   	   		System.out.println(" Good job");
		   	   	else
		   	   		System.out.println(number + " is not an even number");
		   	   	
		   	   	System.out.println("Enter another even number or 999 to stop");
		   	   		number= scan.nextInt();
		   	   	
	    	   
    	      
    	   
       }
       
       
       
    }
}

