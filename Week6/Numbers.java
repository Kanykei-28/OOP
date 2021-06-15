package Week6;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Numbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try {
            int number = input.nextInt();
            number = Math.abs(number);
            if (number < 10){
                System.out.printf("%d + %d%d + %d%d%d = %d", number, number,number,number,number,number, ((number + (number*11)
                        + (number*111))));
            }else {
                int a = (number * 100) + number;
                int b = (a * 100) + number;
                System.out.printf("%d + %d%d + %d%d%d = %d", number, number,number,number,number,number, (number + a + b));
            }

        }catch (InputMismatchException e){
            System.out.println("error");
        }

    }
}
