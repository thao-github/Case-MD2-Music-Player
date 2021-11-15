package AccessModifier.StaticMethod;

public class StaticMethod {
    private int rollno;
    private String name;
    private static String college = "BBDIT";

    //khởi tạo biến
    public StaticMethod(int r, String n) {
        rollno = r;
        name = n;
    }

    //dùng phương thức static đổi giá trị của biến static
    static void change() {
        college = "CODEGYM";
    }

    // phương thức hiển thị gía trị:
    void display() {
        System.out.println(rollno + " " + name + " " + college);
    }
}

