import java.util.Arrays;

public class AlternateSorting{
    public static void main(String[] args) {
        int[] array= {7, 1, 2, 3, 4, 5, 6};
        alternateSort(array);
    }
    private static void alternateSort(int[] array) {
        int start=0,end=array.length-1;
        Arrays.sort(array);
        while(start<=end){
            if(start==end){
                System.out.print(array[end]+" ");
                break;
            }
            System.out.print(array[end]+" ");
            System.out.print(array[start]+" ");
            --end;
            ++start;
        }
    }
}