import java.util.Arrays;

public class RearrangeArray{
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7};
        int d=2;
        rearrange(array,d);
    }
    private static void rearrange(int[] array, int d) {
        int[] temp = new int[d];
        for(int i=0;i<d;i++){
            temp[i]=array[i];
        }
        for(int i=d;i<array.length;i++){
            array[i-d]=array[i];
        }
        for(int i=0;i<d;i++){
            array[i+array.length-d]=temp[i];
        }
        System.out.println(Arrays.toString(array));
    }
}