package StackQueueSetTree.implementStackUsingLinkedList;

public class MainStack {
    public static void main(String[] args) {
        Stack <Integer> obj = new Stack<>();
        obj.add(11);
        obj.add(12);
        obj.add(13);

        obj.show();

        System.out.println("Deleted element: " + obj.pop());

        System.out.println("Get element: " + obj.get());

        System.out.println("Stack is empty: " + obj.isEmpty());
    }
}
