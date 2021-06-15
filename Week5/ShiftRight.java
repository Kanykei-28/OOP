package Week5;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;
public class ShiftRight {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList();
        ArrayList<Integer> changedNumbers = new ArrayList();
        boolean correct = true;
        System.out.println("Enter your numbers, press return to end.");

        int Shift;
        while(correct) {
            String line = input.nextLine();
            if (line.length() != 0) {
                try {
                    Shift = Integer.parseInt(line);
                    numbers.add(Shift);
                } catch (NumberFormatException var10) {
                    System.out.println("Not a legal number. Try again!");
                }
            } else {
                correct = false;
            }
        }

        System.out.println("Enter N: ");
        Shift = input.nextInt();
        int index = 0;

        for(int i = 0; i < numbers.size(); ++i) {
            if (Shift > numbers.size()) {
                Shift %= numbers.size();
            }

            if (numbers.indexOf(numbers.get(i)) + Shift < numbers.size()) {
                changedNumbers.add((Integer)numbers.get(i));
            } else {
                changedNumbers.add(index, (Integer)numbers.get(i));
                ++index;
            }
        }

        Iterator var11 = changedNumbers.iterator();

        while(var11.hasNext()) {
            int i = (Integer)var11.next();
            System.out.print(i + " ");
        }

    }
}
