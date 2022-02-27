

import java.util.*;

import java.time.LocalDate;

public class PastPresentFuture

{

public static void main(String args[])

{

/*Initializing an array with days of month in a sequence, february with 28 days - it would be changed afterwards if the year entered is a leap year.*/

int daysOfmonth[]={31,28,31,30,31,30,31,31,30,31,30,31};

LocalDate today=LocalDate.now();

int mo,da,yr;

int todayMo,todayDa,todayYr;

//storing the values of today's day,month & year in 3 variables

todayMo=today.getMonthValue();

todayDa=today.getDayOfMonth();

todayYr=today.getYear();

//taking inputs of day,month & year from console which would be used later for checking

Scanner input=new Scanner(System.in);

System.out.println(":::Program to find whether a date is in past/present/future:::");

System.out.print("Enter month::");

mo=input.nextInt();

System.out.print("Enter day::");

da=input.nextInt();

System.out.print("Enter year::");

yr=input.nextInt();

/*finding whether the entered year is leap year or not based on standard logic and making the days of february to 29 if it is a leap year.*/

if(yr%100==0)

{

if(yr%400==0)

daysOfmonth[1]++;

}

else

{

if(yr%4==0)

daysOfmonth[1]++;

}

System.out.print("The date you entered -- ");

/*checking if the month value is between 1 to 12 and day entered is with in the boundary limits of the respective month using the array initialized above.

if the date entered is invalid, we are informing the user about the same and stopping the program.*/

if(!(mo>=1 && mo<=12 && da>=0 && da<=daysOfmonth[mo-1]))

{

System.out.println("invalid !!");

System.exit(0);

}

//logic to print the 4 statements as per the question

if(yr!=todayYr)

System.out.println(yr+" is not this year.");

else

if(mo<todayMo)

System.out.println("month "+mo+" in an earlier month this year.");

else

if(mo>todayMo)

System.out.println("month "+mo+" in a later month this year.");

else

System.out.println("month "+mo+" is this month.");

}

}
