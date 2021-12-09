package StackQueueSetTree.implementStackUsingArrayList;

public class MyStack<E> {
    private int size;
    private E[] elements = (E[]) new Object[5];

    public MyStack() {
    }

    public void add(E e) {
        if (size == elements.length) {
            ensureCapacity();
        } else {
            elements[size] = e;
            size++;
        }
    }

    public void ensureCapacity() {
        E[] newArray = (E[]) new Object[elements.length * 2];
        for (int i = 0; i < elements.length; i++) {
            newArray[i] = elements[i];
        }
        elements = newArray;
    }

    public void show() {
        for (int i = 0; i < size; i++) {
            System.out.println(elements[i]);
        }
    }

    public E pop() {
        E element = elements[size - 1];
        elements[size - 1] = null;
        size--;
        return element;
    }

    public E get() {
        E element = elements[size - 1];
        return element;
    }

    public boolean isEmpty() {
        return elements == null;
    }
}
