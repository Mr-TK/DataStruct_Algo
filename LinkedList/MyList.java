public class MyList {
    public static void main(String[] args) {
        CustumLinkedList list = new CustumLinkedList();
        MixedList list1 = new MixedList();
        list1.insertAtFirst("titas");
        list1.insertAtFirst("titas");
        list1.insertAtFirst("titas");
        list1.insertAtFirst("tk");
        list1.insertAtFirst(9);
        list1.insertAtFirst(10);

        list1.display();
        list.insertAtLast(5);
        list.insertAtLast(3);
        list.insertAtLast(1);
        list.insertAtLast(2);
        list.insertAtLast(4);
        list.insertAtFirst(1);
        list.insert(9, 2);
        list.display();
        list.deleteAtFirst();
        list.display();
        list.deleteAtLast();
        list.display();

    }
}
