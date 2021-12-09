public class FanClass {
    final int slow = 1;
    final int medium = 2;
    final int fast = 3;
    private int speed = 1;
    private boolean status = false;
    private double radius = 5.0;
    private String color = "blue";

    public FanClass() {
    }

    public FanClass(int speed, boolean status, double radius, String color) {
        this.speed = speed;
        this.status = status;
        this.radius = radius;
        this.color = color;
    }

    public int getSpeed() {
        return speed;
    }

    public String checkSpeed(int speed) {
        String str = "";
        if (this.speed == 1) {
             str = "slow";
        } else if (this.speed == 2) {
             str = "medium";
        } else if (this.speed == 3) {
             str = "fast";
        }
        return str;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getSlow() {
        return slow;
    }

    public int getMedium() {
        return medium;
    }

    public int getFast() {
        return fast;
    }

    public boolean isStatus() {
         return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "FanClass{" +
                "speed=" + checkSpeed(getSpeed()) +
                ", status=" + (this.status? "fan is on": "fan is off") +
                ", radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }

    public static void main(String[] args) {
        FanClass fan = new FanClass();
        System.out.println(fan.toString());
        FanClass fan1 = new FanClass(3, true, 10, "yellow");
        System.out.println(fan1);
        FanClass fan2 = new FanClass(2, false, 5, "blue");
        System.out.println(fan2);
    }
}
