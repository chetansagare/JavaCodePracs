public class CountCharsWithSameIndex{
    public static void main(String[] args) {
        String str ="AbgdeF";
        System.out.println(findCount(str));   
    }
    public static int findCount(String str){
        int count=0;
        for(int i =0;i<str.length();i++){
            if(str.charAt(i)-'A'==i || str.charAt(i)-'a'==i){
                ++count;
            }
        }
        return count;
    }
}