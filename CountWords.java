

public class CountWords{
    public static int word=0;
    public static void main(String[] args) {
        String sentence = "One two         three\n    four\tfive  ";
        System.out.println(count(sentence));
    }
    public static int count(String sentence) {
       int count=0;
        for(int i=0;i<sentence.length();i++){
            if(sentence.charAt(i)==' ' || sentence.charAt(i)=='\n' || sentence.charAt(i)=='\t'){
                if(word==1){
                    ++count;
                    word=0;
                }
            }else word=1;
        }
        return count;
    }
}