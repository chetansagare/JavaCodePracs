public class SpiralArray{
    public static void main(String[] args) {
        // for(int k=1;k<10;k++){
        //     int[][] array=generateMatrix(k);
        //     printMatrix(array);
        // }
        int[] array=new int[]{1000,-1};
        System.out.println(firstMissingPositive(array));
        
    }
    public static int[][] generateMatrix(int n) {
        int[][] array=new int[n][n];
        int count=0,low=0,high=n-1,i=0,j=0;
        while(count<=n*n && low<n && high>=0){
            while(j<=high && count<=n*n){
                array[i][j]=++count;
                ++j;
            }
            j=high;i=low+1;
            while(i<=high && count<=n*n){
                array[i][j]=++count;
                ++i;
            }
            i=high;j=high-1;
            while(j>=low && count<=n*n){
               array[i][j]=++count;
                --j; 
            }
            j=low;
            i=high-1;
            while(i>=low+1 && count<=n*n ){
               array[i][j]=++count;
                --i; 
            }
            ++low;
            --high;
            i=low;
            j=low;   
        }
        return array;
    }
    public static void printMatrix(int[][] array){
        System.out.println("");
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array.length;j++){
                System.out.print(array[i][j]+" ");
            }
            System.out.println("");
        }
        System.out.println("");
    }
    public static int firstMissingPositive(int[] nums) {
        int n=nums.length;
        for(int i=0;i<n;i++){
            int index=Math.abs(nums[i])-1;
            if(index>=0 && index<=n)nums[index]=-Math.abs(nums[index]);
        }
        for(int i=0;i<n;i++){
            if(nums[i]>=0) return i+1;
        }
        return 0;
    }
}