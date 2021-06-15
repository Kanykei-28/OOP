package Week7;

public class Player {
    private int number;
    private float x;
    private float y;
    private float z = 0.0f;

    public Player(int number, float x, float y){
        this.number=number;
        this.x=x;
        this.y=y;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void move(float xDisp, float yDisp){
        this.x+=xDisp;
        this.y+=yDisp;
    }

    public void jump(float zDisp){
        this.z +=zDisp;
    }

    public boolean near(Ball ball){
        boolean result =false;
        double distance = Math.sqrt(Math.pow(x,2)+Math.pow(y,2)+Math.pow(z,2));
        if (distance<8){
            result = true;
        }
        return result;
    }

    public void kick(Ball ball){
        System.out.println(ball = new Ball(x,y,z));
    }
}
