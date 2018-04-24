import java.util.ArrayList;
import java.util.HashSet;

public class SmallSubString{
    public static void main(String args[]){
        String test = "This is a test string";
        String pattern = "tist";
        test = test.toLowerCase();
        pattern=pattern.toLowerCase();
        pattern.
        HashSet<Character> set = new HashSet<>();
        for(int i=0;i< pattern.length();i++){
            set.add(pattern.charAt(i));
            
        }
        ArrayList<Integer> data = new ArrayList<>();
        for(int i =0;i< test.length();i++){
            if(set.contains(test.charAt(i))){
                data.add(i);
            }
        }
    }
}