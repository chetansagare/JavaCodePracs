import java.util.Scanner;

public class DemoTree{
    public static void main(String[] args) {
        BinaryTree binaryTree=new BinaryTree();
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        scan.nextLine();
        binaryTree.root=new Node(1);
        for(int i=1;i<=n;i++){
            int l=scan.nextInt();
            int r=scan.nextInt();

            binaryTree.addChilds(binaryTree.root,i, l, r);

            scan.nextLine();

        }
        // int t=scan.nextInt();
        // scan.nextLine();
        // for(int i=0;i<t;i++){

        // }
        scan.close();
        binaryTree.printInOrder(binaryTree.root);
    }
}
class BinaryTree{
    Node root;

    public void addChilds(Node n,int parent,int left,int right){
        if(left==-1 && right==-1) return;
        Node node=inOrderTraversal(n,parent);
        System.out.println(node.data);
        if(node==null) return;
        if(left!=-1){
            Node temp=new Node(left);
            node.left=temp;
        } 
        if(right!=-1){
            Node temp=new Node(right);
            node.right=temp;
        } 
    }
    public Node inOrderTraversal(Node root,int data){
    
        if(root.data==data) return root;
        else if(root.left!=null){
            Node n= inOrderTraversal(root.left, data);
            if(n!=null) return n;
        } 
        else if(root.right!=null){
            Node n= inOrderTraversal(root.right, data);
            if(n!=null) return n;
        }
        return root;
    }
    public void printInOrder(Node root){
        if(root==null) return;
        if(root.left!=null) printInOrder(root.left);
        System.out.print(root.data+" ");
        if(root.right!=null)printInOrder(root.right);
    }

}
class Node{
    Node left;
    Node right;
    Node parent;
    int data;

    Node(int data){
        this.data=data;
    }
}