public class MaxContSum{
    public static void main(String[] args) {
        int[] array = {-2, -3, 4, -1, -2, 1, 5, -3};
        maxSum(array);
    }
    public static int maxSum(int[] array) {
        int n = array.length;
        int sum =0;
        int tempMax=0;
        int start=0,s = 0;
        int end=0;
        for(int i =0;i<n;i++){
            sum=sum+array[i];
            if(sum<0){ 
                sum=0;
                s=1+i;
            }
            if(sum>tempMax){
                tempMax=sum;
                start =s;
                end=i;
            }
        }
        System.out.println("Start :"+start+" End : "+end);
        return tempMax;
    }
}