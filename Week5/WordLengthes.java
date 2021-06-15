package Week5;
import java.util.Scanner;
public class WordLengthes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String line = input.nextLine();
        String[] a = line.split(" ");

        for(int i = 0; i < a.length; ++i) {
            String wordLength = worLengths(a[i]);
            System.out.printf("%d: %s\n", i + 1, wordLength);
        }

    }
    public static String worLengths(String given) {
        given = given.toLowerCase();
        String symbol = "";
        int lengthCount = 0;

        for(int i = 0; i < given.length(); ++i) {
            if (given.charAt(i) >= 'a' && given.charAt(i) <= 'z') {
                symbol = symbol + "*";
                ++lengthCount;
            }
        }

        String result = Integer.toString(lengthCount);
        return result + "\t" + symbol;
    }
}
