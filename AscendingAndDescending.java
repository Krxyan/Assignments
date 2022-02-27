// This code will take 3 input from the user and return them in both ascending and descending order
import java.util.Scanner;
public class AscendingAndDescending {
    public static void main(String[] args) {
    	//Asaigning variables
    	int n1,n2,n3,max,min,m;
    	//Scanner 
    	System.out.println("Hi you will be prompted to enter 3 different integer number for the program \n"
    			+ "Please enter the first integer number >>>");
    	try (Scanner s = new Scanner(System.in)) {
			n1 = s.nextInt();
			System.out.println("Next integer number please >>>");
			n2 = s.nextInt();
			System.out.println("Last integer number please >>>");
			n3 = s.nextInt();
		}
    	
    	max = n1;
    	min = n1;
    	if(n2>max)max=n2;
    	if(n3>max)max=n3;
    	if(n2<min)min=n2;
    	if(n3<min)min=n3;
    	m = (n1+n2+n3) - (min + max);
    	System.out.println("Ascending order " + min+" " + m +" "+ max);
    	System.out.println("Descending order " + max + " " + m + " " + min);
    }
}
