import java.util.Arrays;

public class SeparatePosNeg{
    public static void main(String[] args) {
        int[] array = { -12, 11, -13, -5, 6, -7, 5, -3, -6 };
        Separate(array);
        System.out.println(Arrays.toString(array));
    }
    private static void Separate(int[] array) {
        int j =0;
        for(int i=0;i<array.length;i++){
            if(array[i]<0){
                swap(array, i, j);
                ++j;
            }
        }
    }
    private static void swap(int[] array,int i,int j) {
        int temp = array[i];
        array[i]=array[j];
        array[j]=temp;
    }
}