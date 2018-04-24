import java.util.Arrays;
import java.util.HashMap;

public class RemoveElements{
    public static void main(String[] args) {
        int[] nums={1,2,2,3,1,4,2};
        int val=3;
        System.out.println(findShortestSubArray(nums));

    }
    public static int removeElement(int[] nums, int val) {
        if(nums.length<=1){}
        int n=nums.length;
        int lastIndex=n-1;

        for(int i=0;i<n;i++){
            if(i>=lastIndex || lastIndex<0) break;
            while(nums[lastIndex]==val){
                --lastIndex;
            }             
            if(nums[i]==val){
                swap(nums,i,lastIndex);
                --lastIndex;
            }     
        }
        int i=0;
        while(nums[i]!=val){
           ++i;
        }
        return i;
    }
    public static void swap(int[] array,int i,int j){
        int temp=array[i];
        array[i]=array[j];
        array[j]=temp;
    }
    public static int findShortestSubArray(int[] nums) {
        int n=nums.length;
        HashMap<Integer,int[]> map=new HashMap<>();
        for(int i=0;i<n;i++){
            if(map.containsKey(nums[i])){
                int[] array=map.get(nums[i]);
                ++array[0];
                array[2]=i;
            }else{
                int[] array=new int[3];
                array[0]=1;
                array[1]=i;
                array[2]=i;
                map.put(nums[i],array);
            }
        }
        int max=0;
        int output=0;
        int minoutput=Integer.MAX_VALUE;
        for(Integer key:map.keySet()){
            int[] array=map.get(key);
            if(array[0]>=max){
                System.out.println(key);
                System.out.println(Arrays.toString(array));
                max=array[0];
                output=(1+array[2]-array[1]);
                if(output<minoutput){
                    minoutput=output;
                }
            }
        }
        return minoutput;
    }
}