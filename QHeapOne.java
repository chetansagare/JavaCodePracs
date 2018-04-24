import java.util.Scanner;

public class QHeapOne{
    static int size;
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int q=s.nextInt();
        size=0;
        int[] heap=new int[q+1];
        for(int i=0;i<q;i++){
            int query=s.nextInt();
            if(query==1){
                int a=s.nextInt();
                ++size;
                heap[size]=a;
                upHeapBubble(heap,size);
            }else if(query==2){
                int a=s.nextInt();
                int index=search(heap,a);
                if(index!=-1){
                swap(heap,size, index);
                --size;
                downHeapBubble(heap, index);
                }
            }else if(query==3){
                System.out.println(heap[1]);
            }
        }
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
       
        if(array[2*i]<array[2*i+1]){
            swap(array, i,2*i);
            downHeapBubble(array, 2*i);
        }else{
            swap(array, i, 2*i+1);
            downHeapBubble(array, 2*i+1);
        }

    }
    static int search(int[] array,int value){
        for(int i=1;i<=size;i++){
            if(array[i]==value) return i;
        }
        return -1;
    }
}