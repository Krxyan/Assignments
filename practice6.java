import java.util.Scanner;

public class practice6 {

	public static void main(String[] args) {
		//int totalDollarsString;
		int totalDoller;
		
	
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of doller you want converted");
		totalDoller = input.nextInt();
		//totalDoller = (totalDollarsString);
		int TotalTwenty = totalDoller / 20;
		int remaindertwenty = (totalDoller % 20);
		int TotalTen = remaindertwenty / 10;
		int remainderten = (totalDoller % 10);
		int TotalFive = remainderten / 5;
		int remainderfive = (totalDoller % 5);
		int TotalOne = remainderfive / 1;
		
		System.out.println("$" + totalDoller + " converted is " + TotalTwenty + " $20s, " + TotalTen + " $10s, " + TotalFive + " $5s, " + TotalOne + " $1s.");
	
		
		
		
		
		

	}

}
