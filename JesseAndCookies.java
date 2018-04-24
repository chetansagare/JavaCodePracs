import java.util.Arrays;
import java.util.Scanner;

public class JesseAndCookies{
    static int size;
    public static void main(String[] args) {
       Scanner s=new Scanner(System.in);
       int n=s.nextInt();
       int k=s.nextInt();
       size=0;
       int[] heap=new int[n+1];
       for(int i=0;i<n;i++){
        int a=s.nextInt();
        ++size;
        heap[size]=a;
        upHeapBubble(heap,size);
       }

       System.out.println(Arrays.toString(heap));
       int count=0;
       while(size>1 && getMin(heap)<k){
            int a=removeMin(heap);
            int b=removeMin(heap);
            int sweet=(1*a+2*b);
            ++size;
            heap[size]=sweet;
            upHeapBubble(heap,size);
            ++count;
           
       }
       if(size<=0 || (size==1 && getMin(heap)<k)) System.out.println(-1);
       else System.out.println(count);

       
       System.out.println(size+"\n"+Arrays.toString(heap));
    }

    static void swap(int[] array,int i,int j){
        int temp=array[i];
        array[i]=array[j];
        array[j]=temp;
    }
    static void upHeapBubble(int[] array,int index){
        if(index<=1) return;
        if(array[index]<array[index/2]){
            swap(array, index, index/2);
            upHeapBubble(array, index/2);
        }
    }
    static void downHeapBubble(int[] array,int i){
        if(i>=size || 2*i>size || 2*i+1>size)return;
        if(array[i]<array[2*i] && array[i]<array[2*i+1]) return;
        if(array[2*i]<array[2*i+1]){
            swap(array, i,2*i);
            downHeapBubble(array, 2*i);
        }else{
            swap(array, i, 2*i+1);
            downHeapBubble(array, 2*i+1);
        }

    }
    static int getMin(int[] array){
        if(size>=1) return array[1];
        else return -1;
    }
    static int removeMin(int[] array){
        if(size<1) return -1;
        int min=array[1];
        swap(array, 1,size);
        --size;
        downHeapBubble(array,1);
        return min;
    }
}