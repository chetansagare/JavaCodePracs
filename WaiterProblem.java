import java.util.Scanner;
import java.util.Stack;
import java.util.ArrayList;

public class WaiterProblem{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int q = in.nextInt();
        Stack<Integer> a = new Stack<>();
        Stack<Integer> atemp = new Stack<>();
        Stack<Integer> b = new Stack<>();
        for(int number_i = 0; number_i < n; number_i++){ 
            a.push(in.nextInt());
        }
        ArrayList<Integer> primes=new ArrayList<>();
        getPrimes(primes, n);
        int i=1;
        while(i<=q){
            while(!a.empty()){
                int t=a.pop();
                if(t%primes.get(i-1)==0){
                    b.push(t);
                }else atemp.push(t);
            }
            while(!b.empty()) System.out.println(b.pop());
            ++i;
            a=atemp;
            atemp=new Stack<>();
        }
        while(!a.empty()){
            System.out.println(a.pop());
        }
    }
    static void getPrimes( ArrayList<Integer> primes,int n){
        primes.add(2);
        int i=3;
        while(primes.size()<n){
            boolean isPrime = true;
            for(int j=2;j<=Math.sqrt(i);j++){
                if(i%j==0){
                    isPrime=false;
                    break;
                }
            }
            if(isPrime) primes.add(i);
            ++i;
        }
        return;
    }
}