public class RemoveLoop{
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        list.head=new Node(1);
        list.head.next=new Node(2);
        list.head.next.next=new Node(3);
        list.head.next.next.next=new Node(4);
        list.head.next.next.next.next=new Node(5);
        list.head.next.next.next.next.next=list.head.next;

        list.printList(list.head);

    }
}
class Node{
    Node next;
    int data;
    Node(int data){
        this.data=data;
    }
}
class SinglyLinkedList{
    Node head;
    void printList(Node node){
        if(node==null)return;
        Node temp=node;
        while(temp!=null){
            System.out.print(temp.data+" ->");
            temp=temp.next;
        }
        System.out.print(" null");
    }
    void detectLoop(Node node){
        if(node==null || node.next==null)return;
        
    }
}