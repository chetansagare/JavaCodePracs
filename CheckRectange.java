import java.util.*;
public class CheckRectange{
    public static void main(String[] args) {
     Scanner s = new Scanner(System.in);
     int n=s.nextInt();
     s.nextLine();
     for(int i=0;i<n;i++){
            HashMap<Integer,Integer> map = new HashMap<>();
            for(int j=0;j<4;j++){
                int a=s.nextInt();
                if(!map.containsKey(a)) map.put(a, 1);
                else{
                    int count=map.get(a);
                    ++count;
                    map.put(a,count);
                }
            }
            if(map.size()==2){
                int temp=0;
                for(Integer key : map.keySet()){
                    if(map.get(key)==2){
                        ++temp;
                    }
                }
                if(temp==2) System.out.println("YES");
                else System.out.println("NO");
            }
            else if(map.size()==1) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}