package Week3;
import java.util.Scanner;

public class GPA {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        float percentage = input.nextFloat();

        if (percentage>=93.0 && percentage<=100.0){
            System.out.println("A 4.0");
        }
        else if (percentage>=90.0 && percentage<=92.0){
            System.out.println("A- 3.67");
        }
        else if (percentage>=87.0 && percentage<=89.0){
            System.out.println("B+ 3.33");
        }
        else if (percentage>=83.0 && percentage<=86.0){
            System.out.println("B 3.0");
        }
        else if (percentage>=80.0 && percentage<=82.0){
            System.out.println("B- 2.67");
        }
        else if (percentage>=77.0 && percentage<=79.0){
            System.out.println("C+ 2.33");
        }
        else if (percentage>=70.0 && percentage<=76.0){
            System.out.println("C 2.0");
        }
        else if (percentage>=60.0 && percentage<=69.0){
            System.out.println("D 1.0");
        }
        else if (percentage>=0.0 && percentage<=59.0){
            System.out.println("F 0.0");
        }
        else{
            System.out.println("Incorrect grade!");
        }
    }
}
