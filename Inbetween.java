import java.util.Scanner;
public class Inbetween {
    public static void main (String args[]) 
    {
    	
    	
    	int num1;
    	int num2;
    	try (Scanner input = new Scanner(System.in)) {
			System.out.println("Input one integer");
			num1= input.nextInt();
			System.out.println("Enter another integer");
			num2= input.nextInt();
			
		}
    	if ((num1-num2==1 )||(num2-num1==1 ))
			System.out.println("There are no integers between " + num1 +" and "+num2);
			else
    	while(num1<num2-1) {
    	num1 += 1;
    		
    		
    				System.out.println(num1);
    		
    	
    	}
    	while(num2<num1-1){
    	num2+=1;
    		if ((num2-num1==1 )||(num1-num2==1 ))
    		System.out.println("There are no integers between " + num2 +"and"+num1);
    			else
    	
    	System.out.println(num2);
    	}


    	}
    	}
