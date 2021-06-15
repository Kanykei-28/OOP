package Week4;
import java.util.Scanner;

public class Binary2Decimal {
    public static void main(String[] args) {
        // you may modify the code below, but try to preserve the program structure
        int binaryNumber;
        Scanner console = new Scanner(System.in);
        System.out.print("Enter a binary number: ");
        binaryNumber = console.nextInt();

        System.out.printf("Decimal of %d is %d", binaryNumber, binaryToDecimal(binaryNumber));
    }

    private static int binaryToDecimal(int binaryNumber) {
        // add your code below that implements the logic of the problem instructions.
        int decimal = 0;
        int remainder;
        for(int count = -1; binaryNumber > 0; decimal = (int)((double)decimal + (double)remainder * Math.pow(2.0D, (double)count))) {
            ++count;
            remainder = binaryNumber % 10;
            binaryNumber = binaryNumber/10;
        }

        return decimal;
    }
}