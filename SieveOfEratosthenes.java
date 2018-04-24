import java.util.ArrayList;
import java.util.Arrays;

public class SieveOfEratosthenes{
    public static void main(String[] args) {
        int n=100;
        ArrayList<Integer> primes=new ArrayList<>(); 
        primesWithSieveOfEratosthenes(n,primes);
        System.out.println(primes.size());
        System.out.println(Arrays.toString(primes.toArray()));
    }
    static void primesWithSieveOfEratosthenes(int n,ArrayList<Integer> p){
        int N=n*(int)(Math.log(n)+Math.log(Math.log(n)));
        boolean[] primes= new boolean[N];
        System.out.println(N);
        for(int i=0;i<N;i++){
            primes[i]=true;
        }
        for(int i=2;i*i<=N;i++){
            if(primes[i]==true){
                for(int j=i*2;j<N;j=j+i){
                    primes[j]=false;
                }
            }
        }
        int k=2;
        while(k<N){
            if(primes[k]==true) p.add(k);
            ++k;
        }
    }
}