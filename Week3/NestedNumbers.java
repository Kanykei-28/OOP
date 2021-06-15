package Week3;
public class NestedNumbers {
    public static void main(String[] args){
        int i = 0;
        while(i<3){
            int j = 0;
            while(j<10){
                int k = 0;
                while(k<3){
                    System.out.print(j);
                    k++;
                }
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
