import java.util.HashMap;
import java.util.Map;

public class EleMoreThanNK{
    public static void main(String[] args) {
        int[] array = {3, 1, 2, 2, 1, 2, 3, 3};
        int k =4;
        findEles(array,k);
    }
    // public static void findEles(int[] array,int k) {
    //     int n = array.length;
    //     int bound = n/k;
    //     HashMap<Integer,Integer> map = new HashMap<>();
    //     for(int i=0;i<n;i++){
    //         if(map.containsKey(array[i])){
    //             int count = map.get(array[i]);
    //             ++count;
    //             map.put(array[i],count);
    //         }else{
    //             map.put(array[i],1);
    //         }
    //     }
    //     for(Map.Entry<Integer,Integer> entry : map.entrySet()){
    //         if(entry.getValue()>bound){
    //             System.out.print(entry.getKey()+" ");
    //         }
    //     }
    // }
    
}
