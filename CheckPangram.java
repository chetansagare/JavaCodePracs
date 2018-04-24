public class CheckPangram{
    public static void main(String[] args) {
        String str = "The quick brown fox jumps over the dog";
        int count = 0;
        char c ='a';
        for(int i=0;i<26;i++){
            if(str.contains(Character.toString(c))){
                ++count;
            }
            ++c;
        }
        if(count==26) System.out.println(true);
        else System.out.println(false);
    }
}