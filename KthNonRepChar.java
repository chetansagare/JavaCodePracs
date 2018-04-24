import java.util.ArrayList;
import java.util.HashMap;

public class KthNonRepChar{
    public static void main(String[] args) {
        String str = "geeksforgeeks";
        int k=3;
        System.out.println(findKthNonRepChar(str,k));
        
    }
    public static char findKthNonRepChar(String str,int k) {
        if(k>str.length()) return ' '; // check if size of string is greater than k
        String dataString = ""; //check repeating occurances of characters
        String finalString =""; //finalString of non repeating character in order
        for(int i=0;i<str.length();i++){
            char c= str.charAt(i);
            String dummy = ""+c;
            if(!dataString.contains(dummy)){
                dataString=dataString+c; // dataString consists only one copy of all repeating n nonrepeating characters
                finalString=finalString+c;
            }else{
                // here we remove repeating characters from finalString
                if(finalString.contains(dummy)){
                    int index= finalString.indexOf(c);
                    finalString=finalString.substring(0,index)+finalString.substring(index+1);                   
                }
            }
        }
        if(finalString.length()>=k){
            return finalString.charAt(k-1);
        }else return ' ';
    }
}
// public static char findKthNonRepChar(String str,int k) {
    //     HashMap<Character,Integer> map = new HashMap<>();
    //     ArrayList<Character> chars = new ArrayList<>();
    //     for(int i=0;i<str.length();i++){
    //         char c = str.charAt(i);
    //         if(map.containsKey(c)){
    //             chars.set(map.get(c),'_');
    //         }else{
    //             map.put(c,i);
    //             chars.add(c);
    //         } 
    //     }
    //     String chaString ="";
    //     for(int i = 0;i<chars.size();i++){
    //         if(chars.get(i)!='_'){
    //             chaString=chaString+chars.get(i);
    //         }
    //     }
    //     return chaString.charAt(k-1);
    // }