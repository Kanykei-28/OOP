package Midterm;
public class Scrabble {
    private String word;
    public Scrabble(String word){
        this.word=word;
    }
    public int getScore(){
        int sum=0;
        String[] word1=word.split("");
        for (String lettersW:word1){
            char letter=lettersW.toUpperCase().charAt(0);
            switch (letter){
                case 'D':
                    sum+=2;
                    break;
                case 'G':
                    sum+=2;
                    break;
                case 'B':
                    sum+=3;
                    break;
                case 'C':
                    sum+=3;
                    break;
                case 'M':
                    sum+=3;
                    break;
                case 'P':
                    sum+=3;
                    break;
                case 'F':
                    sum+=4;
                    break;
                case 'H':
                    sum+=4;
                    break;
                case 'V':
                    sum+=4;
                    break;
                case 'W':
                    sum+=4;
                    break;
                case 'Y':
                    sum+=4;
                    break;
                case 'K':
                    sum+=5;
                    break;
                case 'J':
                    sum+=8;
                    break;
                case 'X':
                    sum+=8;
                    break;
                case 'Q':
                    sum+=10;
                    break;
                case 'Z':
                    sum+=10;
                    break;
                default:
                    sum+=1;
            }


        }
        return sum;
    }
}

