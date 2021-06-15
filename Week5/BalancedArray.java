package Week5;
import java.util.Scanner;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;


public class BalancedArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String givenArray = input.nextLine();
        Scanner lineScan = new Scanner(givenArray);
        boolean Balanced = false;
        boolean Valid = true;
        int[] numbers = new int[10];
        int[] first = new int[10];
        int[] second = new int[10];

        int i;
        try {
            while(lineScan.hasNext()) {
                for(i = 0; i < numbers.length; ++i) {
                    numbers[i] = lineScan.nextInt();
                }
            }
        } catch (Exception var11) {
            if (var11 instanceof InputMismatchException) {
                Valid = false;
            } else {
                if (!(var11 instanceof NoSuchElementException)) {
                    throw var11;
                }

                Valid = true;
            }
        }

        for(i = 0; i < numbers.length; ++i) {
            first[i] = numbers[i];

            for(int j = i + 1; j < numbers.length; ++j) {
                second[j] = numbers[j];
                if (j == numbers.length - 1) {
                    if (Arrays.stream(first).sum() == Arrays.stream(second).sum()) {
                        Balanced = true;
                    } else {
                        Arrays.fill(second, 0);
                    }
                }
            }
        }

        if (Balanced && Valid) {
            System.out.println("Can be balanced");
        } else if (!Balanced && Valid) {
            System.out.println("Can not be balanced");
        } else {
            System.out.println("Error");
        }

    }
}