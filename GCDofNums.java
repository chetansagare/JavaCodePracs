public class GCDofNums{
    public static void main(String[] args) {
        System.out.println(GCD(213000,130900));
    }

    public static int GCD(int max,int min) {

        if(max%min==0){
            return min;
        }
        int temp = max%min;
        max = min;
        min=temp;
        return GCD(max,min);         
    }
}