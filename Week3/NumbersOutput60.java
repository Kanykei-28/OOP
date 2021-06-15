package Week3;
public class NumbersOutput60 {
    public static void main(String[] args){
        int i = 1;
        while (i<7) {
            int j = 1;
            while (j < 11)
            {
                int a = j % 10;
                if(a==0){
                    System.out.print("|");
                }
                else {
                    System.out.print(" ");
                }
                j++;
            }
            i++;
        }
        System.out.print("\n");
        int k = 1;
        while (k<7) {
            int j = 1;
            while (j < 11)
            {
                int a = j % 10;
                System.out.print(a);
                j++;
            }
            k++;
        }

    }

}
