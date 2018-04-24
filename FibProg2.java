public class FibProg2{
  public static void main(String[] args) {
    int n = 9;
    System.out.println(findFib(n));
  }
  public static int findFib(int n) {
    int[] fib = new int[n+1];
    fib[0]=0;fib[1]=1;
    for(int i=2;i<=n;i++){
      fib[i]=fib[i-1]+fib[i-2];
    }
    return fib[n];
  }
}
