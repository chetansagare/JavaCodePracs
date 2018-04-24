import java.util.Arrays;

public class ArrayQsns{
    public static void main(String[] args) {
        int[] array={-1, 2, -3, 4, -5, 6, -7, 8,-11,-13};
        System.out.println(Arrays.toString(array));
        // rearrangePosNeg(array);
        // reverseArray(array);
        // reverseArrayRecursive(array,0,array.length-1);
        // arrayInWaveInOn(array);
        seperatePosNeg(array);
        System.out.println(Arrays.toString(array));   
    }
    public static void rearrangePosNeg(int[] array){
        int n=array.length;
        int i=0,j=n-1;
        while(i<j){
            if(array[i]<0 && array[j]>0){
                swap(array, i, j);
                ++i;
                --j;
            }else if(array[i]>0) ++i;
            else if(array[j]<0) --j;
        }
        int pos=1,neg=j;
        while(pos<n && neg<n){
            
            if(array[pos]<0) break;

                swap(array,pos,neg);
                pos=pos+2;
                ++neg;  
        }
      
    }
    public static void swap(int[] array, int i,int j){
        int temp=array[i];
        array[i]=array[j];
        array[j]=temp;
    }
    public static void reverseArray(int[] array){
        int n=array.length;
        int i=0,j=n-1;
        while(i<j){
            swap(array, i, j);
            ++i;
            --j;
        }
        
    }
    public static void reverseArrayRecursive(int[] array,int start,int end){
        if(start>=end) return;
        int temp=array[start];
        array[start]=array[end];
        array[end]=temp;
        reverseArrayRecursive(array, start+1, end-1);
    }
    public static void arrayInWaveFormBySort(int[] array){
        Arrays.sort(array);
        int n=array.length;
        for(int i=1;i<n-1;i=i+2){
            swap(array, i, i+1);
        }
    }
    public static void arrayInWaveInOn(int[] array){
        int n=array.length;
        for(int i=0;i<n;i=i+2){
            if(i!=0 && array[i]<array[i-1]) swap(array, i, i-1);
            if(i!=n-1 && array[i]<array[i+1]) swap(array, i, i+1);
        }
    }
    public static void seperatePosNeg(int[] array){
        int n=array.length;
        int i=0,j=n-1;
        while(i<j){
            if(array[i]>0 && array[j]<0){
                swap(array, i, j);
                ++i;
                --j;
            }else if(array[i]<0) ++i;
            else if(array[j]>0) --j;
        }
    }
}