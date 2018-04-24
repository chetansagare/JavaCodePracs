public class ConstructBstPreOrderTraversal{
    public static void main(String[] args) {
        int[] array={10, 5, 1, 7, 40, 50};

        BinaryTree btree=new BinaryTree();
        btree.root=new Node(array[0]);
        for(int i=1;i<array.length;i++){
            btree.addNode(btree.root,array[i]);
        }
        btree.inOrderPrint(btree.root);
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
    protected void addNode(Node root,int data){
        if(root==null) return;
        if(data<=root.data){
            if(root.left==null){
                Node node = new Node(data);
                root.left=node;
                return;
            }else addNode(root.left,data);
        }else {
            if(root.right==null){
                Node node = new Node(data);
                root.right=node;
                return;
            }else addNode(root.right, data);
        } 
    }
    protected void inOrderPrint(Node root){
        if(root==null) return;
        inOrderPrint(root.left);
        System.out.println(root.data);
        inOrderPrint(root.right);
    }
}