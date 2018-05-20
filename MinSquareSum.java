import java.util.Arrays;

public class MinSquareSum{
    public static void main(String[] args) {
        String s = "aaab";
		System.out.println(getMinSquareSum(s,2));
    }
    static int getMinSquareSum(String s,int k){
        int res=0;
        int[] array=new int[26];
        int len=s.length();
        char[] c=s.toCharArray();
        for(int i=0;i<len;i++){
            ++array[c[i]-'a'];
        }

        for(int i=array.length-1;i>=0;i--){
            if(k==0) break;
            if(k>0 && array[i]>k){
                array[i]=array[i]-k;
                k=0;
            }else if(k>0 && array[i]>0){
                k=k-array[i];
                array[i]=0;
            }
        }
        for(int i=array.length-1;i>=0;i--){
            if(array[i]>0) res=res+array[i]*array[i];
        }
        return res;
    }
}