import java.util.*;

public class ArrayDivision{
    public static void main(String[] args) {
        int k = 6;
        int[] array = {9, 7, 5, 3};
        
        System.out.println(check(array,k));
    }

    public static boolean check(int[] array, int k){
        int n = array.length;
        if(n%2!=0){
            return false;
        }
        HashMap<Integer,Integer> map = new HashMap<>();
        int rem;
        for (int i=0;i<n;i++) {
            rem = array[i]%k;
            if(!map.containsKey(rem))
            {
                map.put(rem,0);
            }
            map.put(rem,map.get(rem)+1);
        }
        if(map.containsKey(0) && map.get(0)%2!=0){
            return false;
        }
        for(int i=1;i<=k/2;i++){
            if(map.containsKey(i)){
                if(map.get(i)!=map.get(k-i)) return false;
            }
        }
        return true;
    } 
}