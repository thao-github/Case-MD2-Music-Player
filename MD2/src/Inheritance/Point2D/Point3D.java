package Inheritance.Point2D;

class Point3D extends Point2D {
    private float z = 0.0f;

    public Point3D() {
    }

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public float [] getXYZ () {
        float[] test = new float[3];
        test[0] = super.getX();
        test[1] = super.getY();
        test[2] = this.z;
        return test;
    }

    public void setXYZ (float x, float y, float z) {
        super.setXY(x, y);
        this.z = z;
    }

    @Override
    public String toString() {
        return "Point3D{" +
                super.toString() +
                "z=" + z +
                '}';
    }

    public static void main(String[] args) {
        Point3D point3D = new Point3D(2,3,4);
        //point3D.setZ(4);
        System.out.println(point3D.toString());
    }
}
