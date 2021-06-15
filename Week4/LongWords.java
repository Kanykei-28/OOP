package Week4;
import java.util.Scanner;
public class LongWords {
    public static void main(String[] args) {
        // add your code here
        // code must use abbreviate() method as part of solution
        Scanner input = new Scanner(System.in);

        int number = input.nextInt();
        String words[] = new String[number];
        for (int i=0; i<number; i++){
            String word = input.next();
            words[i] = word;
        }



        for (int i=0; i<number; i++){

            String output = "";
            String currentWord = words[i];
            System.out.println(abbreviate(currentWord));

        }

    }

    private static String abbreviate(String word) {
        // add your code here
        if (word.length()<=10){
            return word;
        }
        String output = "";
        output += word.charAt(0);
        output += (word.length()-2);
        output += word.charAt(word.length()-1);
        return output;
    }
}
