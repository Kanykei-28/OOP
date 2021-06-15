package Week2;
public class TwoRockets {
    public static void main(String[] args) {
        Triangles();
        Squares();
        KG();
        Squares();
        TrianglesEnd();
    }
    public static void Triangles(){
        System.out.println("   /\\       /\\");
        System.out.println("  /  \\     /  \\");
        System.out.println(" /    \\   /    \\");
    }
    public static void Squares(){
        System.out.println("+------+ +------+");
        System.out.println("|      | |      |");
        System.out.println("|      | |      |");
        System.out.println("+------+ +------+");
    }

    public static void KG(){
        System.out.println("|  KG  | |  KG  |");
        System.out.println("|Soonun| |Soonun|");
    }
    public static void TrianglesEnd(){
        System.out.println("   /\\       /\\");
        System.out.println("  /  \\     /  \\");
        System.out.print(" /    \\   /    \\");
    }

}
