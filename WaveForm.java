//O(n) time and no extra space same as given in GeeksForGeeks
import java.util.Arrays;

public class WaveForm{
    public static void main(String[] args) {
        int[] array = {20, 10, 8, 6, 4, 2};
        int n = array.length;
         for(int i =0;i<n;i+=2){
             if(i>0 && array[i-1]>array[i]) swap(array,i-1,i);
             if(i<n-1 && array[i+1]>array[i]) swap(array,i+1,i);
         }
        System.out.println(Arrays.toString(array));
    }
    public static void swap(int[] array,int a,int b){
        int temp = array[a];
        array[a]=array[b];
        array[b] = temp;
    }
}