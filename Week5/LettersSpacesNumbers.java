package Week5;
import java.util.Scanner;
public class LettersSpacesNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char[] a = new char[100];
        String sentence = input.nextLine();
        a = sentence.toCharArray();
        int letter = 0;
        int space = 0;
        int number = 0;
        int other = 0;

        for (int i = 0; i < a.length; ++i) {
            if (Character.isLetter(a[i])) {
                ++letter;
            } else if (Character.isDigit(a[i])) {
                ++number;
            } else if (Character.isSpaceChar(a[i])) {
                ++space;
            } else {
                ++other;
            }
        }

        System.out.println("letter: " + letter);
        System.out.println("space: " + space);
        System.out.println("number: " + number);
        System.out.println("other: " + other);
    }
}