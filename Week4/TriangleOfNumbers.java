package Week4;
import java.util.Scanner;

public class TriangleOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter N: ");
        int n = scanner.nextInt();

        printTriangle(n);
    }

    private static void printTriangle(int n) {
        // add your code here
        for (int i = 1; i<=n;i++){
            for (int j = n-i; j>0;j--){
                System.out.print(" ");
            }
            for (int k = 1; k<=i; k++){
                System.out.print(k);
            }
            System.out.println();
        }
    }
}