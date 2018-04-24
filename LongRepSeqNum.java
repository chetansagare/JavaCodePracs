public class LongRepSeqNum{
	public static void main(String[] args) {
		 String s1 = "AABEBDD";
		 System.out.println(lrs(s1));
		 
	}
	static int lrs(String s1){
		int n = s1.length();
		int[][] dp = new int[n+1][n+1];
		String res="";

		for(int i=1;i<=n;i++){
			for(int j=1;j<=n;j++){
				if(s1.charAt(i-1)==s1.charAt(j-1) && i!=j){
					dp[i][j]=1+dp[i-1][j-1];
					res=res+s1.charAt(i-1);
				}
				else
				 dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
			}
		}
		System.out.println(res);
		return dp[n][n];
	}
}