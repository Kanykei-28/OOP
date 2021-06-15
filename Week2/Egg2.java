package Week2;
public class Egg2 {
    public static void main(String[] args){
        for (int i = 0; i<2;i++)
            printEgg();
        printSecond();
        printLast();

    }
    public static void printEgg(){
        System.out.println("  _______");
        System.out.println(" /       \\");
        System.out.println("/         \\");
        System.out.println("\\         /");
        System.out.println(" \\_______/");
        System.out.println("-\"-'-\"-'-\"-");
    }
    public static void printSecond(){
        System.out.println("\\         /");
        System.out.println(" \\_______/");

    }
    public static void printLast(){
        System.out.println("  _______");
        System.out.println(" /       \\");
        System.out.println("/         \\");
        System.out.println("-\"-'-\"-'-\"-");
        System.out.println("\\         /");
        System.out.println(" \\_______/");


    }
}
