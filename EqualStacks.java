import java.util.Scanner;
public class EqualStacks{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n1 = in.nextInt();
        int n2 = in.nextInt();
        int n3 = in.nextInt();
        int h1[] = new int[n1];
        int sum1=0;
        int sum2=0;
        int sum3=0;
        for(int h1_i=0; h1_i < n1; h1_i++){
            int a= in.nextInt();
            h1[h1_i] = a;
            sum1=sum1+a;
        }
        int h2[] = new int[n2];
        for(int h2_i=0; h2_i < n2; h2_i++){
            int a= in.nextInt();
            h2[h2_i] =a;
            sum2=sum2+a;
        }
        int h3[] = new int[n3];
        for(int h3_i=0; h3_i < n3; h3_i++){
            int a= in.nextInt();
            h3[h3_i] = a;
            sum3=sum3+a;
        }
        int i1=-1;
        int i2=-1;
        int i3=-1;
        while(true){
            if((sum1==sum2 && sum2==sum3)){
              System.out.println(sum3);
              return;
            }
            else if(sum1<=0 || sum2<=0 || sum3<=0){
                System.out.println(getMinSum(sum1,sum2,sum3));
                return;
            } 
            int maxSum=getMaxSum(sum1,sum2,sum3);
            //System.out.println(maxSum);
                if(maxSum==sum1){
                    ++i1;
                    sum1=sum1-h1[i1];
                }else if(maxSum ==sum2){
                    ++i2;
                    sum2=sum2-h2[i2];
                   
                }else if(maxSum ==sum3){
                    ++i3;
                    sum3=sum3-h3[i3];
                }
        }
    }
    public static int getMaxSum(int a,int b,int c){
        if(a>=b){
            if(a>=c) return a;
            else return c;
        }else{
            if(b>=c) return b;
            else return c;
        }
    }
    public static int getMinSum(int a,int b,int c){
        if(a<=b){
            if(a<=c) return a;
            else return c;
        }else{
            if(b<=c) return b;
            else return c;
        }
    }
}