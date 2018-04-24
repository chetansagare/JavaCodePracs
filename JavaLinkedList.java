import java.util.LinkedList;

public class JavaLinkedList{
    public static void main(String[] args) {
      SinglyLinkedList list=new SinglyLinkedList();
      list.append(5);  
      list.append(10);  
      list.append(2);  
      list.append(3);  
      list.printList(list.head);

    //   list.makeArbiConnections(list.head);
    //   list.printWithArbi(list.head.next.next);
    list.addArbiConnections(list.head);
    list.printEachNodeArbi(list.head);
    }
}
class Node{
    int data;
    Node next;
    Node arbitory;
    Node(int data){
        this.data=data;
    }
}
class SinglyLinkedList{
   Node head;
   Node last;
   public void append(int data){
       if(head==null){
           Node node = new Node(data);
           head=node;
           last=node;
           return;
       }
       last.next=new Node(data);
       last=last.next;
   }
   public void printList(Node node){
       if(node==null){
           System.out.print("null");
           System.out.println("");
           return;
       }
       System.out.print(node.data+"->");
       printList(node.next);
   }
   public void printWithArbi(Node node){
       if(node==null){
        System.out.print("null");
        System.out.println("");
        return;
       }
       System.out.print(node.data+"->");
       printWithArbi(node.arbitory);
   }
   public void makeArbiConnections(Node node){
       if(node==null) return;
       Node temp=node;
       while(temp.next!=null){
           if(temp.next.data>temp.data){
               temp.arbitory=temp.next;
           }
           temp=temp.next;
       }
       if(head.data>temp.data){
           temp.arbitory=head;
       }
   }
   public Node addArbiConnections(Node node){
    if(node==null || node.next==null) return node;
    Node n=reverseLinkedList(node);
    Node temp=n.next,maxSoFar=n;
    while(temp!=null){
        temp.arbitory=maxSoFar;
        if(temp.data>=maxSoFar.data){
            maxSoFar=temp;
        }
        temp=temp.next;
    }
    node=reverseLinkedList(n);
    return node;
   }
   public Node reverseLinkedList(Node node){
    if(node==null || node.next==null) return node;
    Node p=null,c=node,n=null;
    while(c!=null){
        n=c.next;
        c.next=p;
        p=c;
        c=n;
     }
    return p;
   }
   public void printEachNodeArbi(Node node){
    if(node==null || node.next==null) return;
    Node temp=node;
    while(temp.next!=null){
        System.out.print(temp.arbitory.data+" ");
        temp=temp.next;
    }
    System.out.println("");
   }
}
