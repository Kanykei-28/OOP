package Week7.ball_container;

public class Container {
    private int x1;
    private int y1;
    private int x2;
    private int y2;

    public Container(int x, int y, int width, int height) {
        this.x1 = x;
        this.y1 = y;
        this.x2 = width;
        this.y2 = height;
    }

    public int getX() {
        return x1;
    }

    public int getY() {
        return y1;
    }

    public int getWidth() {
        return x2;
    }

    public int getHeight() {
        return y2;
    }

    public boolean collides(Ball ball){
        boolean result = false;
        if (ball.getX() - ball.getRadius() <= this.x1 ||
                ball.getX() - ball.getRadius() >= this.x2) {
            ball.reflectHorizontal();
            ball.reflectVertical();
            result = true;
        }

        return result;
    }

    @Override
    public String toString() {
        return String.format("Container[(%d,%d),(%d,%d)]", x1, y1, x2, y2);
    }
}
