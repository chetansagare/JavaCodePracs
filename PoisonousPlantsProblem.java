import java.util.ArrayList;
import java.util.Scanner;

public class PoisonousPlantsProblem{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        // int[] p = new int[n];
        ArrayList<Integer> p=new ArrayList<>();
        for(int p_i = 0; p_i < n; p_i++){
            int t=in.nextInt();;
            p.add(t);
        }
        int result = poisonousPlants(p);
        System.out.println(result);
        in.close();
    }
    static int poisonousPlants(ArrayList<Integer> p) {
        ArrayList<Integer>  list;
        int count=0;
        while(!inOrder(p)){
            list=new ArrayList<>();
            int n=p.size();
            int i=1;
            if(p.get(0)<=p.get(1))list.add(p.get(0));
            while(i<n){
                if(p.get(i)<=p.get(i-1)){
                    list.add(p.get(i));
                }
                ++i;
            }
            p=list;
            ++count;
        }
       return count;
    }
    static boolean inOrder(ArrayList<Integer> p){
        int n=p.size();
        for(int i=1;i<n;i++){
            if(p.get(i)>p.get(i-1)) return false;
        }
        return true;
    }
}