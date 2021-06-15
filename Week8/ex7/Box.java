package Week8.ex7;

public class Box implements ToBeStored{
    private int maxWeight;
    private int totalThings=0;
    private double weight=0;

    public Box(int maxWeight) {
        this.maxWeight = maxWeight;
    }

    @Override
    public double weight() {
        return weight;
    }
    public void add(CD cd){
        if(maxWeight<=(weight+cd.weight())){
            weight+=cd.weight();
            totalThings++;
        }
    }
    public void add(Book book){
        if(maxWeight<=(weight+ book.weight())){
            maxWeight+=book.weight();
            totalThings++;
        }
    }

    @Override
    public String toString() {
        return "PS08.Box: "+totalThings+ "things, total weight "+weight+ "kg";
    }
}
