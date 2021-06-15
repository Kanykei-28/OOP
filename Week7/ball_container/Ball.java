package Week7.ball_container;

public class Ball {
    private float x, y, xDelta, yDelta;
    private int radius;

    public Ball(float x, float y, int radius, int speed, int direction){
        if(direction>-180 && direction<=180){
            this.x = x;
            this.y = y;
            this.radius = radius;
            this.xDelta = (float) (speed * Math.cos(Math.toRadians(direction)));
            this.yDelta =(float) (-speed * Math.sin(Math.toRadians(direction))) ;
        }else {
            throw new IllegalArgumentException("Invalid arguments");
        }

    }

    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public void setXDelta(float xDelta) {
        this.xDelta = xDelta;
    }

    public void setYDelta(float yDelta) {
        this.yDelta = yDelta;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public int getRadius() {
        return radius;
    }

    public float getXDelta() {
        return xDelta;
    }

    public float getYDelta() {
        return yDelta;
    }

    public void move(){
        this.x+=xDelta;
        this.y+=yDelta;
    }
    public void reflectHorizontal(){
        this.xDelta*=-1;
    }
    public void reflectVertical(){
        this.yDelta*=-1;
    }

    @Override
    public String toString() {
        return String.format("Ball[(%f, %f),speed=(%f, %f)]",x, y, xDelta, yDelta);
    }
}
