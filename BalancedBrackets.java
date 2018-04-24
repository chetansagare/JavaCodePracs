import java.util.Stack;

public class BalancedBrackets{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            String s = in.next();
            String result = isBalanced(s);
            System.out.println(result);
        }
        in.close();
    }
    static String isBalanced(String s) {
        int n=s.length();
        if(n%2==1) return "NO";
        int index=-1;
        char[] stack=new char[n];
        for(int i=0;i<n;i++){
            char x=s.charAt(i);
            if(index<0){
                if(x==41 || x==93 || x==125) return "NO";
                else{
                    ++index;
                    stack[index]=x;
                }
            }else{
                if(x-stack[index]==1 || x-stack[index]==2){
                    --index;
                }else{
                    ++index;
                    stack[index]=x;
                }
            }
        }
        if(index==-1) return "YES";
        else return "NO";  
    }

}