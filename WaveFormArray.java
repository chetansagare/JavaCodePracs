// This is a O(nLogn) implementation
import java.util.*;

public class WaveFormArray{
    public static void main(String[] args) {
        int[] array={10, 5, 6, 3, 2, 20, 100, 80};
        int n=array.length;
        Arrays.sort(array);
        int[] waveArray = new int[n];
        int start = 0,end=n-1;
        for(int i=0;i<n;i++){
            if(i%2==0){
                waveArray[i]=array[end];
                --end;
            }else{
                waveArray[i]=array[start];
                ++start;
            }
        }

        System.out.println(Arrays.toString(waveArray));
    }
}