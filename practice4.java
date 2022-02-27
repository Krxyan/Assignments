import java.util.Scanner;
public class practice4 {

	public static void main(String[] args) {
		int a;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number of adult meals ordered >>");
		a = scan.nextInt();
		int b;
		
		System.out.println("Enter number of child meals ordered >>");
		b = scan.nextInt();
		double total1 = a*7.00 ;
		double total2 = b*4.00 ;
		double total3 = total1 + total2;
		System.out.println( a + " adult meals were ordered at 7.0 each." +"\n      Total is " + total1 +
				"\n"+ b+ " child meals were ordered at 4.0 each."+
		"\n      Total is " + total2 + "\n Grand total for all meals is " + total3);
				

	}

}
