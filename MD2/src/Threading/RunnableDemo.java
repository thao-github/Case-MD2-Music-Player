package Threading;

public class RunnableDemo {

    public static void main(String[] args) {
//        String txt = "It's alright.";
        int a = 1;
        int b = 0;
        if ((5 < 7 && a++ >= 1) | b++ >= 0) {
            b++;
        }
        System.out.println(a);
        System.out.println(b);
    }
}
