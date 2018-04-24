import java.util.Arrays;

public class SegregateArray{
    public static void main(String[] args) {
        int array[] = new int[]{0, 1, 0, 1, 1, 1};
        segregate(array);
        System.out.println(Arrays.toString(array));
    }
    private static void segregate(int[] array) {
        int index=0;
        for(int i=0;i<array.length;i++){
            if(array[i]==0){
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