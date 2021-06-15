package Week5;
import java.util.InputMismatchException;
import java.util.Scanner;
public class SumOfDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try {
            long elem = input.nextLong();
            long positive = Math.abs(elem);
            if (Long.toString(positive).length() > 10){
                System.out.println("error");
            } else {
                System.out.println(addition(positive));
            }

        } catch (InputMismatchException e){
            System.out.println("error");
        }
    }


    public static int addition(long num) {
        long a = num;
        int lastDigit = 0;
        int sum = 0;

        while (a > 0) {
            lastDigit = (int) (a % 10);
            a /= 10;
            sum += lastDigit;
        }
        return sum;
    }

}
