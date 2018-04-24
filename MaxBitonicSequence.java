public class MaxBitonicSequence{
    public static void main(String[] args) {
        int[] array={12, 4, 78, 90, 45, 23};
        System.out.println(getMaxSeq(array));
    }
    private static int getMaxSeq(int[] array) {
        int incSeq=1,maxIncSeq=1,decSeq=1,maxDecSeq=1;
        for(int i=0;i<array.length-1;i++){
            if(array[i]<array[i+1]){
                ++incSeq;
            }else{
                incSeq=1;
            }
            if(maxIncSeq<incSeq) maxIncSeq=incSeq;
        }
        for(int i=array.length-1;i>0;i--){
            if(array[i]<array[i-1]){
                ++decSeq;
            }else{
                decSeq=1;
            }
            if(maxDecSeq<decSeq) maxDecSeq=decSeq;
        }
        return maxDecSeq+maxIncSeq-1;
    }
}