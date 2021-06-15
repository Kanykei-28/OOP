package Week5;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MaximumSpan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String console = input.nextLine().trim();
        String[] line = console.split(" ");
        int[] array = new int[line.length];

        for(int i = 0; i < line.length; ++i) {
            array[i] = Integer.parseInt(line[i]);
        }

        System.out.println(maxSpan(array));
    }

    private static int maxSpan(int[] numbers) {
        int count = 0;
        ArrayList<Integer> result = new ArrayList();
        new ArrayList();

        for(int i = 0; i < numbers.length; ++i) {
            for(int j = i + 1; j < numbers.length; ++j) {
                if (numbers[i] == numbers[j]) {
                    result.add(j + 1 - i);
                    ++count;
                }
            }
        }

        if (count == 0) {
            return 1;
        } else {
            Collections.sort(result);
            return (Integer)result.get(result.size() - 1);
        }
    }
}
