public class DecryptedString{
    public static void main(String[] args) {
       String str = "ab4c12ed3";
       int k = 21;
       System.out.println(findChar(str,k));
    }
    public static char findChar(String str, int k){
        String finalString="",repString="";
        String numString="";
        for(int i=0;i<str.length();i++){
            char c= str.charAt(i);
            if(c<='z' && c>='a'){
                finalString=finalString+c;
                repString=repString+c;
            }else if(c<='9' && c>='1'){
                numString="";
                while(i< str.length() && str.charAt(i)>='1' && str.charAt(i)<='9'){
                    numString=numString+str.charAt(i);
                    ++i;
                }
                --i;
                int multiplier = Integer.parseInt(numString);
                for(int j=0;j<multiplier-1;j++){
                    finalString=finalString+repString;
                }
                repString="";
            
            }
        }
        System.out.println(finalString);
        return finalString.charAt(k-1);
    }
}