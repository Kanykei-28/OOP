package Week5;
import java.util.Scanner;
public class ZeroFront {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] numbers = input.nextLine().trim().split(" ");
        try {
            int[] numArray = new int[numbers.length];
            for (int i = 0; i < numbers.length; i++) {
                numArray[i] = Integer.parseInt(numbers[i]);
            }
            int[] resultArray = change(numArray);
            for (int j : resultArray) System.out.print(j + " ");

        } catch (NumberFormatException e) {
            System.out.println("Input Error");
        }
    }

    public static int[] change(int[] numArrayInt) {
        int temp = 0;
        for (int i = 0; i < numArrayInt.length; i++) {
            for (int j = 1; j < (numArrayInt.length - i); j++) {
                if (numArrayInt[j] == 0) {

                    //swap elements
                    temp = numArrayInt[j - 1];
                    numArrayInt[j - 1] = numArrayInt[j];
                    numArrayInt[j] = temp;
                }
            }
        }
        return numArrayInt;
    }
}

