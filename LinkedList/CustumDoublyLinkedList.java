public class CustumDoublyLinkedList {
    Node head;
    int size = 0;
    class Node{
        int val;
        Node next;
        Node prev;

        public Node(int val) {
            this.val = val;
        }
    }
    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        node.prev = null;
        if(head!=null){
            head.prev = node;
        }
        head = node;
        size+=1;
    }
    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.val+"->");
            temp=temp.next;
        }
        System.out.println("END");
    }
    public void insertAtLast(int val){
        Node node = new Node(val);
        Node last = head;
        node.next = null;
        if(head == null){
            node.prev = null;
            head = node;
            return;
        }

        while (last!=null){ // last.next != null
            last=last.next;
            if(last.next == null){
                break;
            }
        }
        last.next = node;
        node.prev = last;

    }
    public void insertAtPos(int pos, int val) {
        Node node = new Node(val);
        Node preNode = head;
        if(pos == 1){
            insertFirst(val);
            return;
        }
        for (int i = 1; i < pos-1; i++) {
            preNode = preNode.next;
        }
        node.next = preNode.next;
        (preNode.next).prev = node;
        preNode.next = node;
        node.prev = preNode;

    }


}
