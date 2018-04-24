public class KAnagram{
    static int[] str1 = new int[26];
    static int[] str2 = new int[26];
    public static void main(String[] args) {
        String s1 = "geeks";
        String s2 = "eggkf";
        int k =1;
        System.out.println(check(s1,s2,k));
    }
    public static boolean check(String s1,String s2,int k) {
        if(s1.length()!=s2.length()) return false;
        for(int i=0;i<s1.length();i++){
            ++str1[s1.charAt(i)-'a'];
            ++str2[s2.charAt(i)-'a'];
        }
        for(int i=0;i<26;i++){
            if(str1[i]==str2[i]){
                str1[i]=0;
            }
            else{
                str1[i]=str1[i]-str2[i];
            }
        }
        int sum=0;
        for(int i=0;i<26;i++){
            if(str1[i]>0){
                sum=sum+str1[i];
            }
        }
        System.out.println(sum);
        if(sum<k) return true;
        else return false;
    }
}