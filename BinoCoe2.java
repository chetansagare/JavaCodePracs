public class BinoCoe2{
    static int[][] bino ;
    public static void main(String[] args) {
        int n=10,k=2;
        bino = new int[n+1][k+1];
        System.out.println(findCoe(n,k));
    }
    public static int findCoe(int n, int k) {
        if(k>n || k<0) return 0;
        if(k==n || n==1 || k==0) return 1;
        if(bino[n][k]!=0) return bino[n][k];
        bino[n][k]=findCoe(n-1, k)+findCoe(n-1, k-1);
        return bino[n][k];
    }
}