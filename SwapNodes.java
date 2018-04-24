import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


public class SwapNodes{
    
    public static void main(String[] args) {
       
        ArrayList<Node> list=new ArrayList<>();
        
        list.add(new Node(0));
        list.add(new Node(1));
        Scanner s=new Scanner(System.in);
        int n =s.nextInt();
        for(int i=1;i<=n;i++){
            int leftData=s.nextInt();
            int rightData=s.nextInt();
            Node node=list.get(i);
            if(node!=null){
                if(leftData!=-1){
                    Node lchild=new Node(leftData);
                    node.left=lchild;
                    list.add(leftData,lchild);
                }
                if(rightData!=-1){
                    Node rchild=new Node(rightData);
                    node.right=rchild;
                    list.add(rightData, rchild);
                }
            }
        }
        ArrayList<Integer> levelCount=new ArrayList<>();
        ArrayList<Integer> levelStart=new ArrayList<>();
        printLevelsInLine(list.get(1),levelCount);
        formLevelStart(levelCount,levelStart);


        int q=s.nextInt();
        
        for(int i=0;i<q;i++){
            int k=s.nextInt();
            int x=(int)((levelCount.size()-1)/k);
            for(int j=1;j<=x;j++){
                int start=levelStart.get(j*k-1);
                int endInc=levelCount.get(j*k-1);
                swapNodesInLevels(list,start,endInc);
            }
            printInOrder(list.get(1));
            System.out.println();
        }
        // System.out.println(Arrays.toString(levelCount.toArray()));
        // System.out.println(Arrays.toString(levelStart.toArray()));
        
    }

    public static void swapNodesInLevels(ArrayList<Node> list,int start,int end){
        for(int i=start;i<=end;i++){
            Node node=list.get(i);
            Node temp=node.left;
            node.left=node.right;
            node.right=temp;
        }
    }

    public static void formLevelStart(ArrayList<Integer> levelCount,ArrayList<Integer> levelStart){
        levelStart.add(levelCount.get(0));
        for(int i=1;i<levelCount.size();i++){
            levelStart.add(levelCount.get(i-1)+1);
        }
    }
    public static void printInOrder(Node root){
        if(root==null) return;
        if(root.left!=null) printInOrder((root.left));
        System.out.print(root.data+" ");
        if(root.right!=null) printInOrder(root.right);
    }

    public static void printLevelsInLine(Node root,ArrayList<Integer> levelCount){
        if(root==null) return;
        Queue<Node> q=new LinkedList<>();
        int count=0,dummy=0;
        q.add(root);
        while(true){
            int nodeCount=q.size();
            if(q.size()==0) break;
            if(count!=0){
                dummy=levelCount.get(count-1);
            }
            levelCount.add(count,nodeCount+dummy);
            
            while(nodeCount>0){
                Node node=q.peek();
                // System.out.print(node.data+" ");
                q.remove();
                if(node.left!=null) q.add(node.left);
                if(node.right!=null) q.add(node.right);
                --nodeCount;
            }
            // System.out.println("");
            ++count;
        }
    }
}
class Node{
    Node left;
    Node right;
    int data;
    public Node(int data){
        this.data=data;
    }
}