import java.util.ArrayList;
import java.util.HashMap;

public class ZeroSumSubArray{
    int[][] record = new int[11][11];
    public static void main(String[] args) {
        int[] array={6, 3, -1, -3, 4, -2, 2,4, 6, -12, -7};
        int sum =0; 
        ArrayList<Integer> indexList;
        HashMap<Integer,ArrayList<Integer>> map = new HashMap<>();

        for(int i=0;i<array.length;i++){
            sum=sum+array[i];
            if(!map.containsKey(sum)){
                indexList = new ArrayList<Integer>();
                indexList.add(i);
                map.put(sum,indexList);
            }else{
                for(int j=0;j<map.get(sum).size();j++){
                    int s = map.get(sum).get(j);
                    ++s;
                    System.out.println("Sub Array found from index "+s+" to "+ i);
                }
                map.get(sum).add(i);
            }
        }
        for(int k=0;k<map.get(0).size();k++){
            System.out.println("Sub Array found from index "+0+" to "+ map.get(0).get(k));
        }
    }
}