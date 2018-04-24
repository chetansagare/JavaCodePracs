import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;
import java.util.*;

public class demo{
    public static void main(String[] args) {
        // Scanner s=new Scanner(System.in);
        // int x=s.nextInt();
        // int y=s.nextInt();

        // int and=x & y;
        // int or= x | y;

        // System.out.println(and);
        // System.out.println(or);


        // double d=0.0;
        // for(d=0.0;d<3.0;d++) System.out.print("Hello");
        // Stack<Integer> stack=new Stack<>();
        // stack.push(1);
        // stack.push(2);
        // stack.push(3);
        // stack.push(4);
        // stack.push(5);
        // stack.push(6);
        // for (int i=0;i<6;i++) {
        //     System.out.print(stack.pop()+" ");
        // }
        // System.out.println();

        // Queue<Integer> q=new LinkedList<>();

        // q.add(1);
        // q.add(2);
        // q.add(3);
        // q.add(4);
        // q.add(5);
        // q.add(6);
        // q.add(7);
        // q.add(8);
        // for (int i=0;i<8;i++) {
        //     System.out.print(q.remove()+" ");
        // }
        // System.out.println(4 & 2);
        // System.out.println(1 | 2);
        // int t=Integer.MIN_VALUE;
            // int large=(int)Math.pow(10,9)+7;
            // System.out.println(large);
        // int i=42;
        // int j=13;

        // System.out.println((double)i/(double)j);
        int p=3;
        int q=5;
        double distInDouble=p+((double)q/(double)10);

        System.out.println(distInDouble);

        HashMap<Integer,Integer> map =new HashMap<>();

        Random random=new Random();
        for(int i=0;i<20;i++){
            map.put(random.nextInt(100), random.nextInt(100));
        }

        for(int key: map.keySet()){
            System.out.print(key+" ");
        }
    }
}
