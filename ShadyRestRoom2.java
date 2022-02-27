import java.util.Scanner;
public class ShadyRestRoom2
{
   // Modify the code below
   public static void main (String args[])
   {
      int selection;
      int selection1;
      String pi = null;
      int price;
      String m;
      String result;
      final int QUEEN = 1, KING = 2, SUITE = 3;
      final int QPRICE = 125, KPRICE = 139,
         SPRICE = 165;
      final String QSTRING = "Queen bed", KSTRING = "King bed",
         SSTRING = "Suite with a king bed and pull-out couch",
         INVALIDSTRING = "an invalid option";
      Scanner in = new Scanner(System.in);
      System.out.println("\t\n\nMenu\n");
      System.out.println("(" + QUEEN + ") " + QSTRING);
      System.out.println("(" + KING + ") " + KSTRING);
      System.out.println("(" + SUITE + ") " + SSTRING);
      System.out.print("Enter Selection (1, 2, or 3) >> ");
      selection = in.nextInt();
      if(selection == QUEEN)
      {
         result = QSTRING;
         price = QPRICE;
      }
      else
         if(selection == KING)
         {
            result = KSTRING;
            price = KPRICE;
         }
         else
            if (selection == SUITE)
            {
                result = SSTRING;
                price = SPRICE;
            }
            else
            {
                result = INVALIDSTRING;
                price = 0;
             }
      System.out.println("Please choose a view:\r\n"
      		+ "(1) a lake\r\n"
      		+ "(2) a park\r\n"
      		+ "Enter Selection (1 or 2) >>");
      selection1= in.nextInt();
      	int l = 0;
		if (selection1 == 2) {
			m = "a park";
      	}
      	else
      	{
      	 pi = " invalid";
      		
      	}
		if (selection1 == 1)
			m = "a lake";
  		l = 15;
     
      	int price1 = price + l;
      	
		System.out.println("You selected " + result + "  $" + price1 + pi);
   }
}
