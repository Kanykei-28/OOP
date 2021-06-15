package Week4;
import java.util.Scanner;

/* A palindromic number or palindrome number is a number that remains the same when its digits are reversed.
Like 16461. Write a program that decides whether a given int number is a palindrome or not. Do not use strings and
string functions or arrays and array functions!!!

Sample input / output:
Enter a number: 12345
This number is not a palindrome

*/

public class Palindromes {
    public static void main(String args[]){
        // add your code here
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        isPalindrome2(number);


    }

    private static boolean isPalindrome2(int n) {
    // add your code here
        int numberReversed = 0;
        int remainder, original;

        original = n;

        while(n>0){
            remainder = n%10;
            numberReversed = numberReversed*10+remainder;
            n = n/10;
        }

        if (original==numberReversed){
            System.out.println("This number is a palindrome");

        }
        else{
            System.out.println("This number is not a palindrome");

        }
        return true;
}
}