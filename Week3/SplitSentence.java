package Week3;
import java.util.Scanner;
public class SplitSentence {
    public static void main(String args[]) {
        // declaration
        Scanner console = new Scanner(System.in);

        // input
        System.out.print("Enter the single line text please: ");
        String sentence = console.nextLine();

        // processing
        splitSentence2Words(sentence);
    }

    // TODO: implement the below method
    private static void splitSentence2Words(String clause) {
        /* Write a program that reads one line of input text and breaks it up into words. The words should be output
         one per line. A word is defined to be a sequence of letters. Any characters in the input that are not letters
         should be discarded.
         */
        // Write your code here
        String[] words = clause.trim().split(" ");
        int i = 0;
        while (i<words.length){
            String ch = words[i].replaceAll("\\.","").replaceAll(",","").replaceAll("'","").replaceAll("\"","");
            String ch2 = ch.replaceAll("-","").replaceAll("\\(","").replaceAll("’","").replaceAll("\\n","");
            String ch3 = ch2.replaceAll("\\)","").replaceAll("—","").replaceAll("‘","");
            System.out.println(ch3);
            ++i;
        }

    }
}
