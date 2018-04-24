import java.util.*;
public class FindMaxBST{
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(50);
        tree.root.left = new Node(30);
        tree.root.right = new Node(60);
        tree.root.left.left = new Node(5);
        tree.root.left.right = new Node(20);
        tree.root.right.left = new Node(45);
        tree.root.right.right = new Node(70);
        tree.root.right.right.left = new Node(65);
        tree.root.right.right.right = new Node(80);

        System.out.println(tree.getMaxBstLength(tree.root));
    }
}
class Node{
    int data;
    Node left,right;
    Node(int data){
        this.data=data;
    }
}
class BinaryTree{
    Node root;
    static int index=0;
    static int[] path=new int[50];
    public void inOrderTraversal(Node node){
        if(node==null) return;
        if(node.left!=null) inOrderTraversal(node.left);
        path[index]=node.data;
        ++index;
        if(node.right!=null) inOrderTraversal(node.right);
    }
    public int getTreeSize(Node node){
        if(node==null) return 0;
        return 1+getTreeSize(node.left)+getTreeSize(node.right);
    }
    public boolean checkIsABst(Node node){
        if(node==null) return false;
        index=0;
        inOrderTraversal(node);
        for(int i=0;i<index-1;i++) if(path[i]>path[i+1]) return false;
        return true;
    }
    public int getMaxBstLength(Node node){
        if(node==null) return 0;
        if(checkIsABst(node)) return getTreeSize(node);
        else return Math.max(getMaxBstLength(node.left), getMaxBstLength(node.right));
    }
}