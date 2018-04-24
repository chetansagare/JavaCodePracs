import java.util.ArrayList;
import java.util.HashSet;
public class DemoList{
    public static void main(String args[]){
        SinglyLinkedList list = new SinglyLinkedList();
        // list.head=list.makeLoop();
        // System.out.println(list.getLoopLength(list.head));
        // System.out.println(list.getLoopLengthGFG(list.head));
        
        list.append(1);
        list.append(-2);
        list.append(3);
        list.append(-4);
        list.append(-5);
        list.append(6);
        list.append(-7);
        list.append(9);
        list.append(-14);
        list.append(18);
        list.append(-28);
        // list.append(10);
        // list.append(81);
        // list.append(81);
        
        // SinglyLinkedList slist = new SinglyLinkedList();
        // slist.append(1);
        // slist.append(8);
        // slist.append(14);
        // slist.append(15);
        // slist.append(16);
        // slist.append(18);
        // slist.append(19);
        // slist.append(25);
        // slist.append(26);
        // list.append(31);
        // list.append(41);
        // list.append(50);
        // list.append(52);
        // list.append(61);
        // list.append(62);
        // list.append(72);
        // list.append(80);
        // list.append(0);
        // list.append(1);
        // list.append(0);
        // list.append(2);
        // list.append(1);
        
        
        
        list.printList(list.head);
        System.out.println("");

        list.sortAbsolutelySortedList(list.head);
        // list.deleteNafterM(list.head,2, 2);
        //list.bubbleSort(list.head);
        // list.checkIfLengthIsEvenOrOdd(list.head);

        // list.rearrangeLinkedListInPlace(list.head);
        // // list.rearrangeInPlaceWithoutList(list.head);
        // slist.printList(slist.head);
        // System.out.println("");
        
        // list.makeLoop();
        // list.detectAndRemoveLoop(list.head);
        //list.seperateEvenOdd(list.head);
        // list.deleteLastOccurance(list.head,11);
        // list.deleteDuplicatesInSortedList(list.head);
        // slist.printList();
        // System.out.println("");
        // SinglyLinkedList resList=SinglyLinkedList.getCommonList(list,slist);
        // resList.printList();
        // list.printList();
        //System.out.println("");
        //System.out.println(list.checkIdenticalLists(list.head, slist.head));
        //list.deleteAlternateNodes();    
        // list.insertNodeAt(12,2);
        // list.deleteNodeAt(12);
        // list.deleteFirstKey(11);
        // System.out.println();
        // System.out.println("Linked List Size : "+list.getSize());
        // System.out.println("Linked List Iterative Size : "+list.iterativeSize());
        // System.out.println("Linked List Recursive Size : "+list.recursiveSize(list.head));
        // System.out.println("Linked List Iterative Search : "+list.iterativeSearch(5));
        // System.out.println("Linked List Recursive Search : "+list.recursiveSearch(6,list.head));
        // list.deleteRepeated(list.head);
        // list.removeDuplicatesInUnsortedList();
        // list.pairWiseSwap();
        // list.moveLastToFirst();
        // list.swapNodes(4,9);
        // list.MergeSort(list);
        // list.head=list.MergeSortRecursive(list.head);
         // list.append(8);
        // list.append(6);
        // list.append(2);
        // list.append(9);
        // list.append(13);
        // list.append(8);
        // list.append(1);
        // list.append(5);
        // list.append(5);
        // list.append(8);
        // list.append(9);
        // list.append(10);
        // list.append(11);
        // SinglyLinkedList newList=new SinglyLinkedList();
        
        // newList.head= list.mergeTwoSortedLists(list.head,slist.head);
    
        // list.makeMiddleHead(list.head);
        // System.out.println(list.findRotationsInSortedArray(list.head));
        // list.addAfterNthFromBack(list.head,5,26);
        // list.sortLinkedListOfZerosOnesTwos(list.head);
        // list.insertNodeAfterMiddle(list.head,10);
        // SinglyLinkedList newList = new SinglyLinkedList();
        // newList.head=list.mergeTwoListsInSame(list.head,slist.head);
        // SinglyLinkedList sumList=new SinglyLinkedList();
        // sumList.head=sumList.addTwoNumberRepresentedByList(list.head,slist.head);
        // newList.printList();
        
        // sumList.printList();
        // System.out.println("");
        // SinglyLinkedList newList=list.mergeListInReverse(list.head,slist.head);
        // newList.printList(newList.head);        
    }
}

class SinglyLinkedList{
    Node head;
    Node last;
    int size;
    Node start;
    Node end;
    SinglyLinkedList(){
    //Linkedlist Constructor
        size =0;
    }
    private class Node{
        int data;
        Node next;
        Node(int data){
        //Node class constructor
            this.data = data;
        }
    }
    public void append(int data){
    //Adds New Node at end
    if(head!=null){
       Node node = new Node(data);
       node.next=null;
       last.next=node;
       last = node;
       ++size;
    }else{
        ++size;
        Node node = new Node(data);
        head=node;
        last=node;
    }
    }
    public void push(int data){
    //Adds New Node at start of the list
    if(head!=null){
    Node node = new Node(data);
    node.next=head;
    head=node;
    ++size;
    }else{
        Node node = new Node(data);
        head=node;
        last = node;
        ++size;
    }
    }
    public void insertNodeAt(int data, int index){
    //Insert Node at particular index where index starts with head as 1
    if(index==1){
        push(data);
    }else if(index==size+1){
        append(data);
    }else if(index>size+1){
        System.err.print("Error : Index out of LinkedList");
    }else {
        Node temp = head;
        int count =1;
        while(count<index-1){
            temp=temp.next;
            ++count;
        }
        Node node = new Node(data);
        node.next=temp.next;
        temp.next=node;
        ++size;
    }
    
    }
    public void deleteNodeAt(int index){
    //Delete Node at particular index, here Index of LinkedList starts at 1
    if(head==null){
        return;
    }
    if(index==1){
        head=head.next;
        --size;
    }
    else if(index>size){
        System.err.println("Error : No such Node exist");
        }else{
    Node temp = head;
    int count =1;
     while(count<index-1){
        temp=temp.next;
        ++count;
    }
    if(index==size){
        last=temp;
        temp.next=null;
        --size;
    }else{
     temp.next=temp.next.next;
    --size;      
    }
    }
    }
    public void deleteFirstKey(int key){
        if(head==null) return;
        Node temp = head;
        if(head.data==key){
            head=head.next;
            --size;
            return;
        }else{
            while(temp!=null){
                if(temp.next!=null && temp.next.data==key){
                    try{
                        temp.next=temp.next.next;    
                    }catch(Exception e){
                        temp.next=null;   
                    }
                    --size;
                    break;
                }
                temp=temp.next;
            }
            return;
        }
    }
    public int getSize(){
    //returns size of the LinkedList
    return size;
    }
    public int iterativeSize(){
        int length = 0;
        Node temp = head;
        while(temp!=null){
            ++length;
            temp=temp.next;
        }
        return length;
    }
    public int recursiveSize(Node node){
        if(node==null){
            return 0; 
        }else return 1+recursiveSize(node.next);
    }
    public void printList(Node node){
        if(node!=null){
        Node temp=node;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.print(null+"");   
        }
    }
    public boolean iterativeSearch(int key){
        Node temp = head;
        while(temp!=null){
            if(temp.data==key) return true;
            temp=temp.next;
        }
        return false;
    }
    public boolean recursiveSearch(int key,Node node){
        if(node==null) return false;
        else if(node.data==key) return true;
        else return recursiveSearch(key,node.next);
    }
    public void swapNodes(int x,int y){
        if(head==null) return;
        if(x==y) return;
        Node currX=head,prevX=null,currY=head,prevY=null;
        while(currX!=null && currX.data!=x){
            prevX=currX;
            currX=currX.next;
        }
        while(currY!=null && currY.data!=y){
            prevY=currY;
            currY=currY.next;
        }
        
        if(prevX!=null) prevX.next=currY;
        else head=prevX;
        
        if(prevY!=null) prevY.next=currX;
        else head=prevY;
        
        Node temp = currX.next;
        currX.next=currY.next;
        currY.next=temp;
    }
    public void deleteRepeated(Node head){
        Node temp = head;
        while(temp.next!=null){
            // int key=temp.data;
            // Node currNode=temp;
            // while(currNode.next!=null && currNode.next.data==key){
            //     currNode=currNode.next;
            // }
            // if(!currNode.equals(temp)) temp.next=currNode.next;
            // else temp=temp.next;
            if(temp.data==temp.next.data){
                temp.next=temp.next.next;
            }else temp=temp.next;
            
        }
        return;
    }
    public void removeDuplicatesInUnsortedList(){
        HashSet<Integer> set = new HashSet<>();
        Node temp = head;
        set.add(temp.data);
        while(temp.next!=null){
            if(set.contains(temp.next.data)){
                temp.next=temp.next.next;
            }else{
                set.add(temp.next.data);
                temp=temp.next;
            }
        }
        System.out.println("Done");
        return;
    }
    public void pairWiseSwap(){
        if(head==null) return;
        Node temp=head;
        while(temp!=null && temp.next!=null){
            swap(temp,temp.next);
            temp=temp.next.next;
        }
    }
    public void swap(Node a,Node b){
        int k=a.data;
        a.data=b.data;
        b.data=k;
    }
    public void moveLastToFirst(){
        if(head==null) return;
        Node temp=head;
        while(temp.next.next!=null){
            temp=temp.next;
        }
        Node node=temp.next;
        node.next=head.next;
        temp.next=head;
        temp.next.next=null;
        head=node;
        
    }
    public static SinglyLinkedList getCommonList(SinglyLinkedList alist,SinglyLinkedList blist){
        if(alist.head==null || blist.head==null) return null;
        SinglyLinkedList reslist = new SinglyLinkedList();
        Node atemp=alist.head;
        Node btemp=blist.head;
        
        while(atemp!=null && btemp!=null){
            while(atemp!=null && btemp!=null && atemp.data<btemp.data){
                atemp=atemp.next;
            }
            while(atemp!=null && btemp!=null && btemp.data<atemp.data){
                btemp=btemp.next;
            }
            if( atemp!=null && btemp!=null && atemp.data==btemp.data){
                reslist.append(atemp.data);
            }
            if(atemp!=null && btemp!=null){
            atemp=atemp.next;
            btemp=btemp.next;   
            }
        }
        return reslist;
    }
    public void deleteAlternateNodes(){
        Node temp=head;
        while(temp.next!=null){
            temp.next=temp.next.next;
            temp=temp.next;
        }
    }public void makeAlternateList(){
        Node temp=head;
        SinglyLinkedList altList=new SinglyLinkedList();
        while(temp.next!=null){
            altList.append(temp.next.data);
            temp.next=temp.next.next;
            temp=temp.next;
        }
        System.out.println("");
        altList.printList(altList.head);
        System.out.println("");
    }
    public boolean checkIdenticalLists(Node ahead, Node bhead){
        Node atemp=ahead;
        Node btemp=bhead;
        if(ahead!=null && bhead!=null){
            if(ahead.data!=bhead.data) return false;
            else return checkIdenticalLists(ahead.next, bhead.next);
        }else if(ahead==null && bhead==null) return true;
        else return false;
        
        // while(atemp!=null && btemp!=null){
        //     if(atemp.data!=btemp.data) return false;
        //     atemp=atemp.next;
        //     btemp=btemp.next;
        // }
        // if((atemp!=null && btemp==null) || (atemp==null && btemp!=null) )return false;
        // return true;
    }
    public void MergeSort(SinglyLinkedList list){
        if(list.head.next==null) return;
        Node mid=list.head;
        Node temp=list.head;
        
        SinglyLinkedList left=new SinglyLinkedList();
        SinglyLinkedList right=new SinglyLinkedList();
        
        while(temp!=null && temp.next!=null){
            left.append(mid.data);
            mid=mid.next;
            temp=temp.next.next;
        }
        while(mid!=null){
            right.append(mid.data);
            mid=mid.next;
        }
        // left.printList();
        // System.out.println("");
        // right.printList();
        MergeSort(left);
        MergeSort(right);
        
        Merge(list,left,right);
        
    }
    public void Merge(SinglyLinkedList list,SinglyLinkedList left,SinglyLinkedList right){
        Node k=list.head;
        Node i=left.head;
        Node j=right.head;
        
        while(k!=null && i!=null && j!=null){
            if(i.data<=j.data){
                k.data=i.data;
                i=i.next;
                k=k.next;
            }else{
                k.data=j.data;
                j=j.next;
                k=k.next;
            }
        }
        while(k!=null && i!=null){
            k.data=i.data;
            k=k.next;
            i=i.next;
        }
        while(k!=null && j!=null){
            k.data=j.data;
            k=k.next;
            j=j.next;
        }
    }
    public Node MergeSortRecursive(Node node){
        if(node==null || node.next==null) return node;
        Node middle = getMiddle(node);
        Node nextOfMiddle = middle.next;
        middle.next=null;
        Node left= MergeSortRecursive(node);
        Node right=MergeSortRecursive(nextOfMiddle);
    
        Node sortedListHead=MergeRecursive(left,right);
        return sortedListHead;
    }
    public Node MergeRecursive(Node a,Node b){
        Node res=null;
        if(a==null) return b;
        if(b==null) return a;
        if(a.data<=b.data){
            res=a;
            res.next=MergeRecursive(a.next,b);
        }else{
            res=b;
            res.next=MergeRecursive(a,b.next);
        }
        return res;
        
    }
    public Node getMiddle(Node node){
        if(node==null) return node;
        Node slow=node;
        Node fast=node.next;
        while(fast!=null){
            fast=fast.next;
            if(fast!=null){
            slow=slow.next;
            fast=fast.next;
            }
            
        }
        return slow;
    }
    public Node mergeTwoSortedLists(Node ahead,Node bhead){
        Node result=null;
        if(ahead==null) return bhead;
        if(bhead==null) return ahead;
        
        if(ahead.data<=bhead.data){
            result=ahead;
            result.next=mergeTwoSortedLists(ahead.next,bhead);
        }
        else{
            result=bhead;
            result.next=mergeTwoSortedLists(ahead,bhead.next);
        }
        return result;
    }
    // public void reverseInParts(Node node,int k){
    //      if(node==null || node.next==null) return;
    //      int count=1;
    //      Node p=null,c=node,n=null,start=head;
    //      while(c!=null){
    //          n=c.next;
    //          c.next=p;
    //          p=c;
    //          c=n;
    //          if(c==k || c.next==null){
    //             p=start;
    //          }
    //      }
    // }
   
    public Node reverseLinkedList(Node node){
        if(node==null || node.next==null) return head;
        Node p=null,c=node,n=null;
        while(c!=null){
            n=c.next;
            c.next=p;
            p=c;
            c=n;
        }
        return p;
    }
    public void makeMiddleHead(Node node){
        Node fast=node;
        Node slow=node;
        Node prev=null,second=null;
        while(fast!=null){
            fast=fast.next;
            if(fast!=null){
                fast=fast.next;
                prev=slow;
                slow=slow.next;
            }
        }
        second=node.next;
        fast=slow.next;
        prev.next=node;
        node.next=fast;
        slow.next=second;
        head=slow;
    }
    public int findRotationsInSortedArray(Node node){
        if(node==null || node.next==null) return 0;
        int count=0;
        Node temp=node;
        while(temp.next!=null){
            ++count;
            if(temp.data>temp.next.data) break;
            temp=temp.next;
        }
        return count;
    }
    public void addAfterNthFromBack(Node node,int n,int x){
        Node fast=head;
        Node slow=head;
        int count=1;
        while(count!=n){
            fast=fast.next;
            ++count;
        }
        while(fast.next!=null){
            slow=slow.next;
            fast=fast.next;
        }
        Node i = new Node(x);
        i.next=slow.next;
        slow.next=i;
    }
    public void sortLinkedListOfZerosOnesTwos(Node node){
        if(node==null || node.next==null) return;
        Node temp=node;
        Node zeroHead=new Node(0);
        Node oneHead=new Node(1);
        Node twoHead=new Node(2);
        Node one=oneHead,two=twoHead,zero=zeroHead;
        while(temp!=null){
            Node nextTemp=temp.next;
            if(temp.data==0){
                zero.next=temp;
                zero=zero.next;
                temp=temp.next;
            }else if(temp.data==1){
                one.next=temp;
                one=one.next;
                temp=temp.next;
            }else if(temp.data==2){
                two.next=temp;
                two=two.next;
                temp=temp.next;
            }
        }
      head=zeroHead.next;
      zero.next=oneHead.next;
      one.next=twoHead.next;
      two.next=null;
        
    }
    public void insertNodeAfterMiddle(Node node,int x){
        if(node==null || node.next==null) return;
        Node fast=node;
        Node slow=node;
        while(fast!=null){
            fast=fast.next;
            if(fast!=null){
                fast=fast.next;
                slow=slow.next;
            }
        }
        Node m=new Node(x);
        m.next=slow.next;
        slow.next=m;
    }
    public Node mergeTwoListsInSame(Node ahead,Node bhead){
        Node i=ahead;
        Node j=bhead;
        if(ahead==null) return bhead;
        if(bhead==null) return ahead;
        
        Node startHead=null,start=null;
        if(i.data<=j.data){
            start=i;
            i=i.next;
        }else{
            start=j;
            j=j.next;
        }
        startHead=start;
        
        while(i!=null && j!=null){
            if(i.data<=j.data){
                start.next=i;
                start=start.next;
                i=i.next;
            }else{
                start.next=j;
                start=start.next;
                j=j.next;
            }
        }
        while(i!=null){
          start.next=i;
          start=start.next;
          i=i.next;
        }
        while(j!=null){
            start.next=j;
            start=start.next;
            j=j.next;
        }
        head=startHead;
        return startHead;
    }
    public Node makeLoop(){
        SinglyLinkedList tempList=new SinglyLinkedList();
        tempList.head=new Node(1);
        tempList.head.next=new Node(2);
        tempList.head.next.next=new Node(3);
        tempList.head.next.next.next=new Node(4);
        tempList.head.next.next.next.next=new Node(5);
        tempList.head.next.next.next.next.next=new Node(6);
        tempList.head.next.next.next.next.next.next=new Node(7);
        tempList.head.next.next.next.next.next.next.next=new Node(8);
        tempList.head.next.next.next.next.next.next.next.next=tempList.head.next;
        // tempList.head.next.next.next.next.next.next.next.next.next=new Node();
        // tempList.head.next.next.next.next.next.next.next.next.next.next=new Node();
        // tempList.head.next.next.next.next.next.next.next.next.next.next.next=new Node();
        head=tempList.head;
        return tempList.head;
    }
    public int getLoopLength(Node node){
        if(node==null || node.next==null) return 0;
        Node fast=node;
        Node slow=node;
        boolean start=false;
        int flag=0;
        int i=0;
        while(fast!=null){
            fast=fast.next.next;
            slow=slow.next;
            if(slow.equals(fast)){
                ++flag;
                start=true;
                if(flag==2){
                 start=false;
                 break;
                }
            }
            if(start) ++i;
        }
        if(fast==null) return 0;
        else return i;
    }
    public int getLoopLengthGFG(Node node){
        if(node==null || node.next==null) return 0;
        Node fast=node;
        Node slow=node;
        while(fast!=null){
            fast=fast.next.next;
            slow=slow.next;
            if(slow.equals(fast)) return countLoopNodes(slow);
        }
        return 0;
    }
    public int countLoopNodes(Node node){
        Node temp=node.next;
        int count =1;
        while(!temp.equals(node)){
            temp=temp.next;
            ++count;
        }
        return count;
    }
    public void deleteLastOccurance(Node node,int x){
        if(node==null || node.next==null) return;
        Node temp=node;
        Node preLast=null;
        if(temp.data==x) preLast=temp;
        
        while(temp.next!=null){
            if(temp.next.data==x){
                preLast=temp;
            }    
            temp=temp.next;
        }
        preLast.next=preLast.next.next;
    }
    public void deleteDuplicatesInSortedList(Node node){
         if(node==null || node.next==null) return;
         Node dummy=new Node(0);
         dummy.next=head;
         Node prev=dummy;
         Node current=head;
         
         while(current!=null){
          while(current.next!=null && current.next.data==prev.next.data){
              current=current.next;
          }
          if(prev.next==current){
           prev=prev.next;   
          }else{
            prev.next=current.next;  
            }
            current=current.next;
        }
        head=dummy.next;
    }
    public void deleteNodesGreaterValueOnRight(Node node){
        if(node==null || node.next==null) return;
        head=revList(node);
        Node prev=head;
        Node temp=head.next;
        Node maxSoFar=head;
        while(temp!=null){
         if(temp.data<maxSoFar.data){
             prev.next=temp.next;
         }else{
             maxSoFar=temp;
             prev=prev.next;
         }
         temp=temp.next;
        }
        head=revList(head);
    }
    public Node revList(Node node){
        if(node==null || node.next==null) return null;
        Node prev=null,curr=node,nextNode=null;
        
        while(curr!=null){
            nextNode=curr.next;
            curr.next=prev;
            prev=curr;
            curr=nextNode;
        }
        head=prev;
        return prev;
    }
    public void seperateEvenOdd(Node node){
        if(node==null || node.next==null) return;
        Node oddHead=new Node(1);
        Node evenHead=new Node(2);
        Node oddItr=oddHead;
        Node evenItr=evenHead;
        Node temp=node;
        
        while(temp!=null){
            if(temp.data%2==0){
                oddItr.next=temp;
                oddItr=oddItr.next;
                
            }else{
                evenItr.next=temp;
                evenItr=evenItr.next;
            }
            temp=temp.next;
        }
        head=evenHead.next;
        evenItr.next=oddHead.next;
        oddItr.next=null;
        
    }
    public void detectAndRemoveLoop(Node node){
        if(node==null || node.next==null) return;
        Node slow=node;
        Node fast=node;
        while(fast!=null){
            fast=fast.next;
            if(fast!=null){
                fast=fast.next;
                slow=slow.next;
            }
            if(slow.equals(fast)) break;
        }
        Node temp=head;
        while(fast!=null && temp!=null){
            
            if(temp.next.equals(slow.next)){
                System.out.println(slow.next.data);
                break;
            }
            temp=temp.next;
            slow=slow.next;
        }
        slow.next=null;
    }
    public void findUnionIntersection(Node a,Node b){
        HashSet<Integer> set=new HashSet<>();
        Node atemp=a;
        Node btemp=b;
        Node dummy=new Node(0);
        while(atemp!=null){
            set.add(atemp.data);
        }
    }
    public Node addTwoNumberRepresentedByList(Node aHead,Node bHead){
        if(aHead==null) return bHead;
        if(bHead==null) return aHead;
        int sum=0,carry=0;
        Node atemp=aHead;
        Node btemp=bHead;
        Node dummy=new Node(0);
        Node ctemp=dummy;
        while(atemp!=null && btemp!=null){
            sum=atemp.data+btemp.data+carry;
            carry=sum/10;
            sum=sum%10;
            Node n=new Node(sum);
            ctemp.next=n;
            atemp=atemp.next;
            btemp=btemp.next;
            ctemp=ctemp.next;
        }
        if(atemp!=null) ctemp.next=atemp;
        while(atemp!=null) {
           sum=atemp.data+carry;
           carry=sum/10;
           sum=sum%10;
           atemp.data=sum;
           atemp=atemp.next;
        }
        if(btemp!=null) ctemp.next=btemp;
        while(btemp!=null) {
           sum=btemp.data+carry;
           carry=sum/10;
           sum=sum%10;
           btemp.data=sum;
           btemp=btemp.next;
        }
       
        return dummy.next;
    }
    public void deleteNafterM(Node node,int m,int n){
        if(node==null) return;
        Node temp=node;
        int r=0;
        while(temp!=null && r<m-1){
            ++r;
            temp=temp.next;
        }
        Node lastNode=temp;
        int d=0;
        while(temp!=null && d<n+1){
            temp=temp.next;
            ++d;
        }
        if(lastNode!=null)lastNode.next=temp;
        deleteNafterM(temp, m, n);
    }
    public void bubbleSort(Node node){
        if(node ==null || node.next==null) return;
        Node dummy=new Node(0);
        dummy.next=node;
        Node atemp=node;
        Node btemp=node;
        Node prev=dummy;
        while(atemp!=null){
            while(btemp!=null && btemp.next!=null){
                if(btemp.next.data<btemp.data){
                    Node cpy=btemp.next;
                    prev.next=cpy;
                    btemp.next=cpy.next;
                    cpy.next=btemp;
                }
                prev=btemp;
                btemp=btemp.next;
            }
            btemp=dummy.next;
            atemp=atemp.next;
        }
        head=dummy.next;
    }
    public void selectionSort(Node node){
        if(node==null || node.next==null) return;
    
    }
    public void checkIfLengthIsEvenOrOdd(Node node){
        if(node==null){
            System.out.println("Even");
            return;
        }
        Node fast=node;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
        }
        if(fast==null){
            System.out.println("Even");
            return;
        }else{
            System.out.println("Odd");
            return;
        }
 
    }
    public Node rearrangeLinkedListInPlace(Node node){
        if(node==null || node.next==null) return node;
        Node temp=node.next;
        ArrayList<Node> list = new ArrayList<>();
        while(temp!=null){
            list.add(temp);
            temp=temp.next;
        }
        temp=node;
        int end=list.size()-1;
        int start=0;
        int n=1;
        while(start<end){
            if(n%2==1){
                temp.next=list.get(end);
                temp=temp.next;
                temp.next=null;
                ++n;
                --end;
            }else{
                temp.next=list.get(start);
                temp=temp.next;
                temp.next=null;
                ++n;
                ++start;
            }
        }
        head=node;
        return node;
    }
    public Node rearrangeInPlaceWithoutList(Node node){
        if(node==null || node.next==null) return node;
        Node temp=node;
        Node middle=getMiddle(node);
        Node nextOfMiddle=middle.next;
        middle.next=null;

        Node rev=reverseLinkedList(nextOfMiddle);

        while(rev!=null && temp.next!=null){
           
                Node t=temp.next;
                Node r=rev.next;
                temp.next=rev;
                rev.next=t;
                temp=temp.next.next;
                rev=r.next;
        }
        head=node;
        return node;
    }
    public SinglyLinkedList mergeListInReverse(Node ahead,Node bhead){
        SinglyLinkedList mergedList=new SinglyLinkedList();
        
        while(ahead!=null && bhead!=null){
            if(ahead.data<=bhead.data){
                Node temp=ahead;
                ahead=ahead.next;
                temp.next=null;
                addFirst(mergedList,temp);
            }else{
                Node temp=bhead;
                bhead=bhead.next;
                temp.next=null;
                addFirst(mergedList,temp);
            }
        }
        while(bhead!=null){
                Node temp=bhead;
                bhead=bhead.next;
                temp.next=null;
                addFirst(mergedList,temp);
            }
        while(ahead!=null){
                Node temp=ahead;
                ahead=ahead.next;
                temp.next=null;
                addFirst(mergedList,temp);
            }

        return mergedList; 
    }
    public void addFirst(SinglyLinkedList list,Node node){
        if(list.head==null){
            list.head=node;
            list.head.next=null;
            return;
        }
        Node temp=list.head;
        list.head=node;
        node.next=temp;
        return;
    }
    public void sortAbsolutelySortedList(Node node){
        if(node==null || node.next==null) return;
        Node temp=node;
        Node dummyPos=new Node(0);
        Node dummyNeg=new Node(0);
        Node pt=dummyPos,nt=dummyNeg;
        while(temp!=null){
            if(temp.data>=0){
                Node p=temp;
                temp=temp.next;
                p.next=null;
                pt.next=p;
                pt=pt.next;
            }else{
                Node n=temp;
                temp=temp.next;
                n.next=null;
                nt.next=n;
                nt=nt.next;
            }
        }
        Node lastOfNeg=dummyNeg.next;
        Node negHead=reverseLinkedList(dummyNeg.next);
        lastOfNeg.next=dummyPos.next;
        
        printList(negHead);
        System.out.println("");
    }
}