public class JigglingRotation{
    public static void main(String[] args) {
        int[] a={1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        int n = a.length,d=3;
        RotateArray(a,n,d);
    }
    public static int gcd(int a,int b){
        if(a%b==0) return b;
        else {
            a=a%b;
            return gcd(b,a);
        }
    }
    public static void RotateArray(int[] a,int n,int d){
        int gcd = gcd(n,d);
        for(int i=0;i<gcd;i++){
            int temp = a[i];
            for(int j=i;j<n;j=j+gcd){
                try{
                    if(j==n-gcd+i) a[j]=temp;
                    else a[j]=a[j+gcd];
                }catch(Exception e){}   
            }
        }
        for(int j=0;j<n;j++){
            System.out.print(a[j]+" ");
        }
    }
}