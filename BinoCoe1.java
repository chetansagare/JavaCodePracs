public class BinoCoe1{
    public static void main(String[] args) {
        int n = 10,k=2,fact=n;
        for(int i=1;i<k;i++){
            fact=fact*(n-i)/i;
        }
        System.out.println(fact/k);
    }
}