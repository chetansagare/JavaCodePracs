import java.util.Scanner;
import java.util.Stack;

public class MaxElementInStack{
    static int index;
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n =s.nextLong();
        s.nextLine();
        // Stack<Long> stack=new Stack<>();
        // Stack<Long> maxStack=new Stack<>();
        long[] stack=new long[n];
        long[] maxStack=new long[n];
        index=0;
        for(long i=0;i<n;i++){
            int q=s.nextInt();
            if(q==1){
                long data=s.nextLong();
                stack[index]=data;
                if(index>=1 && maxStack[index-1]>=data) maxStack[index]=maxStack[index-1];
                else maxStack[index]=data;
                ++index;
            }else if(q==2) --index;
            else if(q==3){
                System.out.println(maxStack[index]);
            }
            s.nextLine();
        }
    }
}

// switch(q){
            //     case 1:{
            //         long data=s.nextLong();
            //         stack.push(data);
            //         if(maxStack.empty()) maxStack.push(data);
            //         else{
            //             if(maxStack.peek()<data) maxStack.push(data);
            //             else maxStack.push(maxStack.peek());
            //         }
            //         break;
            //     }
            //     case 2:{
            //         stack.pop();
            //         maxStack.pop();
            //         break;
            //     }
            //     case 3: System.out.println(maxStack.peek());
            // }
            // if(q==1){
            //     long data=s.nextLong();
            //     stack.push(data);
            //     if(maxStack.empty()) maxStack.push(data);
            //     else{
            //         if(maxStack.peek()<data) maxStack.push(data);
            //         else maxStack.push(maxStack.peek());
            //     }
            // }else if(q==2){
            //     stack.pop();
            //     maxStack.pop();
            // }else if(q==3){
            //     System.out.println(maxStack.peek());
            // }