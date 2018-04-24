 //import for Scanner and other utility classes
 import java.util.*;
 

class MaxFreqChar {
    public static void main(String args[] ) throws Exception {
        
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        int freq,maxFreq = 0;
        char currChar,maxFreqChar;
        maxFreqChar = str.charAt(0);
        
        HashMap<Character,Integer> map = new HashMap<>();
        
        for(int i =0;i<str.length();i++){
            
            currChar = str.charAt(i);
            
            if(!map.containsKey(currChar)){
                freq = 1;
                map.put(currChar,freq);
            }else{
                freq = map.get(currChar);
                ++freq;
                map.put(currChar,freq);
            }
            if(freq>maxFreq){
                maxFreq = freq;
                maxFreqChar = currChar;
            }
            if(freq==maxFreq){
                if(currChar<maxFreqChar){
                    maxFreqChar = currChar;
                }
            }
        }
        
        System.out.println(maxFreqChar+" "+maxFreq);
    }
}
