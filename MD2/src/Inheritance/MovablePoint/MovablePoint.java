package Inheritance.MovablePoint;
import java.util.Arrays;

public class MovablePoint extends Point{
    float xSpeed;
    float ySpeed;

    public MovablePoint() {
        xSpeed = 0.0f;
        ySpeed = 0.0f;
    }

    public MovablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
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

    public float[] getSpeed() {
        float[] test = new float[2];
        test[0] = getXSpeed();
        test[1] = getYSpeed();
        return test;
    }

    @Override
    public String toString() {
        return "MovablePoint{" +
                super.toString() +
                " ," + Arrays.toString(getSpeed()) +
                '}';
    }

    public MovablePoint move() {
//        super.setX(10);
//        super.setY(10);

        super.setX(super.getX() + xSpeed);
        super.setY(super.getY() + ySpeed);

        return this;
    }


    public static void main(String[] args) {
        MovablePoint movablePoint = new MovablePoint(6, 8);


        System.out.println(movablePoint.move());
    }
}
