//package StackQueue.TreeHashSet.implementTree;
//public class MyTree {
//    int size;
//    Node root;
//
//    public MyTree(Node root) {
//        this.root = root;
//    }
//
//    public void add(int number) {
//        Node newNode = new Node();
//        newNode.data = number;
//        Node temp = root;
//
//        if (root == null) {
//            root = newNode;
//            return;
//        }
//        while (temp != null) {
//            if (number < temp.data) {
//                temp = temp.left;
//            } else if (number > temp.data) {
//                temp = temp.right;
//            }
//        }
//        temp = newNode;
//    }
//
//    public static void main(String[] args) {
//        MyTree myTree = new MyTRee();
//        myTree.add(5);
//        myTree.add(10);
//        myTree.add(15);
//        myTree.add(1);
//    }
//}
//
