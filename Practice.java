import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Practice{
    public static void main(String[] args) {
       String str = "this is a test string";
       String test="tist";
       findMinWindow(str,test); 
    }
    public static String findMinWindow(String str, String test) {
        ArrayList<Character> charList = new ArrayList<>();
        ArrayList<Integer> indexList = new ArrayList<>();
    
        boolean start=false;
        HashMap<Character,Integer> setMap = new HashMap<>();
        for(int i =0;i<test.length();i++){
            char testChar = test.charAt(i);
            if(setMap.containsKey(testChar)){
                int count = setMap.get(testChar);
                ++count;
                setMap.put(testChar, count);
            }else setMap.put(testChar,1);
        }

        for(int i =0;i<str.length();i++){
            if(setMap.containsKey(str.charAt(i))){
                charList.add(str.charAt(i));
                indexList.add(i);
            }
        }
        int startIndex = 0;
        int endIndex =0;
        HashMap<Character,Integer> strMap = new HashMap<>();
        
        while(true){
            if(endIndex>=charList.size()) break;

            char c = charList.get(endIndex);

            if(strMap.get(c)<setMap.get(c)){
            if(strMap.containsKey(c)){
                int count = strMap.get(c);
                ++count;
                strMap.put(c, count);
                ++endIndex;
            }else{ 
                strMap.put(c,1);
                ++endIndex;
            }
        }
            if(strMap.get(charList.get(startIndex))>setMap.get(charList.get(startIndex))){

            }
        }
        return str;
    }
}