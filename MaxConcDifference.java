import java.util.*;
public class MaxConcDifference{
    public static void main(String[] args) {
        int[] array={ 4, 2, 1, 8 };
        System.out.println(getDifference(array));
    }
    private static int getDifference(int[] array) {
        Arrays.sort(array); //O(nlogn)
        rearrange(array);
        int temp=array[0];
        for(int i=0;i<array.length-1;i++){
            array[i]=Math.abs(array[i+1]-array[i]);
        }
        array[array.length-1]=Math.abs(array[array.length-1]-temp);
        int sum=0;
        for(int i=0;i<array.length;i++){
            sum=sum+array[i];
        }
        return sum;
    }
    private static void rearrange(int[] array) {
        int max_index=array.length-1,min_index=0,max_element=array[max_index]+1;
        for(int i=0;i<array.length;i++){
            if(i%2==0){
                array[i]=array[i]+(array[max_index]%max_element)*max_element;
                --max_index;
            }else{
                array[i]=array[i]+(array[min_index]%max_element)*max_element;
                ++min_index;
            }
        }
        for(int i =0;i<array.length;i++){
            array[i]=array[i]/max_element;
        }
    }
}