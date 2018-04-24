import java.util.Arrays;

public class RearrangeWithoutExtraSpace{
    public static void main(String[] args) {
        int[] array={1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println("Original Array : "+Arrays.toString(array));
        rearrange(array);
        System.out.println("After Modifying : "+Arrays.toString(array));
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