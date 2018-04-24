public class MaxPriceCut{
    public static void main(String[] args) {
        int[] price = new int[] {1, 5, 8, 9, 10, 17, 17, 20};
        int n=price.length;
        System.out.println(cutRod(price,n));
    }
    public static int cutRod(int[] price , int n ){
        if(n<=0) return 0;
        int max_value = Integer.MIN_VALUE;
        for(int i=0;i<n;i++) max_value=Math.max(max_value,price[i]+cutRod(price,n-1-i));
        return max_value;
    }
}