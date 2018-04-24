public class MaxCommonSeq{
    public static void main(String[] args) {
        String s1 = "AGGTAB";
        String s2 = "GXTXAYB";

        char[] x = s1.toCharArray();
        char[] y = s2.toCharArray();

        int m = x.length;
        int n = y.length;

        System.out.println(lcs(x,y,m,n));

    }
    public static int lcs(char[] x,char[] y,int m ,int n) {
        if(m==0 || n==0) return 0;
        else if(x[m-1]==y[n-1]) return (1+lcs(x,y,m-1,n-1));
        else return max(lcs(x,y,m-1,n),lcs(x,y,m,n-1));
    }

    static int max(int a,int b){
        if(a>b) return a;
        else return b;
    }
}