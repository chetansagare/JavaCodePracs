import java.util.Stack;

public class PatternCheckWithStack{
    public static void main(String[] args) {
        String pattern="ABC";
        String text="ABABCABCC";
        System.out.println("Number Of Occurance : "+checkPattern(text,pattern));
    }
    private static int checkPattern(String text,String pattern){
        int count=0;
        Stack<Character> stack=new Stack<>();
        for(int i=0;i<text.length();i++){
            stack.push(text.charAt(i));
            if(stack.size()>=pattern.length()){
                if(checkStack(stack,text,pattern)){
                    ++count;
                    System.out.print(i+" ");
                }
            }
        }
        System.out.println("");
        return count;
    }
    private static boolean checkStack(Stack<Character> stack,String text,String pattern){
        String str="";
        for(int i=0;i<pattern.length();i++){
            str=stack.pop()+str;
        }
        if(str.equals(pattern)) return true;
        else{
            for(int i=0;i<pattern.length();i++){
                stack.push(str.charAt(i));
            }
            return false;   
        }
    }
}