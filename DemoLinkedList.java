
public class DemoLinkedList{
    public static void main(String args []){
        int[] array = {2,4,3,7,8,14,11,45,34,17};
        Node head = new Node();
        head = makeLinkedList(array,head);
        Node n = new Node();
        n = head;
        for(int i=0;i<array.length;i++){
            System.out.println(n.data);
            n = n.next;
        }
       head = Insert(head,99);
       System.out.println("-------------------------------");
       n=head;
       for(int i=0;i<=array.length;i++){
        System.out.println(n.data);
        n = n.next;
    }
    }
    public static Node Insert(Node head,int data) {
        
         if(head.equals(null)){
             Node n = new Node();
             n.data = data;
             n.next = null;
             head = n;
             return head;
         } 
         Node node = new Node();
         node = head;
         while(node.next!=null){
             node =node.next;
         }
         Node last = new Node();
         last.data = data;
         last.next = null; 
         node.next = last;
         return head;   
     }

    public static Node makeLinkedList(int[] array, Node head){
        Node node = new Node();
        head.data=array[0];
        head.next=node;
        int n =0;
        while(n<array.length-1){
            Node temp = new Node();
            n++;
            node.data = array[n];
            node.next = temp;
            node = temp;
            
        }
        node = null;
        return head;
    } 
}
class Node {
    int data;
    Node next;
 }