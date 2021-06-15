package Week5;
import java.util.Scanner;

public class AdjacentArrayElements {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(System.in);
            String elements = input.nextLine();
            String[] inputArray = elements.trim().split(" ");
            if (inputArray.length != 10) {
                throw new NumberFormatException("incorrect length");
            }
            int[] nums = new int[inputArray.length];
            for (int i = 0; i < inputArray.length; i++) {
                nums[i] = Integer.parseInt(inputArray[i]);
            }
            System.out.println(adjacentArray(nums));
        } catch (NumberFormatException e) {
            System.out.println("Error");
        }
    }
    public static int adjacentArray(int[] array) {
        int output = 0;
        int last = array.length - 1;
        for (int i = 2; i < array.length; i++) {
            if (array[i - 1] == array [i - 2] && array[i - 1] != array[i]) {
                output += 1;
            }
            if (i == last) {
                if (array[i] == array[last - 1]) {
                    output += 1;
                }
            }
        }
        return output;
    }
}