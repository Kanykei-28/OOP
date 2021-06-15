package Quiz2.P1;



import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class  Allergies {
    private final int totalScore = 255;
    private int score;

    public Allergies(int score) {
        if (score > totalScore) {
            score = score % totalScore;
        }

        this.score = score;
    }


    boolean isAllergicTo(Allergen allergen) {
        if (allergen.getScore() == 0) {return false;}

        return allergen.getScore() == (allergen.getScore() & this.score);
    }

    List<Allergen> getList() {
        return Arrays.stream(Allergen.values())
                .filter(this::isAllergicTo)
                .collect(Collectors.toList());
    }


}
