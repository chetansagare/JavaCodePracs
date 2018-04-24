public class LinkedListCon{
    public static void main(String[] args) {
        LinkedList listOne = new LinkedList();
        listOne.add(1);
        listOne.add(2);
        listOne.add(3);
        listOne.add(4);
        listOne.add(6);

        LinkedList listTwo = new LinkedList();
        listTwo.add(2);
        listTwo.add(4);
        listTwo.add(6);
        listTwo.add(8);

        LinkedList startList = findIntersection(listOne,listTwo);
        
    }
    private static LinkedList name(LinkedList listOne, LinkedList listTwo) {
        LinkedList newList = new LinkedList();
        while(true){

            break;
        }

        return newList;
    }
}
class LinkedList{
    int size;
    Node lastNode;
    int count;
    Node head;
    Node temp;
    public LinkedList(){
        size = 0;
        count=1;
        lastNode = null;
        temp=null;
        head=null;
    }
    private class Node{
        int data;
        Node next;
    }
    public void add(int data){
        if(size==0){
            head = new Node();
            head.data=data;
            head.next=null;
            lastNode=head;
        }else{
            Node node = new Node();
            node.data=data;
            node.next=null;
            lastNode.next=node;
            lastNode=node;
        }
    }
    public Node getCurrent(){
        return temp;
    }
    public int getNext(){
        if(count==1){
            ++count;
            temp = head.next;
            return head.data;
        }else if(count<=size){
            int dataReturn = temp.data;
            temp=temp.next;
            ++count;
            return dataReturn;
        }else{
            return 0;
        }
    }
}