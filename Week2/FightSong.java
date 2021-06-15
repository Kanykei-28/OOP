package Week2;
public class FightSong {
    public static void main(String[] args){
        Verse2();
        Verse4();
        Verse4();
        Verse1();

    }
    public static void Verse1(){
        System.out.println("Go, team, go!");
        System.out.println("You can do it.");
    }
    public static void Verse2(){
        Verse1();
        System.out.println();
    }
    public static void Verse3() {
        System.out.println("You're the best,");
        System.out.println("In the West.");
    }
    public static void Verse4(){
        Verse1();
        Verse3();
        Verse2();
    }

}
