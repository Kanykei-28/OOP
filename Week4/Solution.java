package Week4;
import java.util.Scanner;

public class Solution {

    public static void main(String args[]) {
        // add your code here
        Scanner input = new Scanner(System.in);
        String line = input.nextLine();

        capitalize(line);

    }

    public static String capitalize(String sentence){
        // add your code here
        String upper = " ";
        Scanner sentenceScan = new Scanner(sentence);
        while(sentenceScan.hasNext()){
            String word = sentenceScan.next();
            upper = upper + Character.toUpperCase(word.charAt(0))+word.substring(1)+ " ";
        }
        System.out.println(upper.trim());

        return "Hi";


    }
}