import java.util.*;

public class SecondMaxOccurance{
    public static void main(String[] args) {
        String str = "abcd";
        System.out.println(findSecondMaxOcc(str));
        
    }
    public static Character findSecondMaxOcc(String str) {
        HashMap<Character,Integer> setMap = new HashMap<>();
    
        for(int i =0;i<str.length();i++){
            char testChar = str.charAt(i);
            if(setMap.containsKey(testChar)){
                int count = setMap.get(testChar);
                ++count;
                setMap.put(testChar, count);
            }else setMap.put(testChar,1);   
        }
        char maxchar,smaxchar=' ';
        int max=Integer.MIN_VALUE,smax=Integer.MIN_VALUE;
        for(Character key : setMap.keySet()){
            Integer value = setMap.get(key);
            if(value>max){
                max=value;
                maxchar=key;
            }
            if(value>smax && value<max){
                smax=value;
                smaxchar=key;
            }
        }
        return smaxchar;
    }
}