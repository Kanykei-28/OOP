package Week5;
import java.util.Scanner;
public class MagicSquare {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int r=input.nextInt();
        int c=input.nextInt();
        if (r==c  &r<=15 &c<=15) {
            int[][] inputList = new int[r][c];
            for (int i = 0; i < r; i++) {
                for (int j = 0; j < c; j++) {
                    inputList[i][j] = input.nextInt();
                }
            }
            System.out.println(isMagic(inputList));
        } else{
            System.out.print(false);
        }

    }
    public static boolean isMagic(int[][] inputList){
        int diagAdd = 0;
        int rightDiag = 0;
        int rowSum = 0;
        int columnSum = 0;
        for (int row = 0; row < inputList.length; row++) {
            diagAdd += inputList[row][row];
            rightDiag += inputList[row][(inputList.length) - 1 - row];
        }
        if (diagAdd != rightDiag){
            return false;
        }
        for (int[] ints : inputList) {
            for (int column = 0; column < inputList.length; column++)
                rowSum += ints[column];


            if (rowSum != diagAdd) {
                System.out.println("False");
                return false;
            }
            rowSum = 0;
        }

        for (int row = 0; row < inputList.length; row++) {
            for(int column = 0; column < inputList.length; column++)
                columnSum += inputList[column][row];

            if (columnSum != diagAdd) {
                System.out.println("False");
                return false;
            }
            columnSum = 0; // resets the value for new row
        }

        return true;

    }
}
