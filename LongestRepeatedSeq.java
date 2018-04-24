public class LongestRepeatedSeq{
  public static void main(String[] args) {
    String s = "AABEBDD";
    System.out.println(lcr(s));
  }
  public static String lcr(String s){
    int n = s.length();
    int[][] dp = new int[n+1][n+1];
    String res = "";

    for(int i=1;i<=n;i++){
      for(int j=1;j<=n;j++){
        if(s.charAt(i-1)==s.charAt(j-1) && i!=j) {
          dp[i][j]=1+dp[i-1][j-1];
        } else{
          dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
        }
      }
    }
    int i=n;int j=n;
    while(i>0 && j>0){
      if(dp[i][j]==(dp[i-1][j-1]+1)){
        res=res+s.charAt(i-1);
        --i;--j;
      }else if(dp[i][j]==dp[i-1][j]) --i;
      else --j;
    }
    String rep="";
    for(i=0;i<res.length();i++)
    rep=rep+res.charAt(res.length()-1-i);

    return rep;
  }
}
