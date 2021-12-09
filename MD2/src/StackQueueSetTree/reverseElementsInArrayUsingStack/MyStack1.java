package StackQueueSetTree.reverseElementsInArrayUsingStack;

import java.util.Stack;

public class MyStack1 <E> {
    private static int n = 10;

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < n; i++) {
            stack.push(i);
        }
        System.out.println(stack);

        for (int j = 0; j < n; j++) {
            for (int k = j + 1; k < n; k++) {
                int temp = stack.get(j);
                stack.set(j, stack.get(k));
                stack.set(k, temp);
            }
        }
        System.out.println(stack);
    }


}
