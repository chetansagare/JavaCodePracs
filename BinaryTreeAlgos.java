import java.lang.Math;
import java.util.ArrayList;
public class BinaryTreeAlgos{
    public static void main(String args[]){
        BinaryTree btree=new BinaryTree();
        btree.root=new Node(1);
        btree.root.left=new Node(2);
        btree.root.right=new Node(3);
        btree.root.left.left=new Node(4);
        btree.root.left.right=new Node(5);
        btree.root.right.left=new Node(6);
        btree.root.right.right=new Node(7);
        
        System.out.println("");
        System.out.print("Level Order : ");
        btree.printLevelOrder(btree.root);
        System.out.println("");
        System.out.print("Level Order Efficient : ");
        btree.printLevelOrderEfficient(btree.root);
        System.out.println("");
        System.out.print("In Order : ");
        btree.printInOrder(btree.root);
        System.out.println("");
        System.out.print("Pre Order : ");
        btree.printPreOrder(btree.root);
        System.out.println("");
        System.out.print("Post Order : ");
        btree.printPostOrder(btree.root);
    }
}
class BinaryTree{
    Node root;
    
     ArrayList<Node> queue=new ArrayList<Node>();
    
    public void printLevelOrder(Node node){
        if(node==null) return;
        int height = getTreeHeight(node);
        for(int i=0;i<=height;i++){
            printGivenLevel(node,i);       
        }
    }
    public int getTreeHeight(Node node){
        if(node==null) return 0;
        else {
            int leftHeight=getTreeHeight(node.left);
            int rightHeight=getTreeHeight(node.right);
            return Math.max(leftHeight,rightHeight)+1;
        }
    }
    private void printGivenLevel(Node node,int level){
        if(node==null) return;
        if(level==1) System.out.print(node.data+" ");
        else{
            printGivenLevel(node.left,level-1);
            printGivenLevel(node.right,level-1);
        }
    }
    public void printLevelOrderEfficient(Node node){
        queue.add(node);
        printLevelsUsingQueue(0);
    }
    private void printLevelsUsingQueue(int index){
        if(index>=queue.size()) return;
        Node temp=queue.get(index);
        System.out.print(temp.data+" ");
        if(temp.left!=null) queue.add(temp.left);
        if(temp.right!=null) queue.add(temp.right);
        ++index;
        printLevelsUsingQueue(index);
    }
    public void printInOrder(Node node){
        if(node==null) return;
        printInOrder(node.left);
        System.out.print(node.data+" ");
        printInOrder(node.right);
    }
    public void printPreOrder(Node node){
        if(node==null) return;
        System.out.print(node.data+" ");
        printInOrder(node.left);
        printInOrder(node.right);
    }
    public void printPostOrder(Node node){
        if(node==null) return;
        printInOrder(node.left);
        printInOrder(node.right);
        System.out.print(node.data+" ");
    }
    
}
class Node{
    int data;
    Node left;
    Node right;
 
    public Node(int data){
        this.data=data;
        this.left=null;
        this.right=null;
    }
}