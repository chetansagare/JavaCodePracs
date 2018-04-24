import java.util.HashMap;

public class MaxOccuringChar{
    public static void main(String[] args) {
        String str = "test";
        int count,max=1;
        char maxOccChar='Z';
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<str.length();i++){
            if(map.containsKey(str.charAt(i))){
                count = map.get(str.charAt(i));
                ++count;
                map.put(str.charAt(i),count);
                if(count>max){
                    maxOccChar=str.charAt(i);
                    max=count;
                }
            }else{
                map.put(str.charAt(i),1);
            }
        }
        System.out.println(maxOccChar);
    }
}