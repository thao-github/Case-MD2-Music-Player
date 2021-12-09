//package StackQueue.implementQueueUseLinkedList;
//
//public class MyLinkedListQueue <E>{
//    Node head;
//    Node tail;
//
//    public MyLinkedListQueue() {
//    }
//
//    public MyLinkedListQueue(Node head, Node tail) {
//        this.head = head;
//        this.tail = tail;
//    }
//
//    public void enqueue (E key) {
//        Node temp = new Node(key);
//        temp.key = key;
//        temp.next = null;
//        if (head == null && tail == null){
//            head = tail = temp;
//        }
//        temp.next = tail;
//        tail = temp;
//    }
//
//
//    public Node dequeue () {
//    }
//}
