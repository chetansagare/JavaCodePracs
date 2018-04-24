public class NaiveMaxSmallWindow{
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 50, 10, 70, 30};
        
        int n = arr.length;
        int localMini,localMaxi=0 ;
        for(int i =1;i<=n;i++){
            localMaxi=arr[0];
            for(int j =0;j<=n-i;j++){
                localMini = arr[j];
                for(int k=1;k<i;k++){
                    if(arr[k+j]<localMini){
                        localMini=arr[k+j];
                    }
                }
                 if(localMini>localMaxi){
                     localMaxi=localMini;
                 }
            }
            System.out.println(localMaxi+" ");
        }
    }
}