public class FindDegrees{
    public static void main(String[] args) {
        double[] xVals={1,2,3,4,5};
        double[] yVals={1,3,4,6,5};

        int len=xVals.length;
        double xSum=0.0;
        double ySum=0.0;
        double x2Sum=0.0;
        double x3Sum=0.0;
        double x4Sum=0.0;
        double xySum=0.0;
        double x2ySum=0.0;

        for(int i=0;i<len;i++){
            double xsqr=xVals[i]*xVals[i];
            double xcub=xsqr*xVals[i];
            double xquad=xcub*xVals[i];
            double xy=xVals[i]*yVals[i];
            double x2y=xy*xVals[i];
            xSum=xSum+xVals[i];
            ySum=ySum+yVals[i];
            x2Sum=x2Sum+xsqr;
            x3Sum=x3Sum+xcub;
            x4Sum=x4Sum+xquad;
            xySum=xySum+xy;
            x2ySum=x2ySum+x2y;
        }
        System.out.println("len : "+len);
        System.out.println("xSum : "+xSum);
        System.out.println("ySum : "+ySum);
        System.out.println("x2Sum : "+x2Sum);
        System.out.println("x3Sum : "+x3Sum);
        System.out.println("x4Sum : "+x4Sum);
        System.out.println("xySum : "+xySum);
        System.out.println("x2ySum : "+x2ySum);

    }
}