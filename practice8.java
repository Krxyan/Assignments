import java.util.Scanner;

public class practice8 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

        System.out.println("Enter the name of the first political party");
        String name1 = input.nextLine();

        System.out.println("Enter the amount of vote for " + name1);
        int vote1 = input.nextInt();

        
        System.out.println("Enter the name of the second political party");
        String name2 = input.nextLine();

        System.out.println("Enter the amount of vote for " + name2);
        int vote2 = input.nextInt();


        System.out.println("Enter the name of the third political party");
        String name3 = input.next();

        System.out.println("Enter the amount of vote for " + name3);
        int vote3 = input.nextInt();

        double TotalVote = vote1 + vote2 + vote3;
        double TotalPercent1 = ((vote1)* 100/(TotalVote));
        double TotalPercent2 = ((vote2)* 100/(TotalVote));
        double TotalPercent3 = ((vote3)* 100/(TotalVote));

        System.out.println(name1 +TotalPercent1);
        System.out.println(name2 +TotalPercent2);
        System.out.println(name3 +TotalPercent3);

	}

}
