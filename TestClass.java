import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
        
        Scanner sc= new Scanner(System.in);
        String s = sc.next();
        char[] temp = s.toCharArray();
        int[]  ch = new int[256];
        for(int i=0;i<temp.length;i++)
        {
              ch[(int)temp[i]]++;
        }
        min = ch[0];
        prev = 0;
        mi =0;
        for(int j=0;j<256;j++)
        {
            if(ch[j]>min)
            {  prev = mi;
                mi = j;
                min = ch[j];
                
                
            }
        }
        if(ch[prev]==ch[mi])
        {
            System.out.println((char)prev +" "+ ch[prev]);
        }
        else
        {
            System.out.println((char)mi + " "+ ch[mi]);
        }
    }
}