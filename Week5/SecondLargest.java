package Week5;
import java.util.Scanner;

class SecondLargest {
    public static void main(String[] args) {
        System.out.print("Enter N: ");
        Scanner input = new Scanner(System.in);
        String arrSize = input.nextLine().trim();
        double[] elem = new double[Integer.parseInt(arrSize)];

        for(int i = 0; i < Integer.parseInt(arrSize); ++i) {
            elem[i] = Double.parseDouble(input.nextLine());
        }

        boolean count = false;

        for(int j = 0; j < elem.length - 1; ++j) {
            for(int k = j + 1; k < elem.length; ++k) {
                if (elem[j] > elem[k]) {
                    double temp = elem[k];
                    elem[k] = elem[j];
                    elem[j] = temp;
                }
            }
        }

        System.out.println("\n" + elem[elem.length - 2]);
    }
}
