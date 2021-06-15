package Week5;
import java.util.ArrayList;
import java.util.Scanner;
public class ZeroEnd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> elem = new ArrayList<>();
        String a = input.nextLine();
        try {
            Scanner line = new Scanner(a);
            while(line.hasNext()){
                elem.add(Integer.parseInt(line.next()));
            }

            int count = 0;
            for (int i = 0; i < elem.size()-1; i ++){
                while(elem.remove(Integer.valueOf(0))){
                    count++;
                }
            }
            for (int i = 0; i < count; i++){
                elem.add(0);
            }
            System.out.println(elem);
        }catch (NumberFormatException e){
            System.out.println("Input error");
        }
    }
}