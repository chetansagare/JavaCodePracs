import java.util.Arrays;

public class SegregateEvenOdd{
    public static void main(String[] args) {
        int[] array={12, 34, 45, 9, 8, 90, 3};
        segregateArray(array);
        System.out.println(Arrays.toString(array));
    }
    private static void segregateArray(int[] array) {
        int index=0;
        for(int i=0;i<array.length;i++){
            if(array[i]%2==0){
                swap(array, i, index);
                ++index;
            }
        }
    }
    private static void swap(int[] array,int i,int j) {
        int temp = array[i];
        array[i]=array[j];
        array[j]=temp;
    }
}