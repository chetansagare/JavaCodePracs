 
import java.util.*;


public class DoubleString {
   public static void main(String args[] ) throws Exception {
        
   Scanner scan = new Scanner(System.in);
   int n = scan.nextInt();
   HashSet<Character> hs;
   String s;
   scan.nextLine();
   for(int i =0;i<n;i++){
       s = scan.nextLine();
       int length = s.length();
       
       
       
       hs = new HashSet<>();
       for(int j=0;j<length;j++){
           if(!hs.contains(s.charAt(j)))
           {
               hs.add(s.charAt(j));
               
           }
           else{
               break;
           }
       }
       if(hs.size()< length) System.out.println("Yes");
       else System.out.println("No");
   }
   }
}