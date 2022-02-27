import java.time.*;
public class TestMonthHandling {
    public static void main(String[] args) {
        LocalDate jan31;
        LocalDate dec31;
       jan31=LocalDate.of(LocalDate.now().getYear(),1,31);
//Assigning current year to the date December 31
dec31=LocalDate.of(LocalDate.now().getYear(),12,31);
//Looping to print 3 dierent dates
for(int i=0;i<3;i++)
{
//Adding months to jan31 using plusMonths()
System.out.println(jan31.toString()+" + "+(i+1)+" months= "+jan31.plusMonths(i+1));
//Adding months to dec31 using plusMonths()
System.out.println(dec31.toString()+" + "+(i+1)+" months= "+dec31.plusMonths(i+1));
    }
}
}
