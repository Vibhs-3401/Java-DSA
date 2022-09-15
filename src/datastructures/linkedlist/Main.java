package datastructures.linkedlist;

public class Main {

    public static void main(String[] args) {

        LinkedList myLinkedList = new LinkedList(1);
        myLinkedList.append(2);
        myLinkedList.append(3);
        myLinkedList.append(4);
//        myLinkedList.prepend(1);
//        myLinkedList.prepend(0);
//        myLinkedList.getHead();
//        myLinkedList.getTail();
//        myLinkedList.getLength();

//        System.out.println(myLinkedList.get(2).value + "\n");

//        myLinkedList.insert(1, 1);
//        myLinkedList.set(2, 4);
//        myLinkedList.remove(2);
        myLinkedList.printList();

        myLinkedList.reverse();
        myLinkedList.printList();

//        System.out.println(myLinkedList.removeFirst());
//        System.out.println(myLinkedList.removeFirst().value);
//        System.out.println(myLinkedList.removeFirst());

    }
}
