package Week4;
import java.util.Scanner;

public class RoundSum {
    public static void main(String[] args) {
        // add your code here
        Scanner input = new Scanner(System.in);
        System.out.print("Enter three integers: ");
        int first = input.nextInt();
        int second = input.nextInt();
        int third = input.nextInt();

        System.out.printf("Rounded sum is %d", roundSum(first, second, third));
    }

    private static int roundSum(int number1, int number2, int number3) {
        // add your code here
        int sum = number1+number2+number3;
        int count = 0;
        int output = 1;
        while(sum>=10){
            sum = sum - 10;
            count +=1;
        }
        if (sum>=5){
            output = (count+1)*10;

        }
        else{
            output = count*10;
        }


        return output;

    }
}
