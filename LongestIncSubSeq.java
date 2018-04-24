public class LongestIncSubSeq{
    public static void main(String[] args) {
        int[] array = {7,2,8,6,3,1};
        LongestSubSeq(array);
    }
    public static void LongestSubSeq(int[] array) {
        int count =1;
        int[] subseq = new int[array.length];
        int j =0;
        boolean start = true;
        for(int i=1;i<array.length;i++){
            if(array[i]>array[i-1]){
                if(start){
                    subseq[j]=array[i-1];
                    ++j;
                    start=false;
                }
                ++count;
                subseq[j]=array[i];
                ++j;
            }
        }
        System.out.println(count);
        for(int k =0;k<j;k++)
        System.out.print(subseq[k]+" ");
    }
}