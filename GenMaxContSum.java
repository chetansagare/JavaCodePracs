public class GenMaxContSum{
    public static void main(String[] args) {
        int[] array = {-2, -3, 4, -1, -2, 1, 5, -3};
        System.out.println(maxSum(array));      
    }
    public static int maxSum(int[] array) {
        int n = array.length;
        int sum =array[0];
        int Max=array[0];
        for(int i =0;i<n;i++){
            sum=Math.max(array[i],sum+array[i]);
            Max=Math.max(sum,Max);
        }
        return Max;
    }
}