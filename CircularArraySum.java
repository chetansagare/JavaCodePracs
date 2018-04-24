public class CircularArraySum{
    public static void main(String[] args) {
        int[] array ={-1, 40, -14, 7, 6, 5, -4, -1};
        int n=array.length;
        int arraySum =0;
        int[] revArray = new int[n];
        for(int i=0;i<n;i++) {
            revArray[i]=-array[i];
            arraySum = arraySum+array[i];
        }
        int maxRevSum=findSum(revArray,n);
        System.out.println(arraySum+maxRevSum);
    }
    public static int findSum(int[] rev,int n){
        int sum=0,maxSum=0;
        for(int i=0;i<n;i++){
            sum=sum+rev[i];
            if(sum<0) sum=0;
            else if(sum>maxSum) maxSum=sum;
        }
        return maxSum;
    }
}