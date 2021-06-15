package Week3;
import java.util.Scanner;
public class Hello_or_Bye {
    public static void main(String[] arg){
        Scanner input = new Scanner(System.in);
        char letter = input.next().charAt(0);

        if (letter =='h' || letter=='H' || letter =='e' || letter =='E' || letter =='l' || letter =='L' || letter =='o' || letter =='O' || letter =='W' || letter =='w' || letter =='R' || letter =='r' || letter =='D' || letter =='d' || letter =='!')
        {
            System.out.println("Hello");
        }
        else{
            System.out.println("Bye");
        }
    }
}
