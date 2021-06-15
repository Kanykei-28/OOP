package Week5;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
public class MaxMirror {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] elements = input.nextLine().strip().split(" ");
        int[] a=new int[elements.length];
        int i=0;
        for (String n:elements){
            a[i]=Integer.parseInt(n);
            i++;
        }
        int len=a.length;
        ArrayList<Integer> counts=new ArrayList<>();
        for (int j=0;j<len;j++){
            for(int k=len-1;k>j;k--){
                if (a[j]==a[k]){
                    int[] list= Arrays.copyOfRange(a,j,k+1);
                    counts.add(count_image(list));
                }
            }
        }
        System.out.println(Collections.max(counts));
    }
    public static int count_image(int[] part1){
        int c=0;
        int numberOfElements=part1.length;
        for (int j=0;j<part1.length/2;j++) {
            if (part1[j] == part1[numberOfElements-1]) {
                c += 1;
                numberOfElements-=1;
            } else {
                return c;
            }
        }
        return c;
    }
}