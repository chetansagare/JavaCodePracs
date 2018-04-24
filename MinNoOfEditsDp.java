public class MinNoOfEditsDp{
    public static void main(String[] args) {
        String str1="geeks";
        String str2="gesek";
        int m = str1.length();
        int n = str2.length();

        int[][] table = new int[m+1][n+1];

        for(int i=0;i<=m;i++){
            for(int j=0;j<=n;j++){
                if(i==0) table[i][j]=j;
                else if(j==0) table[i][j]=i;
                else if(str1.charAt(i-1)==str2.charAt(j-1)) table[i][j]=table[i-1][j-1];
                else table[i][j]=1+Math.min(table[i-1][j],Math.min(table[i][j-1],table[i-1][j-1]));
            }
        }
        System.out.println(table[m][n]);
    }
}