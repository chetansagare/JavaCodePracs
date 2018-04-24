public class FibProg3{
    public static void main(String[] args) {
        int n =8;
        System.out.println(findFib(n));
    }
    public static int findFib(int n) {
        int foo =0,bar=1,fib=0;
        for(int i=2;i<=n;i++){
            fib=bar+foo;
            foo=bar;
            bar=fib;
        }
        return fib;
    }
}