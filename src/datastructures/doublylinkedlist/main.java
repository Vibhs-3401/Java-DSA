package datastructures.doublylinkedlist;

public class main {

    public static void main(String[] args) {

        DoublyLinkedList myddl = new DoublyLinkedList(2);

//        myddl.getHead();
//        myddl.getTail();
//        myddl.getLength();

        myddl.append(3);
//        System.out.println(myddl.removeLast());
//        System.out.println(myddl.removeLast());
//        System.out.println(myddl.removeLast());

        myddl.prepend(1);
        myddl.printList();
    }
}
