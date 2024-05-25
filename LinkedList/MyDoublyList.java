public class MyDoublyList {
    public static void main(String[] args) {
        CustumDoublyLinkedList dll = new CustumDoublyLinkedList();
        dll.insertFirst(1);
        dll.insertFirst(2);
        dll.insertFirst(3);
        dll.insertFirst(4);
        dll.insertFirst(5);
        dll.insertFirst(7);
        dll.insertAtLast(6);
        dll.insertAtPos(2,8);
        dll.display();

    }
}
