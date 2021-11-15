package AccessModifier.StaticMethod;

public class TestStaticMethod {
        public static void main(String[] args) {
            StaticMethod.change();

            StaticMethod s1 = new StaticMethod(111, "Hoang");
            StaticMethod s2 = new StaticMethod(222, "Nam");
            StaticMethod s3 = new StaticMethod(111, "Khanh");

            s1.display();
            s2.display();
            s3.display();
        }
    }
