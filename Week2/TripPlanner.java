package Week2;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;
public class TripPlanner {
    public static void main(String [] args) {
        // Part 1: Greeting
        // greeting();

        // Part 2: Travel Time and Budget
        // travelTimeBudget();

        // Part 3: Time difference
        // timeDifference();

        // Part 4: Country Area
        countryArea();
    }

    public static void greeting(){
        // write your code here

    }

    private static void travelTimeBudget(){
        // write your code here

    }

    public static void timeDifference(){
        // write your code here
    }

    public static void countryArea(){
        Scanner input = new Scanner(System.in);
        System.out.println("What is square area of your destination country in km2?");
        int distance = input.nextInt();
        DecimalFormat df2 = new DecimalFormat("#.##");
        df2.setRoundingMode(RoundingMode.DOWN);
        float miles= (float) (distance*0.38610215854245);
        System.out.printf("In miles2 that is "+df2.format(miles));
    }
}