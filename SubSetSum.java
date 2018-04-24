public class SubSetSum{
    public static void main(String[] args) {
        int sum = 7;
        int[] subSet = {1,2,3};
        int n = subSet.length;
        System.out.println(checkSum(subSet,sum,n));
    }
    public static boolean checkSum(int[] set, int sum,int n){
        if(sum<0) return false;
        else if(sum==0) return true;
        else if(n<=0 && sum>=1) return false;
        else return checkSum(set, sum, n-1) || checkSum(set, sum-set[n-1], n-1);
    }
}