import java.util.*;

public class MinSumPrieQue{
    public static void main(String[] args) {
        String s="abbccc";
        int k=2;
        System.out.println(getRes(s,k));
    }
    static int getRes(String s,int k){
        int len=s.length();
        if(k>=len) return 0;
        int res=0;
        int[] array=new int[26];
        char[] c=s.toCharArray();
        for(int i=0;i<len;i++){
            ++array[c[i]-'a'];
        }
        Comparator<Integer> comparator=new IntComparator();
        PriorityQueue<Integer> queue=new PriorityQueue<>(comparator);
        for(int i=0;i<array.length;i++){
            if(array[i]!=0) queue.add(array[i]);
        }
        while(k>0){
            int temp=queue.peek();
            if(temp>k){
                temp=temp-k;
                k=0;
                queue.poll();
                queue.add(temp);
            }else{   
                queue.poll();
                k=k-temp;
            }
        }
        while(!queue.isEmpty()){
            int temp=queue.poll();
            res=res+temp*temp;
        }
        return res;
    }
    public static class IntComparator implements Comparator<Integer>{
        public int compare(Integer a,Integer b){
            if(a==b) return 0;
            else return a>b?-1:1;
        }
    }
}