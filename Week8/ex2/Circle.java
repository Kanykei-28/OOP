package Week8.ex2;

public class Circle extends Shape {
    private double radius = 1.0;
    Circle(){ super(); }
    Circle(double radius){
        super();
        this.radius = radius;
    }
    Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea(){
        return this.radius * this.radius * 3.14;
    }
    public double getPerimeter(){
        return  this.radius * 2 * 3.14;
    }

    @Override
    public String toString() {
        return "Circle[" + super.toString() + ",radius=" + this.radius + "]";
    }
}
