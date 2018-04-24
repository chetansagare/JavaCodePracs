import java.util.Scanner;

public class LagrangeInterpolation{
    public static void main(String[] args) {
        double [] x;
        double[] y;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter length : ");
        int len=s.nextInt();
        x=new double[len];
        y=new double[len];
        System.out.println("Enter X series : ");
        for(int i=0;i<len;i++)
        x[i]=s.nextDouble();
        System.out.println("Enter Y series : ");
        for(int i=0;i<len;i++)
        y[i]=s.nextDouble();

        System.out.println("find value : ");
        double findX=s.nextDouble();

        System.out.println(findX+" - "+interpolation(x,y,findX));
        
        }
    
    public static double interpolation(double[] x,double[] y, double value){
        double result=0.0;
        int len=x.length;
        double[] mulVals=new double[len];
        for(int i=0;i<len;i++){
            for(int j=0;j<len;j++){
                
            }
        }
        return 0.0;
    }

}