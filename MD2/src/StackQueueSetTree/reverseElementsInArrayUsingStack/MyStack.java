package StackQueueSetTree.reverseElementsInArrayUsingStack;

import java.util.Stack;

public class MyStack<E> {

    public static void main(String[] args) {
        Stack<Integer> listInteger = new Stack<>();
        int n;
        System.out.println("The stack is: ");
        listInteger.push(1);
        listInteger.push(3);
        listInteger.push(5);
        System.out.println(listInteger);



        System.out.println("The reverse: ");
        int a = listInteger.pop();
        int b = listInteger.pop();
        int c = listInteger.pop();
        listInteger.push(a);
        listInteger.push(b);
        listInteger.push(c);
        System.out.println(listInteger);

        Stack<String> str = new Stack();
        System.out.println("The stack is: ");
        str.push("I");
        str.push("LOVE");
        str.push("VIETNAM");
        System.out.println(str);

        System.out.println("The reverse: ");
        String d = str.pop();
        String e = str.pop();
        String f = str.pop();
        str.push(d);
        str.push(e);
        str.push(f);
        System.out.println(str);

    }
}
