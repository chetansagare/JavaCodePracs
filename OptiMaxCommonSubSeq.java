public class OptiMaxCommonSubSeq{

    public static void main(String[] args) {
        String s1 = "AGGTAB";
        String s2 = "GXTXAYB";

        char[] x = s1.toCharArray();
        char[] y = s2.toCharArray();

        int m = x.length;
        int n = y.length;

        System.out.println(lcs(x,y,m,n));
    }

    public static int lcs(char[] x,char[] y,int m,int n){

        int[][] table = new int[m+1][n+1];
        for(int i=0;i<=m;i++){
            for(int j=0;j<=n;j++){
                if(i==0 || j==0) table[i][j]=0;
                else if(x[i-1]==y[j-1]) table[i][j]=1+table[i-1][j-1];
                else table[i][j]=max(table[i-1][j],table[i][j-1]);
            }
        }
        return table[m][n];
    }
    static int max(int a,int b){
        if(a>b) return a;
        else return b;
    }
}