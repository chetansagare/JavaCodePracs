import java.util.Stack;
import java.lang.*;
public class QueueUsingStack<E>{
    public static void main(String[] args) throws EmptyQueException {
        Queue queue=new Queue();
        queue.enque(1);
        queue.enque(2);
        queue.enque(3);
        queue.enque(4);
        queue.enque(5);

        System.out.println(queue.dequeue());
        System.out.println(queue.first());
        System.out.println(queue.last());

    }
}
class Queue<E>{
    private int queueSize;
    private Stack<E> aStack=new Stack<E>();
    private Stack<E> bStack=new Stack<E>();

    public Queue(){
        queueSize=0;
    }

    void enque(E data){
        if(!aStack.empty()){
            ++queueSize;
            aStack.push(data);
        }
        else{
            while(!bStack.empty()){
                aStack.push(bStack.pop());
            }
            ++queueSize;
            aStack.push(data);
        }
    }
    E dequeue() throws EmptyQueException{
        if(!bStack.empty()){
            --queueSize;
            return bStack.pop();
        }else{
            while(!aStack.empty()){
                bStack.push(aStack.pop());
            }
            if(!bStack.empty()) {
                --queueSize;
                return bStack.pop();
            }
            else throw new EmptyQueException();
        }
    }
    E first() throws EmptyQueException{
        if(aStack.empty() && bStack.empty()) throw new EmptyQueException();
        else if(!bStack.empty()) return bStack.peek();
        else {
            while(!aStack.empty()){
                bStack.push(aStack.pop());
            }
            return bStack.peek();
        }
    }
    E last() throws EmptyQueException{
        if(aStack.empty() && bStack.empty()) throw new EmptyQueException();
        else if(!aStack.empty()) return aStack.peek();
        else {
            while(!bStack.empty()){
                aStack.push(bStack.pop());
            }
            return aStack.peek();
        }
    }
    int size(){
        return queueSize;
    }
}
class EmptyQueException extends Exception{
    public EmptyQueException(){

    }
}