package StackQueueSetTree.implementStackUsingLinkedList;

public class Stack <E> {
    private int size;
    Node<E> top;

    public Stack() {

    }

     void add(E e) {
        Node<E> temp = new Node<>(e);
        temp.next = top;
        top = temp;
        size++;
    }

    public void show() {
        Node<E> temp = top;
        for (int i = 0; i < size; i++) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public E pop() {
        Node <E> temp = top;
        top = temp.next;
        return temp.data;
    }

    //get
    public E get() {
        Node <E> temp = top;
        return temp.data;
    }

    //isEmpty
    public boolean isEmpty() {
        return top == null;
    }

    //show
}
