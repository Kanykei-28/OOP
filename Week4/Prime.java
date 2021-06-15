package Week4;
/*
A program that prints the prime numbers till some N.
*/

import java.util.Scanner;

public class Prime{
    public static void main(String[] args)
    {
        // write your code here
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        isPrime(number);

    }

    // The method that determines whether a number is a prime or not a prime.
    public static boolean isPrime(int num) {
        // write your code here
        int a = 0;
        for (int i = 1; i<=num; i++){
            int count = 0;
            for (a = i; a>=1; a--)
            {
                if (i%a==0)
                {
                    count = count+1;
                }
            }
            if (count == 2){
                System.out.print(i+" ");
            }
        }
        return true;
    }
}