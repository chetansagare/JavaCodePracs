import java.util.Arrays;

public class MergeArrays{
    public static void main(String[] args) {
        int[] nums1={3,7,8,0,0};
        int[] nums2={4,5};
        merge(nums1,3,nums2,nums2.length);
    }
    static void merge(int[] nums1,int m,int[] nums2,int n){
        int len=nums1.length;
        for(int i=0;i<m;i++){
            nums1[len-1-i]=nums1[m-1-i];
        }
        int i=0,j=0,k=0;
        while(k<m && j<n){
            if(nums1[n+k]<nums2[j]){
                nums1[i]=nums1[n+k];
                ++i;
                ++k;
            }else{
                nums1[i]=nums2[j];
                ++j;
                ++i;
            }
        }
        while(k<m){
            nums1[i]=nums1[n+k];
            ++i;
            ++k;
        }
        while(j<n){
            nums1[i]=nums2[j];
            ++j;
            ++i;
        }

        //System.out.println(Arrays.toString(nums1));
    }
}