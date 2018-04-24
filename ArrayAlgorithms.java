import java.lang.Math;
import java.util.*;

public class ArrayAlgorithms {
    public static void main(String args[]) {
        int[] array={1, 1, 1, 0, 1, 0, 0, 1, 1, 1, 1};
        // {12, 11, 10, 5, 6, 2, 30};
        // {12, 34, 45, 9, 8, 90, 3};
        // {10, 5, 3, 9, 2};
        // { -12, 11, -13, -5, 6, -7, 5, -3, -6 };
        // {10, 5, 6, 3, 2, 20, 100, 80};
        // waveArray(array);
        // {-1, -3, -10, 60};
        // {6, -3, -10, 0, 2};
        // {-2, -3, 4, -1, -2, 1, 5, -3};
        // System.out.println("Maximum Sum of Sub Array is : "+largestSumSubArrayOne(array,array.length));
        // System.out.println("Maximum product Sub Array is : "+maxProductSubArray(array,array.length));
        
        // RearrangePositiveAndNegative(array,array.length);
        
        // RearrangeUsingMergeSort(array,array.length);
        
        // RearrangeDAC(array,0,array.length-1);
        
        // sortAboutAbs(array,7);
        // sortedSubSeqOfThree(array,array.length);

        segregateOAnd1(array,array.length);
        
        printArray(array);
        
    }
    
    static void sortedSubSeqOfThree(int[] array,int n){
        int[] smaller = new int[n];
        int min=Integer.MAX_VALUE;
        int mIndex=-1;
        
        for(int i=0;i<n;i++){
            if(array[i]<min){
                min=array[i];
                mIndex=i;
                smaller[i]=-1;
            }else{
                smaller[i]=mIndex;
            }
        }
        int[] greater =new int[n];
        int max=Integer.MIN_VALUE;
        int maxIndex=-1;
        
        for(int i=n-1;i>=0;i--){
            if(array[i]>max){
                max=array[i];
                maxIndex=i;
                greater[i]=-1;
            }else greater[i]=maxIndex;
        }
        
        for(int i=0;i<n;i++){
            if(smaller[i]!=-1 && greater[i]!=-1){
                System.out.println(array[smaller[i]]+" "+array[i]+" "+array[greater[i]]);
                return;
            }
        }
        System.out.println("No such Sequence Exist");
        return;
    }

    static void threeInSortedOrder(int[] arr) {
            if (arr == null) {
                return;
            }
            if (arr.length < 3) {
                return;
            }
            int min = arr[0];
            int[] minPairSoFar = null;
            for (int i = 1; i <= arr.length - 1; i++) {
                if(arr[i] > min && minPairSoFar == null) {
                    minPairSoFar = new int[2];
                    minPairSoFar[0] = min;
                    minPairSoFar[1] = arr[i];
                }else if (arr[i] < min && minPairSoFar == null) {
                    min = arr[i];
                }else if (minPairSoFar != null) {
                    if (arr[i] > minPairSoFar[1]) {
                        System.out.println(minPairSoFar[0] + " " + minPairSoFar[1] + " " + arr[i]);
                        return;
                    }
                    if (arr[i] > minPairSoFar[0] && arr[i] < minPairSoFar[1]) {
                        minPairSoFar[1] = arr[i];
                    }else if (arr[i] < minPairSoFar[0]) {
                        if (arr[i] > min) {
                            minPairSoFar[0] = min;
                            minPairSoFar[1] = arr[i];
                        } else {
                             min = arr[i];
                        }
                    }
                }
            }
        System.out.println("No sorted subsequence of length 3 found");    
    }

    static void segregateOAnd1(int[] array,int n){
        int start=0;
        int end=n-1;
        while(start<end){
            if(array[start]==1 && array[end]==0){
                swap(array, start, end);
                ++start;
                --end;
            }
            if(array[start]==0) ++start;
            if(array[end]==1) --end;
        }
    }

    static void alternateEvenOdd(int[] array,int n){
        int ei=0;
        int oi=n-1;
        while(ei<oi){
            if(array[ei]%2==1 && array[oi]%2==0){
                swap(array,ei,oi);
                ++ei;
                --oi;
            }
            if(array[ei]%2==0) ++ei;
            if(array[oi]%2==1) --oi;
        }
    }
    
    static void RearrangeDAC(int[] array,int start,int end){
        if(start<end){
            int mid = start+(end-start)/2;
            RearrangeDAC(array,start,mid);
            RearrangeDAC(array,mid+1,end);
            merge(array,start,mid,end);
        }
    }
    
    static void printArray(int[] array){
        System.out.println(Arrays.toString(array));
    }
    
    static void merge(int[] array,int start,int mid, int end ){
        int i=start;
        int j=mid+1;
        while(i<=mid && array[i]<0)++i;
        while(j<=end && array[j]<0) ++j;
        
        reverse(array,i,mid);
        reverse(array,mid+1,j-1);
        reverse(array,i,j-1);
    }
    
    static void reverse(int[] array,int start,int end){
        int i=start;
        int j=end;
        while(i<j){
            swap(array,i,j);
            ++i;
            --j;
        }
    }
    
    static void RearrangePositiveAndNegative(int[] array,int n){
        // O(n) Time Complexity but Order is not maintained
        int pIndex=0;
        int nIndex=0;
        while(pIndex<n && nIndex<n){
         while(pIndex<n && array[pIndex]<0) ++pIndex;
         while(nIndex<n && array[nIndex]>0) ++nIndex;
         if(pIndex<n && nIndex<n && pIndex<nIndex) swap(array,pIndex,nIndex);
         else ++nIndex;
        }
        System.out.println(Arrays.toString(array));
    }
    static void RearrangeUsingMergeSort(int[] array,int n){
        int[] temp=new int[n];
        int j=0;
        for(int i=0;i<n;i++){
            if(j<n && array[i]<0){
                temp[j]=array[i];
                ++j;
            }
        }
        for(int i=0;i<n;i++){
            if(j<n && array[i]>0){
                temp[j]=array[i];
                ++j;
            }
        }
        System.out.println(Arrays.toString(temp));
    }
    static void waveArray(int[] array){
        // O(n)
        int n=array.length;
        for(int i=0;i<n-1;i++){
            if(i%2==0) {
                if(array[i]<array[i+1]) swap(array,i,i+1);
            }
            else if(array[i]>array[i+1]) swap(array,i,i+1);
        }
        System.out.println(Arrays.toString(array));
    }
    
    static void swap(int[] array,int i,int j){
        int temp=array[i];
        array[i]=array[j];
        array[j]=temp;
    }
    
    static int largestSumSubArrayOne(int[] array,int n){
        int maxSum=Integer.MIN_VALUE;
        int sum=0;
        for(int i=0;i<n;i++){
            if(sum>0) sum=sum+array[i];
            else sum=array[i];
            if(sum>maxSum) maxSum=sum;
        }
     return maxSum;   
    }
    static int maxProductSubArray(int[] array,int n){
        int min_ending=1;
        int max_ending=1;
        int maxSoFar=1;
        
        for(int i=0;i<n;i++){
            if(array[i]>0){
                max_ending=max_ending*array[i];
                min_ending=Math.min(min_ending*array[i],1);
            }else if(array[i]==0){
                max_ending=1;
                min_ending=1;
            }else{
                int temp=max_ending;
                max_ending=Math.max(min_ending*array[i],1);
                min_ending=temp*array[i];
            }
            if(max_ending>maxSoFar) maxSoFar=max_ending;
        }
        return maxSoFar;
    }
    static void sortAboutAbs(int[] array,int x){
        int n=array.length;
        HashMap<Integer,ArrayList<Integer>> map=new HashMap<>();
        for(int i=0;i<n;i++){
            int abs = array[i]>x?array[i]-x:x-array[i];
            if(map.containsKey(abs)){
                ArrayList<Integer> list=map.get(abs);
                list.add(array[i]);
                map.put(abs,list);
            }else{
                ArrayList<Integer> list=new ArrayList<>();
                list.add(array[i]);
                map.put(abs,list);
            }
        }
        int size=map.size();
        int[] keyArray=new int[size];
        int i=0;
        for(int key : map.keySet()){
            keyArray[i]=key;
            ++i;
        }
        Arrays.sort(keyArray);
        
        for(i=0;i<size;i++){
            ArrayList<Integer> l=map.get(keyArray[i]);
            for(int j=0;j<l.size();j++){
                System.out.print(l.get(j)+" ");
            }
        }
    }
}


// 2 4 6 5 1 3 7 8 0 9  
// 0 2 4 6 8 
// 2 6 1 8 0
