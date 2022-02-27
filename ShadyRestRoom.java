import java.util.Scanner;
public class ShadyRestRoom {
    public static void main (String args[]) {
    	int Sel;//variables 
    	
    	
    	
    	System.out.println("Menu \n" + "\n(1) Queen bed" + "\n(2) King bed" + "\n(3) Suite with a king bed and pull-out couch \n" 
    	+ "\nEnter Selection (1, 2, or 3) >>");
    	// Scanner
    	Scanner scan = new Scanner (System.in);
    	Sel = scan.nextInt();
    	
    	int q = 125;
    	int k = 139;
    	int k1 = 165;
    	int i = 0;
    	
    	
    	
    	if (Sel == 1) 
    		System.out.println(q);
    	if (Sel == 2)
    		System.out.println(k);
    	if (Sel == 3)
    		System.out.println(k1);
    	if (Sel > 3)
    		System.out.println("invalid"+i);
    
    		
    	
    	
    	
    	
    	
    }
}
