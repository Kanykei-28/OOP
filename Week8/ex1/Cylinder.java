package Week8.ex1;

public class Cylinder extends Circle {
    private double height = 1.0;
    Cylinder(){
        super();
    }
    Cylinder(double radius){

        super(radius);
    }
    Cylinder(double radius, double height){
        super(radius);
        this.height = height;
    }
    Cylinder(double radius, double height, String color){
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume(){
        return super.getArea() * this.height;
    }

    @Override
    public String toString() {
        return "Cylinder[radius=" + super.getRadius() + ",height=" + height + ",color=" + super.getColor() + ']';
    }
}