package Week3;
import java.util.Scanner;

public class Rapper_Scissors_Rock {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Player1: ");
        String Player1 = input.nextLine();
        System.out.print("Player2: ");
        String Player2 = input.nextLine();

        if (Player1.equals("sc") && Player2.equals("pp"))
        {
            System.out.println("Winner is Player1");
        }
        else if (Player1.equals("sc") && Player2.equals("rc"))
        {
            System.out.println("Winner is Player2");
        }
        else if (Player1.equals("pp") && Player2.equals("sc"))
        {
            System.out.println("Winner is Player2");
        }
        else if (Player1.equals("pp") && Player2.equals("rc"))
        {
            System.out.println("Winner is Player1");
        }
        else if (Player1.equals("rc") && Player2.equals("sc"))
        {
            System.out.println("Winner is Player1");
        }
        else if (Player1.equals("rc") && Player2.equals("pp"))
        {
            System.out.println("Winner is Player2");
        }
        else if (Player1.equals("sc") && Player2.equals("sc") || Player1.equals("pp") && Player2.equals("pp") || Player1.equals("rc") && Player2.equals("rc"))
        {
            System.out.println("Draw");
        }
        else{
            System.out.println("Incorrect Input!");
        }



    }
}
