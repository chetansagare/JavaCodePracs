public class MinNoOfEdits{
    public static void main(String[] args) {
        String str1="geeks";
        String str2="gesek";
        System.out.println(findMinEdits(str1,str2,str1.length(),str2.length()));

    }
    public static int findMinEdits(String str1, String str2,int m,int n){
         if(m==0) return n;
         if(n==0) return m;
         if(str1.charAt(m-1)==str2.charAt(n-1)) return findMinEdits(str1, str2, m-1, n-1);
         else return 1+Math.min(findMinEdits(str1, str2, m-1, n),Math.min(findMinEdits(str1, str2, m, n-1),findMinEdits(str1, str2, m-1, n-1)));
    }
}