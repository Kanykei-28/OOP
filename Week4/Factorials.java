package Week4;
import java.util.Scanner;

public class Factorials {
    public static void main(String[] args) {
        // add your code here
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer number: ");
        int number = input.nextInt();
        factorialOfN(number);
    }

    private static long factorialOfN(int n) {
        // add your code here
        int a = 1;
        if(n<0){
            System.out.println("Incorrect Input!");
        }
        else{
            System.out.print("X    X!");
            System.out.print("\n0    1");
            for (int i = 1; i <= n; i++){
                    a = a*i;
                    System.out.printf("\n%d    %d", i, a);

            }
        }
        return (long) 1234.66;
    }

}