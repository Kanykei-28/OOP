package Week9;

public class DifferenceOfSquaresCalculator {
    public int computeDifferenceOfSquares(int number){
        int sum = (int)Math.pow((number*(number+1))/2,2);
        int SquareSum = 0;
        for (int i = 1; i < number; i++) {
            SquareSum+=Math.pow(i,2);
        }
        return SquareSum-sum;
    }
    public int computeSumOfSquaresTo(int num){
        int SquareSum = 0;
        for (int i = 1; i <= num; i++) {
            SquareSum+=Math.pow(i,2);
        }
        return SquareSum;
    }
    public int computeSquareOfSumTo(int num){
        return (int)Math.pow((num*(num+1))/2,2);
    }
}
