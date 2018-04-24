public class MinJumps{
    public static void main(String[] args) {
        int[] array = {1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9};
        System.out.println(minJumps(array,0));
    }
    public static int minJumps(int[] a,int index){
        if(index>=a.length-1) return 0;
        int min =Integer.MAX_VALUE,temp=0;
        for(int i=1;i<=a[index];i++){
            temp=1+minJumps(a, index+i);
            if(temp<min){
                min=temp;
            }
        }
        return min;
    }
}