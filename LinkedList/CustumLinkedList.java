public class CustumLinkedList {
    Node head;
    Node tail;
    int size;
    public CustumLinkedList(){
        this.size = 0;
    }
    public class Node{
        int val;
        String string;
        Node next;
        public Node(int val){
            this.val = val;
        }
        public Node(int val, String string){
            this.val = val;
            this.string = string;
        }
        public Node(String string){
            this.string = string;
        }



        public Node(int val, Node next){
            this.val = val;
            this.next = next;
        }

    }
    public void insertAtFirst(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;
        if(tail == null){
            tail = head;
        }
        size += 1;

    }
    public void insertAtLast(int val){
        if(tail == null){
            insertAtFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;
    }
    public void insert(int val, int index){

        if(index == 0){
            insertAtFirst(val);
        } else if (index == size) {
            insertAtLast(val);
        }
        else {
            Node temp = head;
            for (int i = 1; i < index; i++) {
                temp = temp.next;
            }
            Node node = new Node(val, temp.next);
            temp.next = node;
            size++;
        }


    }

    public int deleteAtFirst() {
        int val = head.val;
        head = head.next;
        if(head == null){
            tail = null;
        }
        size--;
        return val;
    }
    public Node  getNode(int index){
        Node node = head;
        for(int i = 0; i< index; i++){
            node = node.next;
        }

        return node;
    }
    public int deleteAtLast(){

        Node secondLast = getNode(size - 2);
        int val = tail.val;
        tail = secondLast;
        tail.next = null;
        size--;
        return val;

    }

    public int delete(int index){
        int val;
        if(index == 0){
            val = deleteAtFirst();
        } else if (index == size) {
            val = deleteAtLast();

        }
        else {
            Node node = getNode(index);
            val = node.val;
            node.next = (node.next).next;
        }
        size--;
        return val;

    }
    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.val+"->");
            temp = temp.next;
        }
        System.out.print("END\n");
    }
}
