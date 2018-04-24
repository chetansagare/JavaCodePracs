import java.util.Arrays;

public class RearrangeMaxMin{
    public static void main(String[] args) {
        int[] a={1, 2, 3, 4, 5, 6, 7} ;
        int n = a.length;
        int maxIndex=n-1,minIndex=0,max_element=a[maxIndex]+1;
        for(int i=0;i<n;i++){
            if(i%2==0){
                a[i]=a[i]+a[maxIndex]%max_element*max_element;
                --maxIndex;
            }else{
                a[i]=a[i]+a[minIndex]%max_element*max_element;
                ++minIndex;
            }
        }
        for(int i=0;i<n;i++) System.out.print(a[i]/max_element+" ");
    }
}
