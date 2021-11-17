package DSA.ListDonGian;

public class MyList<E> {

    private int size;//Số phần tử có giá trị ở trong mảng.
    private final int DEFAULT_CAPACITY = 3;
    private Object[] elements = new Object[DEFAULT_CAPACITY];

    public MyList() {
    }

    public void add(E e) {
        if (size == DEFAULT_CAPACITY) {
            ensureCapacity();
        }
        elements[size] = e;
        System.out.println(elements[size]);
        size++;

    }

    public void ensureCapacity() {
        int newSize = elements.length * 2;
        Object[] newArray = new Object[newSize];
        for (int i = 0; i < elements.length; i++) {
            newArray[i] = elements[i];
        }
        elements = newArray;
    }

    public E get(int i) {
        if (i >= size || i < 0) {
            throw new IndexOutOfBoundsException("Index:" + i + ", Size" + i);
        }
        return (E) elements[i];
    }

    public static void main(String[] args) {
        MyList<String> holidays = new MyList<>();
        holidays.add("Tet holiday");
        holidays.add("Summer vacation");
        holidays.add("MidAutumn");
        holidays.add("Christmas");

        System.out.println("Get method:");
        System.out.println(holidays.get(1));
    }
}
