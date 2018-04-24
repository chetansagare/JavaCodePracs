public class CheckPrime{
    public static void main(String[] args) {
        int x=39;
        System.out.println(check(x,2));
        
    }
    public static boolean check(int x,int d){
        if(x==2) return true;
        if(d>=Math.sqrt(x)) return true;
        if(x%d==0) return false;
        else return check(x, d+1);
    }
}