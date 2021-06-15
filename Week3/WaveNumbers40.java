package Week3;
public class WaveNumbers40 {
    public static void main(String[] args) {
        Dashes();
        System.out.println();
        Smile();
        System.out.println();
        Numbers();
        System.out.println();
        Dashes();
    }

        public static void Dashes()
        {
            int i = 1;
            while (i<41){
                System.out.print("-");
                i++;
            }
        }
        public static void Smile()
        {
            int i = 1;
            while(i<11)
            {
                System.out.print("_-^-");
                i++;

            }
        }
        public static void Numbers(){
            int i = 1;
            while(i<3){
                int j=1;
                while(j<11){
                    int a = j%10;
                    int k = 0;
                    while(k<2){
                        System.out.print(a);
                        k++;
                    }
                    j++;
                }
                i++;
            }

        }



}



