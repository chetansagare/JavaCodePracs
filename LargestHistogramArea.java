import java.util.Stack;

public class LargestHistogramArea{
    public static void main(String[] args) {
        int[] histogram={6, 2, 5, 4, 5, 1, 6};
        int n=histogram.length;
        // System.out.println(findMaxAreaOne(histogram,n));
        System.out.println(getMaxAreaInOn(histogram, n));
    }
    static int findMaxAreaOne(int[] histogram,int n){
        int maxArea=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            int area=getArea(histogram, i);
            if(area>maxArea) maxArea=area;
        }
        return maxArea;
    }
    static int getArea(int[] histogram,int i){
        int dummy=i+1;
        int area=histogram[i];
        while(dummy<histogram.length){
            if(histogram[dummy]>=histogram[i]){
                area=area+histogram[i];
                ++dummy;
            }else break;
        }
        dummy=i-1;
        while(dummy>=0){
            if(histogram[dummy]>=histogram[i]){
                area=area+histogram[i];
                --dummy;
            }else break;
        }
        return area;
    }
    static int findMaxAreaTwo(int[] histogram,int n){
        
        return 0;
    }
    static long getMaxAreaInOn(int[] h,int n){
        Stack<Integer> stack=new Stack<>();
        int maxArea=0;
        int tp;
        int area_with_tp=0;
        int i=0;
        while(i<n){
            if(stack.empty() || h[stack.peek()]<=h[i]){
                stack.push(i);
                ++i;
            }else{
                tp=stack.pop();
                area_with_tp=h[tp]*(stack.empty()?i:i-stack.peek()-1);
                System.out.println(area_with_tp);
            }
            if(area_with_tp>maxArea){
                maxArea=area_with_tp;
            }
        }
        while(!stack.empty()){
            tp=stack.pop();
            area_with_tp=h[tp]*(stack.empty()?i:i-stack.peek()-1);
            System.out.println(area_with_tp);
            if(area_with_tp>maxArea){
                maxArea=area_with_tp;
            }
        }
        return maxArea;
    }
}