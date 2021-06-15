package Week7.circle_point;

public class MyCircle extends MyPoint {
    private MyPoint center = new MyPoint(0,0);
    private int radius = 1;



    public MyCircle(int x, int y, int radius) {
        super(x, y);
        this.radius = radius;
    }

    public MyCircle(MyPoint center, int radius) {
        this.center = center;
        this.radius = radius;
    }

    public MyCircle(){
    }


    public MyPoint getCenter() {
        return center;
    }

    public void setCenter(MyPoint center) {
        this.center = center;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public void setCenterX(int x){
        setX(x);
    }

    public int getCenterX(){
        return getX();
    }

    public void setCenterY(int y){
        setY(y);
    }

    public int getCenterY(){
        return getY();
    }

    public void setCenterXY(int x, int y){
        setXY(x, y);
    }

    public int[] getCenterXY(){
        return getXY();
    }

    @Override
    public String toString() {
        return "MyCircle[" +
                "radius=" + radius +
                ",center=" + center +
                ']';
    }

    public double getArea(){
        return Math.PI*Math.pow(radius, 2);
    }

    public double getCircumference(){
        return 2*Math.PI*radius;
    }

    public double distance(MyCircle another){
        return distance(another);
    }

}
