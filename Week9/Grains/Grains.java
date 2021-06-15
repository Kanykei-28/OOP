package Week9.Grains;

import java.math.BigInteger;

public class Grains {
    public BigInteger computeNumberOfGrainsOnSquare(int a){
        BigInteger output = new BigInteger("1");

        if(a>=1 && a<=64){
            output = BigInteger.TWO.pow(a-1);
        }
        else{
            throw new IllegalArgumentException("square must be between 1 and 64");
        }
        return output;
    }
    public BigInteger computeTotalNumberOfGrainsOnBoard(){
        BigInteger answer = new BigInteger("1");
        for (int i = 1; i < 64; i++) {
            answer = answer.add(BigInteger.TWO.pow(i));
        }
        return answer;
    }
}
