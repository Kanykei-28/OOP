package Week4;
import java.util.Scanner;

public class Decimal2Binary {
    public static void main(String[] args) {
        // you may modify the code below, but try to preserve the program structure
        int decimalNumber;
        Scanner console = new Scanner(System.in);
        System.out.print("Enter an integer number: ");
        decimalNumber = console.nextInt();

        System.out.printf("Binary of %d is %s", decimalNumber, decimalToBinary(decimalNumber));
    }

    private static String decimalToBinary(int decimalNumber) {
        // add your code below that implements the logic of the problem instructions.
        String binary = "";

        for (int i = 1; i <= 8; ++i) {
            if (decimalNumber <= 1) {
                binary = binary + String.valueOf(decimalNumber);
                break;
            }

            int k = decimalNumber % 2;
            decimalNumber /= 2;
            binary = binary + String.valueOf(k);
        }

        String finalStr = "";
        binary = (new StringBuilder(binary)).reverse().toString();

        for (int count1 = 1; count1 <= 8 - binary.length(); ++count1) {
            finalStr = finalStr + "0";
        }

        binary = finalStr + binary;
        return binary;
    }
}
