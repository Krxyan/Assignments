import java.util.Scanner;



public class practice7 {

	public static void main(String[] args) {
		 
		int twenties, tens, fives, ones, amount, n;//defining an integer variable

	       Scanner obcdf= new Scanner(System.in);//creating Scanner class object to input value

	       System.out.println("Enter amount: ");//print message

	       amount = obcdf.nextInt(); //input integer value

	       n =  amount; //holding innput value

	       if(amount > 20)//using if block that check amount value greater than 20

	       {

	           twenties = (int)(amount/20); //using twenties that divides amount value by 20 and hold its integer value  

	           amount = amount % 20;// holding modules value in amount variable

	       }

	       else  //defining else block

	       {

	           twenties = 0;//holding 0 in twenties variable  

	       }

	       if(amount > 10)//using if that check amount value greater than 10

	       {

	           tens = (int)(amount/10);//using tens that divides amount value by 10 and hold its integer value

	           amount = amount % 10;// holding modules value in amount variable

	       }

	       else  //defining else block

	       {

	           tens = 0;//holding 0 in tens variable  

	       }

	       if(amount > 5)//using if that check amount value greater than 5

	       {

	           fives = (int)(amount/5);//using tens that divides amount value by 5 and hold its integer value

	           amount = amount % 5;// holding modules value in amount variable

	       }

	       else //defining else block

	       {

	           fives = 0;//holding 0 in fives variable  

	       }

	       if(amount > 1)//using if that check amount value greater than 1

	       {

	           ones = (int) amount;//holding amount value in ones variable

	       }

	       else //defining else block

	       {

	           ones = 0;//holding 0 in ones variable

	       }  

	       System.out.println("$"+n+" converted is "+twenties+" $20s, "+tens+" $10s, "+fives+" $5s, and "+ones+" $1s."); //print value
	    
	}
	}

	