import java.util.Arrays;

public class ReverseArray{
    public static void main(String[] args) {
        int[] array={-1, 2, -3, 4, 5, 6, -7, 8, 9};
        System.out.println(Arrays.toString(array));
        Reverse(array);
        System.out.println(Arrays.toString(array));
    }
    private static void Reverse(int[] array) {
        int start =0,end=array.length-1;
        while(start<end){
            swap(array,start,end);
            ++start;
            --end;
        }
    }
    private static void swap(int[] array,int i,int j) {
        int temp = array[i];
        array[i]=array[j];
        array[j]=temp;
    }
}