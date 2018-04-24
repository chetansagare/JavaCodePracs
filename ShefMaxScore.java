import java.util.Arrays;
import java.util.Scanner;
public class ShefMaxScore{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int testcases=scan.nextInt();
        scan.nextLine();
        for(int i=0;i<testcases;i++){
            int sum=0;
            int justSmall=Integer.MAX_VALUE;
            int seqs=scan.nextInt();
            scan.nextLine();
            int[][] matrix=new int[seqs][seqs];
            for(int j=0;j<seqs;j++){
                for(int k=0;k<seqs;k++){
                    matrix[j][k]=scan.nextInt();
                }
                Arrays.sort(matrix[j]);
                scan.nextLine();
            }
            for(int j=seqs-1;j>=0;j--){
                justSmall = getJustSmall(matrix[j],justSmall);
                if(justSmall==-1){
                    System.out.println(-1);
                    break;
                }else sum=sum+justSmall;   
            }
            if(justSmall!=-1) System.out.println(sum);
        }
        scan.close();
    }
    static int getJustSmall(int[] array,int justSmall){
        for(int i=array.length-1;i>=0;i--){
            if(array[i]<justSmall) return array[i];
        }
        return -1;
    }
}
