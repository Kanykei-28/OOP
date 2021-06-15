package Week3;
import java.util.Scanner;

public class Minimum {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int Number1 = input.nextInt();
        int Number2 = input.nextInt();
        int Number3 = input.nextInt();

        if (Number1 <= Number2 && Number1 < Number3){
            System.out.printf("The least of these three numbers is %d", Number1);
        }
        else if (Number1 < Number2 && Number1 <= Number3){
            System.out.printf("The least of these three numbers is %d", Number1);
        }
        else if (Number2 <= Number1 && Number2 < Number3){
            System.out.printf("The least of these three numbers is %d", Number2);
        }
        else if (Number2 < Number1 && Number2 <= Number3){
            System.out.printf("The least of these three numbers is %d", Number2);
        }
        else if (Number3 <= Number1 && Number3 < Number2){
            System.out.printf("The least of these three numbers is %d", Number3);
        }
        else if (Number3 < Number1 && Number3 <= Number2){
            System.out.printf("The least of these three numbers is %d", Number3);
        }
        else{
            System.out.println("They are all equal");
        }

    }
}
