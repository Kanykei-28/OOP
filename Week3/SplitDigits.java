package Week3;
import java.util.Scanner;

public class SplitDigits {
    public static void main(String[] args) {
        splitDigits();
    }

    private static void splitDigits() {
        Scanner input = new Scanner(System.in);
        String splitting = input.nextLine();
        String numbers = splitting.trim();
        int i = 0;
        if (numbers.length() > 5) {
            System.out.println("Number is too long!");
        }
        else if (numbers.length() < 5) {
            System.out.println("Number is too short!");
        }
        else{
            String[] digit = numbers.split("(?!^)");
            for(String character : digit){
                System.out.print(character + "\n");
            }

        }
    }
}

