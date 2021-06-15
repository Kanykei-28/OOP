package Week7.triangle_point;

public class MyPoint {
    private int x = 0;
    private int y = 0;

    public MyPoint() {

    }

    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int[] getXY() {
        int[] arr = {x, y};
        return arr;
    }

    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return String.format("(%d, %d)", x, y);
    }

    public double distance(int x, int y) {
        double distance = Math.sqrt(Math.pow((this.x - x), 2) + Math.pow((this.y - y), 2));
        return distance;
    }

    public double distance(MyPoint another) {
        double distance = Math.sqrt(Math.pow((this.x - another.x), 2) + Math.pow((this.y - another.y), 2));
        return distance;
    }

    public double distance() {
        double distance = Math.sqrt(Math.pow((this.x - 0), 2) + Math.pow((this.y - 0), 2));
        return distance;
    }

}
