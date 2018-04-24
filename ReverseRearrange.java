import java.util.*;

public class ReverseRearrange{
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7};
        int d=2;
        rearrange(array,d);
    }
    private static void rearrange(int[] array, int d) {
        reverse(array, 0, d-1);
        reverse(array, d, array.length-1);
        reverse(array, 0, array.length-1);
        System.out.println(Arrays.toString(array));
    }
    private static void reverse(int[] array,int start,int end){
        while(start<end){
            swap(array,start,end);
            ++start;
            --end;
        }
    }
    private static void swap(int[] array,int a,int b) {
        int temp=array[a];
        array[a]=array[b];
        array[b]=temp;
    }
}