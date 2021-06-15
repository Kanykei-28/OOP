package Week3;
import java.util.Scanner;
public class Grader {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int Grade = sc.nextInt();
        if(Grade>=50 && Grade<=100)
        {
            System.out.println("Passed");
        }
        else if(Grade>=0 && Grade<50)
        {
            System.out.println("Failed");
        }
        else {
            System.out.println("Incorrect garde!");
        }
    }
}
