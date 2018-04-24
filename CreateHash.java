import java.util.*;


public class CreateHash {
   public static void main(String args[] ) throws Exception {
       
        String Initial = "abcdefghijklmnopqrstuvwxyz1234567890ABCDEFGHIJKLMNOPQRSTUVWXYZ";
   
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String str;
        int sum;
        
        for(int i =0;i<=n;i++){
            
            str = scan.nextLine();
            sum =0;
            
            String[] array = str.split("\\s");
            
            int arrayLength = array.length;
            
            for(int j = 0;j<arrayLength;j++){
                
                for(int k=0;k<array[j].length();k++){
                    
                   sum=sum+Initial.indexOf(array[j].charAt(k))+k; 
                   
                }
            }
            
            System.out.println(arrayLength*sum);
        }
       
   }
}