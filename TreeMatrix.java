import java.util.Arrays;

public class TreeMatrix{
    static int[][] matrix;
    public static void main(String[] args) {
        int n =6;
        matrix=new int[n][n];

        BinaryTree bTree=new BinaryTree();
        bTree.root=new Node(5);
        bTree.root.left=new Node(1);
        bTree.root.right=new Node(2);
        bTree.root.left.left=new Node(0);
        bTree.root.left.right=new Node(4);
        bTree.root.right.left=new Node(3);

        bTree.writeMatrix(bTree.root,matrix);

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println("");
        }
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
class BinaryTree{
    Node root;

    public void writeMatrix(Node root,int[][] matrix){
        if(root==null) return;
        int ancestor=root.data;
        writeForAllChilds(root, ancestor, matrix);
        if(root.left!=null){
            writeMatrix(root.left, matrix);
        }
        if(root.right!=null){
            writeMatrix(root.right, matrix);
        }
    }
    public void writeForAllChilds(Node root,int ancestor,int[][] matrix){
        if(root==null) return;
        if(root.left!=null){
            matrix[ancestor][root.left.data]=1;
            writeForAllChilds(root.left, ancestor, matrix);
        }
        if(root.right!=null){
            matrix[ancestor][root.right.data]=1;
            writeForAllChilds(root.right, ancestor, matrix);
        }
    }
}