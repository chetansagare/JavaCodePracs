public class MaxProdSubArray{
    public static void main(String[] args) {
        int[] array={6, -3, -10, 0, 2};
        System.out.println(findMaxProd(array,array.length));
    }
    static int findMaxProd(int[] array,int n){
        int maxProd=Integer.MIN_VALUE;
        int prod=1;
        for(int i=0;i<n;i++){
            if(maxProd==0){
                maxProd=array[i];
            }else{
                prod=prod*array[i];
                if(prod>maxProd) maxProd=prod;
            }
        }
        return 0;
    }
}