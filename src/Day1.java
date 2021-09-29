import java.util.Scanner;

public class Day1 {

    //30 days of coding Day
    //Day 1: Data Types

    public static void main(String[] args){

        //Declare variables to be added to input variables.
        int i = 4;

        double d = 4.0;

        String s = "HackerRank ";

        //Import Java Scanner
        Scanner sc = new Scanner(System.in);

        //Declare input variables
        int i2 = sc.nextInt();

        double d2 = sc.nextDouble();

        sc.nextLine();
        String s2 = sc.nextLine();
        sc.nextLine();

        //Print and run to test
        System.out.println(i + i2);
        System.out.println(d + d2);
        System.out.println(s + s2);
    }
}
