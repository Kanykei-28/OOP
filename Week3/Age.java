package Week3;
import java.util.Scanner;

public class Age {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int Age = input.nextInt();

        if(Age>=18 && Age<=150){
            System.out.println("Old enough!");
        }
        else if (Age<18 && Age>=0){
            System.out.println("Too young.");
        }
        else{
            System.out.println("Incorrect age.");
        }
    }
}
