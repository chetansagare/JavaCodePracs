import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.io.BufferedWriter;

public class GameOfTwoStacks {
    public static void main(String[] args) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter("GameOfStacks.txt"));
        Scanner in = new Scanner(System.in);
        // int g = in.nextInt();
        // for(int a0 = 0; a0 < g; a0++){
            int n = 1+in.nextInt();
            int m = 1+in.nextInt();
            int x = in.nextInt();
            int[] a = new int[n];
            a[0]=0;
            for(int a_i=1; a_i < n; a_i++){
                a[a_i] = a[a_i-1]+in.nextInt();
            }
            int[] b = new int[m];
            b[0]=0;
            for(int b_i=1; b_i < m; b_i++){
                b[b_i] = b[b_i-1]+in.nextInt();
            }
            int sum=0,count=0,ai=1,bi=1,asum=0,bsum=0;
            while(true){
                if(sum>x || (ai>=n && bi>=m)) break;
                else if(ai>=n && bi<m){
                    sum=b[bi]+a[n-1];
                    ++bi;
                    ++count;
                }else if(ai<n && bi>=m){
                    sum=a[ai]+b[m-1];
                    ++ai;
                    ++count;
                }else if(a[ai]<b[bi]){
                    asum=a[ai];
                    sum=asum+bsum;
                    ++ai;
                    ++count;
                }else{
                    bsum=b[bi];
                    sum=asum+bsum;
                    ++bi;
                    ++count;
                }
            }
            writer.write(count+"\n");
        // }
        writer.close();
    }
    // public static void main(String[] args) throws IOException {
    //     BufferedWriter writer = new BufferedWriter(new FileWriter("GameOfStacks.txt"));
    //     Scanner in = new Scanner(System.in);
    //     int g = in.nextInt();
    //     for(int a0 = 0; a0 < g; a0++){
    //         int n = in.nextInt();
    //         int m = in.nextInt();
    //         int x = in.nextInt();
    //         int[] a = new int[n];
    //         for(int a_i=0; a_i < n; a_i++){
    //             a[a_i] = in.nextInt();
    //         }
    //         int[] b = new int[m];
    //         for(int b_i=0; b_i < m; b_i++){
    //             b[b_i] = in.nextInt();
    //         }
    //         int sum=0,count=-1;
    //         int ai=0,bi=0;
        
    //         while(true){
    //             if(sum>x ||(ai>=n && bi>=m)){
    //                 // System.out.println(count);
    //                 writer.write(count+"\n");
    //                 break;
    //             }
    //             else if(ai>=n){
    //                 sum=sum+b[bi];
    //                 ++bi;
    //                 ++count;
    //             }else if(bi>=m){
    //                 sum=sum+a[ai];
    //                 ++ai;
    //                 ++count;
    //             }else if(a[ai]<b[bi]){
    //                 sum=sum+a[ai];
    //                 ++ai;
    //                 ++count;
    //             }else{
    //                 sum=sum+b[bi];
    //                 ++bi;
    //                 ++count;
    //             }
    //         }
    //     }
    //     writer.close();
    // }
}
