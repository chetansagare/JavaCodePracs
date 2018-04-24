import java.util.Arrays;
import java.util.HashSet;

public class SubStringWithDistChars{
    public static void main(String[] args) {
        String str = "abcbaa";
        int k=3;
        System.out.println(findSubStrings(str,k));
    }
    public static int findSubStrings(String str, int k){
        if(k>str.length()) return 0;
        int[] countArray = new int[26];
        int distCount =0;
        int tempCount =0;
        for(int i=0;i<str.length();i++){
            Arrays.fill(countArray,0);
            tempCount=0;
            for(int j=i;j<str.length();j++){
                if(countArray[str.charAt(j)-'a']==0) ++tempCount;
                ++countArray[str.charAt(j)-'a'];
                if(tempCount==k) ++distCount;
            }
        }
        return distCount;
    }
    // public static int getDistCount(String temp) {
    //     HashSet<Character> set = new HashSet<>();
    //     for(int i=0;i<temp.length();i++){
    //         set.add(temp.charAt(i));
    //     }
    //     return set.size();
    // }
}