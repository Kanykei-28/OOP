package Week3;
public class SpacedNumbers {
    public static void main(String[] args){
        int i = 1;
        while (i<6){
            int j = 5;
            while(j>i){
                System.out.print(" ");
                j--;
            }
            System.out.print(i);
            System.out.println();
            i++;
        }
    }
}
