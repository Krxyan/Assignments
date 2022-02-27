// DebugFive4.java
// Outputs highest of four numbers
import java.util.*;
public class DebugFive4
{
   public static void main (String args[]) 
   {
      Scanner input = new Scanner(System.in);
      int one, two, three, four,m;
      String str;
	int output;
      System.out.println("Enter an integer");
      str = input.next();
      one = Integer.parseInt(str);
      System.out.println("Enter an integer");
      str = input.next();
      two = Integer.parseInt(str);
      System.out.println("Enter an integer");
      str = input.next();
      three = Integer.parseInt(str);
      System.out.println("Enter an integer");
      str = input.next();
      four = Integer.parseInt(str);
      	m = one;
  		
  	if(two>m)m=two;
  	if(three>m)m=three;
  	if(four>m)m=four;
 
      
      
      
  
              output = m;
      System.out.println("Highest is "+output);
   }
}


