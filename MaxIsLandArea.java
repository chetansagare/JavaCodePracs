public class MaxIsLandArea {
     public static void main(String[] args) {
        int[][] grid={{0,0,1,0,0,0,0,1,0,0,0,0,0},
        {0,0,0,0,0,0,0,1,1,1,0,0,0},
        {0,1,1,0,1,0,0,0,0,0,0,0,0},
        {0,1,0,0,1,1,0,0,1,0,1,0,0},
        {0,1,0,0,1,1,0,0,1,1,1,0,0},
        {0,0,0,0,0,0,0,0,0,0,1,0,0},
        {0,0,0,0,0,0,0,1,1,1,0,0,0},
        {0,0,0,0,0,0,0,1,1,0,0,0,0}};
        int m=grid.length;
        int n=grid[0].length;
        int maxArea=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                int area=0;
                if(grid[i][j]==1) area=getArea(grid,i,j,1);
                if(area>maxArea) maxArea=area;
            }
        }
        System.out.println(maxArea);
    }
    static int getArea(int[][] grid,int i,int j,int area){
        int m=grid.length;
        int n=grid[0].length;
        grid[i][j]=0;
        for(int p=-1;p<2;p++){
            for(int q=-1;q<2;q++){
                if(j+q<n && j+q>=0 && grid[i][j+q]==1 ){
                    area= area+getArea(grid,i,j+q,1);
                }
                if(i+p<m && i+p>=0 && grid[i+p][j]==1 ){
                    area= area+getArea(grid,i+p,j,1);
                }
            }
        }
        return area;
    }
}