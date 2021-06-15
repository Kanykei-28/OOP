package Midterm;
import java.util.Scanner;

public class SumEvenFibonacciNumbers {
    public static void main(String[] args) {
        System.out.println(new SumEvenFibonacciNumbers().run());
    }
    public String run() {
        Scanner input = new Scanner(System.in);
        int num;
        num = input.nextInt();
        int sum = 0;
        for (int i = 0; ; i++) {
            int elem = fibonacci(i);
            if (elem > num)
                break;
            if (elem % 2 == 0)
                sum += elem;
        }
        return Integer.toString(sum);
    }

    private static int fibonacci(int n) {
        if (n < 0 || n > 46)
            throw new IllegalArgumentException();
        int a = 0;
        int a2 = 1;
        for (int i = 0; i < n; i++) {
            int a3 = a + a2;
            a = a2;
            a2 = a3;
        }
        return a;
    }

}