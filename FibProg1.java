public class FibProg1{
  public static void main(String[] args) {
    int n =9;
    System.out.println(findFib(n));

  }
  public static int findFib(int n){
    if(n<=1) return n;
    return findFib(n-1)+findFib(n-2);
  }
}
