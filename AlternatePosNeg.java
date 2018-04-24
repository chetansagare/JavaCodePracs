import java.io.FileReader;
import java.util.Arrays;

public class AlternatePosNeg{
    public static void main(String[] args) {
        int[] array={-1, 2, -3, 4, 5, 6, -7, 8, 9};
        Sort(array);
        System.out.println(Arrays.toString(array));
    }
    private static void Sort(int[] array) {
        int pivot = 0;
        int j=0;
        int i=0;
        for(i=0;i<array.length;i++){
            if(array[i]<pivot){
                swap(array,i,j);
                ++j;
            }
        }
        //System.out.println(i);
        int pos=j,neg=0;
        while(neg<i && pos<array.length){
            swap(array,neg, pos);
            neg+=2;
            ++pos;
        }        
    }
    private static void swap(int[] array,int i,int j) {
        int temp = array[i];
        array[i]=array[j];
        array[j]=temp;
    }
}