import java.util.*;

public class RandomShuffle{
    public static void main(String[] args) {
        int[] array={1, 2, 3, 4, 5, 6, 7, 8};
        int n=array.length;

        Random random=new Random();

        for(int k=0;k<20;k++){
            for(int i=n-1;i>0;i--){
                int j=random.nextInt(i);
                swap(array, i, j);
           }
           System.out.println(Arrays.toString(array));
        }
        
    }
    static void swap(int[] array,int a,int b){
        int temp=array[a];
        array[a]=array[b];
        array[b]=temp;
    }
}