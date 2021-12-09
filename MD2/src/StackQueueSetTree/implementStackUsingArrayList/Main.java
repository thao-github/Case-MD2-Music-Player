package StackQueueSetTree.implementStackUsingArrayList;

public class Main {
    public static void main(String[] args) {
        MyStack<Integer> score = new MyStack<>();
        score.add(10);
        score.add(9);
        score.add(8);
        score.show();

        System.out.println("Deleted element: " + score.pop());

        System.out.println("Get element: " + score.get());

        System.out.println("The array is empty: " + score.isEmpty());
    }
}
