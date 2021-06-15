package Week8.ex4;

public class MovablePoint extends  Point{
    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;

    MovablePoint(){}
    MovablePoint(float xSpeed, float ySpeed){
        super();
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    MovablePoint(float x, float y, float xSpeed, float ySpeed){
        super(x,y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getXSpeed() {
        return xSpeed;
    }

    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getYSpeed() {
        return ySpeed;
    }

    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public void setSpeed(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float[] getSpeed(){
        return new float[]{this.xSpeed, this.ySpeed};
    }


    @Override
    public String toString() {
        return super.toString() + ",speed=(" + this.xSpeed + "," + this.ySpeed + ")";
    }

    public void move(){
        float x = super.getX();
        float y = super.getY();
        super.setXY(x,y);
    }
}

