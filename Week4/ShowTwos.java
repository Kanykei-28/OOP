package Week4;
import java.awt.*;
import java.util.Scanner;

public class ShowTwos {
    public static void main(String[] args) {
        // write your code here
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        System.out.printf("%d = ", num);
        showTwos(num);

    }

    public static String showTwos(int number){
        // write your code here
        String output = "";
            while (number % 2 == 0){
                number = number/2;
                output = output + 2+ " * ";

        }
        System.out.print(output);
        System.out.print(number);
        return "Hi";
    }
}