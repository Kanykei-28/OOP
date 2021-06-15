package Week5;
import java.util.ArrayList;
import java.util.Scanner;

public class OddsArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int length = Integer.parseInt(input.nextLine().trim());
        ArrayList<Integer> elem = new ArrayList();
        ArrayList<Integer> odds = new ArrayList();
        ArrayList<Integer> evens = new ArrayList();
        String[] line = input.nextLine().split(" ");

        int i;
        for(i = 0; i < length; ++i) {
            elem.add(Integer.parseInt(line[i]));
        }

        for(i = 0; i < elem.size(); ++i) {
            if ((Integer)elem.get(i) % 2 == 0) {
                evens.add((Integer)elem.get(i));
            } else {
                odds.add((Integer)elem.get(i));
            }
        }

        elem.clear();

        for(i = odds.size(); i > 0; --i) {
            elem.add(0, (Integer)odds.get(i - 1));
        }

        elem.addAll(evens);
        System.out.println(elem);
    }
}