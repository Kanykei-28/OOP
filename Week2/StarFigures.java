package Week2;
public class StarFigures{
    public static void main (String[] args){
        TwoLines();
        X();
        System.out.println("");
        TwoLines();
        X();
        TwoLines();
        System.out.println("");
        Line();
        TwoLines();
        X();




    }
    public static void TwoLines(){
        System.out.println("*****");
        System.out.println("*****");
    }

    public static void X(){
        System.out.println(" * *");
        System.out.println("  *");
        System.out.println(" * *");
    }
    public static void Line(){
        for (int i = 0; i<3;i++)
            System.out.println("  *");

    }
}
