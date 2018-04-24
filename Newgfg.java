import java.util.*;

public class Newgfg
{
    
    static int swap(int n,int p1,int p2)
    {
        
        int s1 = n & (1<<(p1));
        System.out.println(s1);
        int s2 = n & (1<<(p2));
        System.out.println(s2);
        if(s1!=0){
            s1=1;
            n = n ^(1<<p1);
            System.out.println(n);
        }
        if(s2!=0){
            s2=1;
            n = n ^(1<<p2);
            System.out.println(n);
        }
        int p=s2<<(p1)| n;
        System.out.println(p);
        int q=s1<<(p2);
        System.out.println(q);
        return   p|q ;
    }
    
    
    public static void main(String[] args)
    {
       
        System.out.println(swap(20,2,3));
    }
}