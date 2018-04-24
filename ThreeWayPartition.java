import java.util.Arrays;

public class ThreeWayPartition{
    public static void main(String[] args) {
        int[] array={1, 14, 5, 20, 4, 2, 54, 20, 87, 98, 3, 1, 32};
        int low=10,high=20;
        partition(array,low,high);
        System.out.println(Arrays.toString(array));
    }
    private static void partition(int[] array,int low,int high) {
        int start=0,end=array.length-1;
        for(int i=0;i<end;){
            if(array[i]<low){
                swap(array, i, start);
                start++;
                i++;
            }else if(array[i]>high){
                swap(array, i, end);
                end--;
            }else {
                i++;
            }
        }
    }
    private static void swap(int[] array,int i,int j) {
        int temp = array[i];
        array[i]=array[j];
        array[j]=temp;
    }
}