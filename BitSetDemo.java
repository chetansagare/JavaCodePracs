import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class BitSetDemo{

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int q = s.nextInt();
        BitSet bitset1 = new BitSet(n);
        BitSet bitset2 = new BitSet(n);
        
        for(int i =0;i<q;i++){
            String str = s.next();
            int a = s.nextInt();
            int b = s.nextInt();
            if(str.equals("AND")){
                if(a==1){
                    bitset1.and(bitset2);
                }else{
                    bitset2.and(bitset1);
                }
                System.out.println(bitset1.cardinality()+" "+bitset2.cardinality());
            }
            else if (str.equals("OR")) {
                if(a==1){
                    bitset1.or(bitset2);
                }else{
                    bitset2.or(bitset1);
                }
                System.out.println(bitset1.cardinality()+" "+bitset2.cardinality());
            }
            else if (str.equals("XOR")) {
                if(a==1){
                    bitset1.xor(bitset2);
                }else{
                    bitset2.xor(bitset1);
                }
                System.out.println(bitset1.cardinality()+" "+bitset2.cardinality());
            }
            else if (str.equals("SET")) {
                if(a==1){
                    bitset1.set(b);
                }else{
                    bitset2.set(b);
                }
                System.out.println(bitset1.cardinality()+" "+bitset2.cardinality());
            }
            else if (str.equals("FLIP")) {
                if(a==1){
                    bitset1.flip(b);
                }else{
                    bitset2.flip(b);
                }
                System.out.println(bitset1.cardinality()+" "+bitset2.cardinality());
            }
        }
    }
}