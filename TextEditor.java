import java.util.Scanner;
import java.util.Stack;


public class TextEditor{
    static String text ="";
    static Stack<Integer> opStack=new Stack<>();
    static Stack<String>  textStack=new Stack<>();
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
    
        int n=s.nextInt();
        for(int i=0;i<n;i++){
            int q=s.nextInt();
            if(q==1){
                String str=s.next();
                appendString(str);
                    opStack.add(1);
                    textStack.add(str);
    
            }else if(q==2){
                int k=s.nextInt();
                String delString =text.substring(text.length()-k);
                deleteString(delString);
                
                    opStack.add(2);
                    textStack.add(delString);
                
            }else if(q==3){
                int k=s.nextInt();
                System.out.println(text.charAt(k-1));
            }else if(q==4){
                undoOperation();
            }
        }   
    }
    static boolean appendString(String str){
        text=text+str;
        // System.out.println(text);
        return true;
    }
    static boolean deleteString(String str){
        int textLen=text.length();
        int slen=str.length();
        if(textLen>=slen){
            text=text.substring(0,textLen-slen);
            // System.out.println(text);
            return true;
        }else return false;
    }
    static void undoOperation(){
        if(opStack.empty()) return;
        int n=opStack.pop();
        String str=textStack.pop();
        if(n==1){
            deleteString(str);
        }else if(n==2){
            appendString(str);
        }
    }
}