public class MinFlips{
    public static void main(String[] args) {
        String str = "010101100011";
        int zeroSeq=0,oneSeq=0;
        for(int i=0;i<str.length()-1;i++){
            if(str.charAt(i)=='0' && str.charAt(i+1)=='1'){
                ++zeroSeq;
            }else if(str.charAt(i)=='1' && str.charAt(i+1)=='0'){
                ++oneSeq;
            }
        }
        if(str.charAt(str.length()-1)=='0') ++zeroSeq;
        if(str.charAt(str.length()-1)=='1') ++oneSeq;

        int min=(zeroSeq>oneSeq)?oneSeq:zeroSeq;
        System.out.println(min);
    }
}