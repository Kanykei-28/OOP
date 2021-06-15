package Quiz1;
import java.util.Scanner;

public class ReverseTriangleOfNumbers {
    public static void main(String[] args) {
        // add your code here
        Scanner input = new Scanner(System.in);
        System.out.print("Enter N: ");

        if (input.hasNextInt()){
            int number = input.nextInt();
            if (number >= 1 && number <= 30)
            {
                for (int i = number; i>=1; i--){
                    for (int k = number - i;k>0; k--){
                        System.out.print("  ");
                    }
                    for (int j = 1; j<=i; j++){
                        System.out.print(j+" ");
                    }
                    System.out.println(" ");
                }


            }
            else{
                System.out.println("Incorrect Input!");
            }
        }
        else{
            System.out.println("Incorrect Input!");
        }


    }
}