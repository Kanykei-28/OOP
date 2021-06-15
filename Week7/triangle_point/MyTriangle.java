package Week7.triangle_point;

public class MyTriangle extends MyPoint {
    private MyPoint v1;
    private MyPoint v2;
    private MyPoint v3;

    public MyTriangle(MyPoint v1, MyPoint v2, MyPoint v3) {
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
    }

    public MyTriangle(int x, int y, MyPoint v1, MyPoint v2, MyPoint v3) {
        super(x, y);
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
    }

    @Override
    public String toString() {
        return "MyTriangle[" +
                "v1=" + v1 +
                ", v2=" + v2 +
                ", v3=" + v3 +
                ']';
    }

    public double getPerimeter(){
        double a = v1.distance(v2);
        double b = v2.distance(v3);
        double c = v3.distance(v1);

        return a+b+c;
    }

    public String getType(){
        String result = "";
        double a = v1.distance(v2);
        double b = v2.distance(v3);
        double c = v3.distance(v1);
        if (a==b && a==c){
            result = "Equilateral";
        }else if (a==b || a==c|| c==b){
            result = "Isosceles";
        }
        else {
            result = "Scalene";
        }
        return result;
    }
}
