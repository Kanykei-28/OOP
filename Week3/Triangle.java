package Week3;
import java.util.Scanner;

public class Triangle {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int Angle1 = input.nextInt();
        int Angle2 = input.nextInt();
        int Angle3 = input.nextInt();
        int Sum = Angle1+Angle2+Angle3;

        if(Sum==180 && Angle1!=0 && Angle2!=0 && Angle3!=0){
            System.out.println("It is a valid triangle.");
        }
        else{
            System.out.println("It is not a valid triangle.");
        }
    }
}
