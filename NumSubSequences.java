import java.lang.Math;
import java.util.*;

public class NumSubSequences {
    public static void main(String[] args) {
        String test = "abcabc";
        int aCount =0;
        int bCount =0;
        int cCount =0;

        for (int i=0;i<test.length();i++) {
            char c = test.charAt(i);
            
            switch (c) {
                case 'a':
                    aCount=1+2*aCount;
                    break;
                case 'b':
                    bCount=aCount+2*bCount;
                    break;
                case 'c':
                    cCount=bCount+2*cCount;
                    break;
                default:
                    break;
            }
        }
        
        System.out.println(cCount);
    }
}