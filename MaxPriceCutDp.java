public class MaxPriceCutDp{
    public static void main(String[] args) {
        int [] price = new int[]{1, 5, 8, 9, 10, 17, 17, 20};
        int n = price.length;
        System.out.println(maxcut(price,n));
        
    }
    public static int maxcut(int[] price, int n){
        int[] value = new int[n+1];
        value[0] =0;

        for(int i=0;i<=n;i++){
            int max = Integer.MIN_VALUE;
         for(int j =0;j<i;j++){
            max = Math.max(max,price[j]+value[i-j-1]);
            value[i]=max;
            }
        }
        return value[n];
    }
}