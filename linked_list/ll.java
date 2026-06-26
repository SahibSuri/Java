package linked_list;
class Node{
    int data;       //stores the value
    Node next;      //stores the address / reference to the next node

    // constructor to create a new node
    public Node(int data){
        this.data = data;
        this.next = null;       //by default , a new node doesn't point to anything
    }

}


public class ll {
    Node head;      //starting pt. of LL
    public void printList(){
        Node current = head;
        while(current != null){
            System.out.println(current.data + "->");
            current = current.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        ll list = new ll();
        Node first = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);

        list.head = first;
        first.next = second;
        second.next = third;

        list.printList();
    }
}
