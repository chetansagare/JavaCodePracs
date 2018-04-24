import java.util.*;

public class SortAbsDiff{
    public static void main(String[] args) {
        int[] a={10, 5, 3, 9, 2};
        int n = a.length;
        ArrayList<Integer> diffList = new ArrayList<>();
        int x = 7,temp=0;
        HashMap<Integer,ArrayList<Integer>> map = new HashMap<>();
        for(int i=0;i<n;i++){
         temp=Math.abs(x-a[i]);
         if(map.containsKey(temp)) map.get(temp).add(a[i]);
         else{
             ArrayList<Integer> list = new ArrayList<>();
             list.add(a[i]);
             diffList.add(temp);
            map.put(temp,list);
         }
        }
       Collections.sort(diffList);
        for(int i=0;i<diffList.size();i++){
            System.out.print(map.get(diffList.get(i)).toString());
        }
    }
}