import java.util.Arrays;
import java.util.HashMap;

public class CompareBTrees{
    public static void main(String[] args) {
        int[] aTree={8, 3, 6, 1, 4, 7, 10, 14, 13};
        int[] bTree={8, 10, 14, 3, 6, 4, 1, 7, 13};
        System.out.println(Arrays.toString(aTree));
        System.out.println(Arrays.toString(bTree));
        System.out.println(compare(aTree,bTree));
    }
    static boolean compare(int[] aTree, int[] bTree){
        int[] aInOrder=getInOrderTraversal(aTree);
        int[] bInOrder=getInOrderTraversal(bTree);
        System.out.println(Arrays.toString(aInOrder));
        System.out.println(Arrays.toString(bInOrder));
        return true;
    }
    static int[] getInOrderTraversal(int[] tree){
        int n=tree.length;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(tree[i],i);
        }
        int[] temp=new int[n];
        temp[0]=tree[0];
        tree[0]=-1;
        int i=1;
        int count=0;
        while(count<n){
            int j=map.get(temp[count])+1;
            while(j<n){
                if(tree[j]<=temp[count] && tree[j]!=-1){
                    temp[i]=tree[j];
                    tree[j]=-1;
                    ++i;
                    break;
                }
                ++j;
            }
            j=map.get(temp[count])+1;
            while(j<n){
                if(tree[j]>temp[count] && tree[j]!=-1){
                    temp[i]=tree[j];
                    tree[j]=-1;
                    ++i;
                    break;
                }
                ++j;
            }
            ++count;
        }
        return temp;
    }
}