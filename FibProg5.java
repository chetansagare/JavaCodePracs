public class FibProg5{
    static int F[];
    public static void main(String[] args) {
        int n = 9;
        F = new int[n+1];
        System.out.println(fib(n));
    }
    public static int fib(int n) {
        if(n==0) return 0;
        if(n==1 || n==2) return 1;
        int k =(n & 1)==1?(n+1)/2:n/2;
        F[n]=(n & 1)==1?(fib(k)*fib(k)+fib(k-1)*fib(k-1)):(2*fib(k-1)+fib(k))*fib(k);
        return F[n];
    }
}