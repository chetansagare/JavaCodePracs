import java.lang.*;
public class StackImplementation{
    public static void main(String[] args) throws StackUnderFlowException,StackOverflowError{
        // StackArray stackArray=new StackArray(10);
        // stackArray.push(1);
        // stackArray.push(2);
        // stackArray.push(3);
        // stackArray.push(4);
        // stackArray.push(5);
        // stackArray.push(6);
        // stackArray.push(7);
        // stackArray.push(8);

        // stackArray.printStack();
        
        // System.out.println(stackArray.pop());
        // System.out.println(stackArray.pop());
        // System.out.println(stackArray.pop());
        // System.out.println(stackArray.pop());
        // stackArray.printStack();

        // System.out.println(stackArray.peek());
        // System.out.println(stackArray.isEmpty());
        // System.out.println(stackArray.size());

        StackLinkedList stackLinkedList=new StackLinkedList();
        stackLinkedList.push(1);
        stackLinkedList.push(2);
        stackLinkedList.push(3);
        stackLinkedList.push(4);
        stackLinkedList.push(5);
        stackLinkedList.push("Hello");

        System.out.println(stackLinkedList.pop());
        System.out.println(stackLinkedList.pop());
        System.out.println(stackLinkedList.pop());
        System.out.println(stackLinkedList.pop());
        System.out.println(stackLinkedList.pop());
        System.out.println(stackLinkedList.pop());
        System.out.println(stackLinkedList.pop());
        System.out.println("");

        stackLinkedList.printStackList(stackLinkedList.head);
                

    }
}
class StackArray{
    private int[] stackArray;
    private int size;
    private static int peekIndex;
    public StackArray(int size){
        peekIndex=-1;
        this.size=size;
        stackArray=new int[size];
    }
    void push(int data){
        ++peekIndex;
        if(peekIndex<size) stackArray[peekIndex]=data;
        else System.out.println("Stack Overflow Error");
    }
    int pop(){
        if(peekIndex>=0){
            --peekIndex;
            return stackArray[peekIndex+1];
        }
        System.out.println("Stack Underflow Error");
        return Integer.MIN_VALUE;
    }
    int peek(){
        if(peekIndex>=0) return stackArray[peekIndex];
        else return Integer.MIN_VALUE;
    }
    boolean isEmpty(){
        if(peekIndex>=0) return false;
        else return true;
    }
    int size(){
        return peekIndex+1;
    }
    void printStack(){
        if(peekIndex<0) return;
        for(int i=peekIndex;i>=0;i--)
        System.out.print(stackArray[i]+" ");
    }
}
class StackLinkedList<E>{
    Node<E> head;
    int size;
    StackLinkedList(){
        size=0;
    }
    void push(E data){
        if(head==null){
            Node<E> node =new Node<E>(data);
            head=node;
            ++size;
            return;
        }
        Node<E> node=new Node<E>(data);
        node.next=head;
        head=node;
        ++size;
        return;
    }
    E pop() throws StackUnderFlowException{
        if(head==null) throw new StackUnderFlowException() ;
        else{
            E popData=head.data;
            head=head.next;
            --size;
            return popData;
        }
    }
    E peek() throws StackUnderFlowException{
        if(head==null) throw new StackUnderFlowException();
        else{
            return head.data;
        }
    }
    void printStackList(Node<E> node){
        if(node!=null){
            System.out.print(node.data+" ");
            printStackList(node.next);
        }
    }
}
class Node<E>{
    E data;
    Node<E> next;
    public Node(E data){
        this.data=data;
    }
}
class StackUnderFlowException extends Exception{
    private static final long serialVersionUID = 1L;

	StackUnderFlowException(){

    }
}