package Week8.ex2;

public class Rectangle extends Shape {
    private double width = 1.0;
    private  double length = 1.0;

    Rectangle(){
        super();
    }
    Rectangle(double width, double length) {
        super();
        this.width = width;
        this.length = length;
    }
    Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
    public double getArea(){
        return this.length * this.width;
    }
    public double getPerimeter(){
        return 2 * (this.length + this.width);
    }


    @Override
    public String toString() {
        return "Rectangle[" + super.toString() + ",width=" + this.width + ",length=" + this.length + "]";
    }
}
