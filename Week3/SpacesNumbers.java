package Week3;
public class SpacesNumbers {
    public static void main(String[] args){
        int i = 0;
        while(i<=5){
            int j = 5-i;
            while(j>0){
                System.out.print(" ");
                j--;
            }
            int k = 0;
            while(k<i){
                System.out.print(i);
                k++;
            }
            i++;
            System.out.println();
        }

    }
}
