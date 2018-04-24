public class UglyNums{
    public static void main(String[] args) {
         int n=150,i2=0,i3=0,i5=0;
         int next_ugly=1;
         int next_multiple_2 = 2;
         int next_multiple_3 = 3;
         int next_multiple_5 = 5;
         int[] ugly = new int[n];
         ugly[0]=1;
         for(int i=1;i<n;i++){
            next_ugly=Math.min(next_multiple_2,Math.min(next_multiple_3, next_multiple_5));
            ugly[i]=next_ugly;
            if(next_ugly==next_multiple_2){
                i2=i2+1;
                next_multiple_2=ugly[i2]*2;
            }
            if(next_ugly==next_multiple_3){
                i3=i3+1;
                next_multiple_3=ugly[i3]*3;
            }
            if(next_ugly==next_multiple_5){
                i5=i5+1;
                next_multiple_5=ugly[i5]*5;
            }
         }
         System.out.println(next_ugly);
    }
}