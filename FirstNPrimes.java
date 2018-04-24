import java.util.ArrayList;
import java.util.Arrays;

public class FirstNPrimes{
    public static void main(String[] args) {
        // long startTime=System.currentTimeMillis();
        System.out.println();
        printSixMultiples();
        printPrimes(100);
        // long endTime=System.currentTimeMillis();
        // long time=(endTime-startTime)/1000;
        // System.out.println(time);
    }
    static void printSixMultiples(){
        for(int i=1;i<100;i++){
            int p=6*i;
            int a=p-1;
            int b=p+1;
            System.out.print(a+" "+b+" ");
        }
    }
    static void printPrimes(int n){
        long startTime=System.currentTimeMillis();
        ArrayList<Integer> primes=new ArrayList<>();
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
        System.out.println();
        System.out.println(primes.size());
        System.out.println();
        System.out.println(Arrays.toString(primes.toArray()));
        long endTime=System.currentTimeMillis();
        long time=(endTime-startTime);
        System.out.println(time);
        return;
    }
}