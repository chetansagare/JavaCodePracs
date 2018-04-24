public class QuickSortCode{
    public static void main(String[] args) {
        int[] array = {2,5,3,6,8,5,1,4,0,9};
        QuickSort(array, 0, array.length-1); 
        
        for(int i =0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
    }   
    public static int Partition(int[] array, int start , int end){
        int pivot = end;
        int pIndex = start;

        for (int i =start; i<end;i++) {
           
            if(array[i]<=array[pivot]){
                swap(array,pIndex,i);
                ++pIndex;
            }
        }
        swap(array,pIndex,pivot);
        return pIndex;
    }
    public static void QuickSort(int[] array, int start, int end){
        if(start>=end) return;
        int pIndex = Partition(array, start, end);
        QuickSort(array, start, pIndex-1);
        QuickSort(array, pIndex+1,end);
        
    }
    public static void swap(int[] array, int a,int b) {
        int temp = array[a];
        array[a]=array[b];
        array[b]=temp;
    }
}