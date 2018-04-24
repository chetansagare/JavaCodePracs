public class JavaTrees{
    public static void main(String[] args) {
        
    }

    void decode(String S ,Node root){
        String code="";
        if(root==null) return;
        Node temp=root;
        int index=0;
        while(index<S.length()){
            if(temp.left==null && temp.right==null){
                code=code+temp.data;
                temp=root;
            }
            else if(S.charAt(index)=='0'){
                temp=temp.left;
                ++index;
            }else if(S.charAt(index)=='1'){
                temp=temp.right;
                ++index;
            }
        }       
    }
}
class Node{
    public  int frequency; // the frequency of this tree
    public  char data;
    public  Node left, right;
}
