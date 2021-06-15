package Week3;
import java.util.Scanner;

public class Odd_or_Even {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        if(number == 0)
        {
            System.out.println("0 is not odd nor even");
        }
        else if(number%2==0)
        {
            System.out.println("This number is even");
        }
        else{
            System.out.println("This number is odd");
        }
    }
}
