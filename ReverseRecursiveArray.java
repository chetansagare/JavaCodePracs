import java.util.Arrays;

public class ReverseRecursiveArray{
    public static void main(String[] args) {
        int[] array={-1, 2, -3, 4, 5, 6, -7, 8, 9};
        System.out.println(Arrays.toString(array));
        ReverseRecursive(array,0,array.length-1);
        System.out.println(Arrays.toString(array));
    }
    private static void ReverseRecursive(int[] array,int start,int end) {
        if(start>=end) return;
        swap(array,start,end);
        ReverseRecursive(array, ++start, --end);
    }
    private static void swap(int[] array,int i,int j) {
        int temp = array[i];
        array[i]=array[j];
        array[j]=temp;
    }
}