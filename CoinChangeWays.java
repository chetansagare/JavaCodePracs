public class CoinChangeWays{
    public static void main(String[] args) {
        int n = 10;
        int[] s = {2,5,3,6};
        System.out.println(findWays(s,n,s.length));
        
    }
    public static int findWays(int[] s, int n, int c) {
        if(n<0) return 0;
        if(n==0) return 1;
        if(c<=0 && n>=1) return 0;
        return findWays(s, n, c-1) + findWays(s, n-s[c-1], c);
    }
}