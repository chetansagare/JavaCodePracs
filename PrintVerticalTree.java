import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class PrintVerticalTree{
    public static void main(String[] args) {
    
        BinaryTree tree = new BinaryTree();
  
        /* Let us construct the tree shown in above diagram */
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(7);
        tree.root.right.left.right = new Node(8);
        tree.root.right.right.right = new Node(9);
  
        System.out.println("vertical order traversal is :");
        tree.printTree(tree.root);

        System.out.println("More Efficent with O(n) Time Complexity");
        tree.printVerticalEfficient(tree.root);
    }
}
class Value{
    int min;
    int max;
    public Value(){
        min=0;
        max=0;
    }
}
class Node{
    int data;
    Node left,right;
    public Node(int data){
        this.data=data;
        left=right=null;
    }
}
class BinaryTree{
    Node root;
    Value value=new Value();
    HashMap<Integer,HashSet<Integer>> map=new HashMap<>();

    void getMinMax(Node root,int curr){
        if(root==null) return;
        if(curr<value.min) value.min=curr;
        if(curr>value.max) value.max=curr;

        getMinMax(root.left, curr-1);
        getMinMax(root.right, curr+1);
        
    }

    void printTree(Node root){
        getMinMax(root, 0);
    
        for(int i=value.min;i<=value.max;i++){
            printColumn(root,0,i);
            System.out.println("");
        }
    }
    void printColumn(Node root,int currLen,int col){
        if(root==null) return;
        if(currLen==col) System.out.print(root.data+" ");
        printColumn(root.left, currLen-1, col);
        printColumn(root.right, currLen+1, col);
    }

    void printVerticalEfficient(Node root){
        traverse(root,map,0);
        int min=0,max=0;
        if(i<min) min=i;
        if(i>max) max=i;
        // Here map is the HashMap object with Integer as a Key and ArrayList as a Value 
        for(Integer i:map.keySet()){
            //Here i is the key for the HashMap
            ArrayList<Integer> list=map.get(i); //This gives you the ArrayList stored in the HashMap
            System.out.println(list.toString()); // This will print the ArrayList which is stored in the HashMap values
        }
        for(int i=min;i<=max;i++){
            if(map.containsKey(i)) System.out.println(map.get(i).toString());
        }
    }
    void traverse(Node root,HashMap<Integer,HashSet<Integer>> map,int curr){
        if(root==null)return;
        if(map.containsKey(curr)){
            HashSet<Integer> set=map.get(curr);
            set.add(root.data);
        }else{
            HashSet<Integer> set=new HashSet<>();
            set.add(root.data);
            map.put(curr, set);
        }
        traverse(root.left, map, curr-1);
        traverse(root.right, map, curr+1);
    }
}