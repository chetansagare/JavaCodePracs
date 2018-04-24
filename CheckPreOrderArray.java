import java.util.Stack;

public class CheckPreOrderArray{

    public static void main(String[] args) {
        // int[] array={5,4,3,6,8,7,9};
        int[] array={40, 30, 35, 80, 100};
        int n=array.length;
        System.out.println(checkPreOrder(array,0,n-1));
        System.out.println(checkPreOrderOn(array,n));
    }
    public static boolean checkPreOrder(int[] array,int start,int end){
        if(start>=end) return true;
        boolean startFlag=false;
        boolean entryFlag=true;
        int ref=start+1;
        for(int i=start+1;i<=end;i++){
            if(entryFlag && array[i]>array[start]){
                startFlag=true;
                ref=i;
                entryFlag=false;
            }
            if(startFlag){
                if(array[i]<=array[start]){
                    return false;
                }
            }
        }
        return checkPreOrder(array, start,ref-1) && checkPreOrder(array,ref, end);
    }
    public static boolean checkPreOrderOn(int[] array,int n) {
        Stack<Integer> stack=new Stack<>();
        int root=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(array[i]<root) return false;
            while(!stack.empty() && stack.peek()<array[i]){
                root=stack.peek();
                stack.pop();
            }
            stack.push(array[i]);
        }
        return true;
    }
}