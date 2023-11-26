package dsa_with_java.W2;



public class LinkedListV1Runner{
    public static void main(String[] args) {
        LinkedListV1 ll = new LinkedListV1();
        ll.insert(98);
        ll.insert(88);
        ll.insert(78);
        ll.insert(68);
        ll.insert(58);
        ll.printer();

        System.out.println("adding one more");
        ll.insert(48);
        ll.printer();

        System.out.println("deleting last element");
        ll.delLast();
        ll.printer();

        System.out.println("inserting new element at specific position");
        ll.insertAt(100, 3);
        ll.printer();

    }
}