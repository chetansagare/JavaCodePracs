public class SubSetSumDp{
    public static void main(String[] args) {
        int sum = 7;
        int[] subSet = {1,2,3};
        int n = subSet.length;
        System.out.println(checkSum(subSet,sum,n));
    }
    public static boolean checkSum(int[] set, int sum,int n){
        boolean[][] table = new boolean[sum+1][n+1];

        for(int i=1;i<=n;i++) table[0][i]=true;
        for(int i=1;i<=sum;i++) table[i][0]=false; 

        for(int i=1;i<=sum;i++){
            for(int j =1;j<=n;j++){
                table[i][j]=table[i][j-1];
                if(i>=set[j-1])
                table[i][j]= table[i][j] || table[i-set[j-1]][j-1];
            }
        }
         return table[sum][n];
    }
}