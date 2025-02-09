class Node {
    int value;
    Node next;

    //constructor
    public Node(int value, Node next){
        this.value = value;
        this.next = next;
    }

    public Node(int value){
        this.value = value;
    }
}

public class LinkedList{
    Node head;

    public LinkedList(){
        this.head = null;
    }

    public LinkedList(Node node){
        this.head = node;
    }

    public void appendFirst(int value){
        Node newNode = new Node(value);
        if(this.head == null){
            newNode.next = null;
            this.head = newNode;
        }
        else{
            newNode.next = this.head;
            this.head = newNode;
        }
    }

    public void printList(){
        Node temp = this.head;
        while(temp!=null){
            System.out.print(temp.value + "->");
            temp = temp.next;
        }
    }

    public static void main(String[] args){
        LinkedList ll = new LinkedList();
        ll.appendFirst(1);
        ll.appendFirst(2);
        ll.appendFirst(3);
        ll.appendFirst(4);
        ll.appendFirst(5);
        ll.appendFirst(6);

        ll.printList();
    }


}