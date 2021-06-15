package Midterm;
import java.util.Scanner;

public class BinarySum {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Input first binary number: ");
        int first=input.nextInt();
        System.out.print("Input second binary number: ");
        int second=input.nextInt();
        int sumBinary=binary2Decimal(first)+binary2Decimal(second);
        int sumDecimal=decimal2Binary(sumBinary);
        System.out.printf("Sum of two binary numbers: %d",sumDecimal);
    }
    private static int binary2Decimal(int binary) {
        int decimal = 0;
        int index = 0, a = 0;
        while (binary != 0) {
            a = binary % 10;
            decimal = (int) (decimal + a * Math.pow(2, index));
            binary = binary / 10;
            index++;
        }
        return decimal;
    }
    private static int decimal2Binary(int decimalNumber) {
        int decimalNumber1 = decimalNumber;
        int b;
        int [] binary = new int[8];
        StringBuilder binaryNumber = new StringBuilder();
        int index = 0;

        while (decimalNumber1 > 0){
            b = decimalNumber1 % 2;
            decimalNumber1 = decimalNumber1 / 2;
            binary[index] = b;
            index += 1;
        }

        for (int i = (binary.length)-1; i >= 0; i--){
            binaryNumber.append(binary[i]);
        }

        return Integer.parseInt(String.valueOf(binaryNumber));


    }
}
