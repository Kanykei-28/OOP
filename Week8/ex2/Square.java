package Week8.ex2;

public class Square extends Rectangle {
    Square(){
        super();
    }
    Square(double side){
        super(side, side);
    }
    Square(double side, String color, boolean filled){
        super(side, side, color, filled);
    }

    public double getSide(){
        return super.getLength();
    }

    public void setSide(double side){
        super.setLength(side);
    }

    public void setWidth(double side) {
        super.setWidth(side);
        super.setLength(side);
    }

    public void setLength(double side){
        super.setLength(side);
        super.setLength(side);
    }

    @Override
    public String toString() {
        return "Square[" + super.toString() + "]";
    }
}
