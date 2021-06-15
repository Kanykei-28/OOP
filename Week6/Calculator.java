package Week6;
import java.util.Scanner;

class Calculator{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] console = input.nextLine().trim().split(" ");
        int a = Integer.parseInt(console[0]);
        String operator = console[1];
        int b = Integer.parseInt(console[2]);
        switch (operator) {
            case "+":
                System.out.println(addition(a, b));
                break;
            case "-":
                System.out.println(subtraction(a, b));
                break;
            case "*":
                System.out.println(multiplication(a, b));
                break;
            case "%":
                System.out.println(a%b);
                break;
            case "/":
                try {
                    System.out.println(division(a, b));
                } catch (Exception e) {
                    System.out.println("Error");
                }
                break;
        }
    }
    private static int addition(int number1, int number2) {
        return (number1 + number2);
    }

    private static int subtraction(int number1, int number2) {
        return (number1 - number2);
    }

    private static int multiplication(int number1, int number2) {
        return (number1 * number2);
    }

    private static int division(int dividend, int divisor) {
        return (dividend / divisor);
    }
}