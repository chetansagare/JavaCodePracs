import java.util.Arrays;

public class RearrangeArrayExtraSpace{
    public static void main(String[] args) {
        int[] array={1, 2, 3, 4, 5, 6, 7};
        rearrange(array);
    }
    private static void rearrange(int[] array) {
        int[] temp=new int[array.length];
        int start=0,end=array.length-1;
        for(int i=0;i<array.length;i++){
            if(i%2==0){
                temp[i]=array[end];
                --end;
            }else{
                temp[i]=array[start];
                ++start;
            }
        }
        System.out.println(Arrays.toString(temp));
    }
}