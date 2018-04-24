import java.util.Arrays;

public class MergeSort{
    public static void main(String[] args) {
        int[] array={-1, 2, -3, 4, 5, 6, -7, 8, 9};
        MergeSortFn(array);
        System.out.println(Arrays.toString(array));
    }
    public static void MergeSortFn(int[] array) {
        if(array.length<2) return;
        int mid = array.length/2;
        int[] left = new int[mid];
        int[] right = new int[array.length-mid];
        for(int i=0;i<mid;i++){
            left[i]=array[i];
        }
        for(int i=mid;i<array.length;i++){
            right[i-mid]=array[i];
        }
        MergeSortFn(left);
        MergeSortFn(right);
        Merge(array,left,right);
    }
    public static void Merge(int[] array,int[] left,int[] right) {
        int i=0,j=0,k=0;
        while(i<left.length && j<right.length){
            if(left[i]<right[j]){
                array[k]=left[i];
                ++i;++k;
            }else{
                array[k]=right[j];
                ++j;++k;
            }
        }
        while(i<left.length){
            array[k]=left[i];
            ++i;++k;
        }
        while(j<right.length){
            array[k]=right[j];
            ++j;++k;
        }
    }
}