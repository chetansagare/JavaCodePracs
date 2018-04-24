import java.util.*;

class node
{
    int data;
    node left,right;
    public node(int data)
    {
        this.data = data;
        left = right = null;
    }
}

public class bin_tree
{
    
    static node root ;
    static int pathlen=0;
    static int[] path = new int[50];
    static int max;
    static node res;
     
     
    static void inorder(node root)
    {
        if(root ==null) return;
        if(root.left!=null) inorder(root.left);
        path[pathlen] = root.data;
        ++pathlen;
        if(root.right!=null)inorder(root.right);
    }
    
    static boolean check(node root)
    {
        pathlen=0;
        inorder(root); 
        
        for(int i=0;i<pathlen-1;i++)
        {
         if(path[i]>path[i+1])
         return false;
        }
        return true;
    }
    
    
    static int sizetree(node root)
    {
        if(root==null)
        return 0;
        return 1+ sizetree(root.left)+sizetree(root.right);
        
    }
    
    
    static int lb(node root)
    {
      if(root == null)
      return 0;
      
      if(check(root)){
          return sizetree(root);
      }else{
          return Math.max(lb(root.left),lb(root.right));
      }
    }
    public static void main(String[] args)
    {
        
        bin_tree tree = new bin_tree();
        tree.root = new node(50);
        tree.root.left = new node(30);
        tree.root.right = new node(60);
        tree.root.left.left = new node(5);
        tree.root.left.right = new node(20);
        tree.root.right.left = new node(45);
        tree.root.right.right = new node(70);
        tree.root.right.right.left = new node(65);
        tree.root.right.right.right = new node(80);
        // int p = tree.sizetree(root);
        // System.out.println(p);
        System.out.println(tree.lb(root));
    }
}