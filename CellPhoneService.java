import java.util.*;
@SuppressWarnings("unused")
public class CellPhoneService {
    public static void main (String args[]) {
    	int talkmin,textmsg,gbdata;
    	String pa,pb,pc,pd,pf;
    	pa="Plan A";
    	pb="Plan b";
    	pc="Plan c";
    	pd="Plan d";
    	pf="Plan f";
    	
    	
    	System.out.println("Enter talk minutes needed");
        Scanner scan= new Scanner(System.in);
        talkmin = scan.nextInt();
        System.out.println("Enter talk text needed");
        textmsg = scan.nextInt();
        System.out.println("Enter talk data needed");
        gbdata = scan.nextInt();
        
        if(talkmin<500 && textmsg==0 && gbdata==0)

            System.out.println(pa);

            else if(talkmin<500 && textmsg>0 && gbdata==0)

            {

                 System.out.println("PLAN B IS RECOMMENDED FOR THIS USER at 55$ permonth");

            }

            else if(talkmin>=500 && textmsg<100 && gbdata==0)

            {

                 System.out.println("PLAN C IS RECOMMENDED FOR THIS USER at 61$ permonth");

            }

            else if(talkmin>=500 && textmsg>=100 && gbdata==0)

            {

                 System.out.println("PLAN D IS RECOMMENDED FOR THIS USER at 70$ permonth");

            }

            else if(gbdata>0 && gbdata<2)

            {

                 System.out.println("PLAN E IS RECOMMENDED FOR THIS USER at 79$ permonth");

            }

            else if(gbdata>=2)

            {

                 System.out.println("PLAN F IS RECOMMENDED FOR THIS USER at 87$ permonth");

            }

       }

   
       
        
      /**plan A  $49 per month 
         plan B  $55 per month
         Plan C  $61 per month
         Plan D  $70 per month
         Plan F  $87 per month **/

        
        
    }

