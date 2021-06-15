package Week2;
public class Lanterns {
    public static void main(String[] args){
        TwoTriangles();
        Lines();
        ManyStars();
        TwoTriangles();
        Stars();
        Lines();
        Lines();
        Stars();
        Stars();



    }
    public static void TwoTriangles(){
        Triangle();
        System.out.println();
        Triangle();
    }
    public static void Triangle() {
        System.out.println("    *****");
        System.out.println("  *********");
        System.out.println("*************");
    }
    public static void Lines() {
        System.out.println("* | | | | | *");
    }
    public static void Stars() {
        System.out.println("    *****");
    }
    public static void ManyStars() {
        System.out.println("*************");
    }




}
