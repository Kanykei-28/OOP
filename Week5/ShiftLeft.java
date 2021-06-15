package Week5;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ShiftLeft {
    public ShiftLeft() {
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean correct = true;
        ArrayList<Integer> numbers = new ArrayList();
        System.out.println("Enter your numbers, press return to end.");

        while(correct) {
            try {
                String elem = input.nextLine();
                if (!elem.isEmpty()) {
                    numbers.add(Integer.parseInt(elem));
                } else {
                    correct = false;
                }
            } catch (Exception var8) {
                System.out.println("Not a legal number. Try again!");
            }
        }

        System.out.println("Enter N:");
        int given = input.nextInt();
        if (numbers.size() != 0) {
            ArrayList<Integer> shiftedNumbers = new ArrayList();

            for(int i = given % numbers.size(); i < numbers.size(); ++i) {
                shiftedNumbers.add((Integer)numbers.get(i));
            }

            for(int i = 0; i < given % numbers.size(); ++i) {
                shiftedNumbers.add(shiftedNumbers.size(), (Integer)numbers.get(i));
            }

            Iterator var10 = shiftedNumbers.iterator();

            while(var10.hasNext()) {
                Integer shiftedNumber = (Integer)var10.next();
                System.out.println(shiftedNumber + " ");
            }

        }
    }
}
