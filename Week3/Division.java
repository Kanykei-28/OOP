package Week3;
import java.util.Scanner;
public class Division {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a dividend: ");
        int Dividend = input.nextInt();
        System.out.print("Enter a divisor: ");
        int Divisor = input.nextInt();



        if (Divisor==0)
        {
            System.out.print("Incorrect input!");
        }
        else{
            System.out.println(Dividend/Divisor);
        }

    }
}
