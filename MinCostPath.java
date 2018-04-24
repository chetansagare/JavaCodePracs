public class MinCostPath{
    public static void main(String[] args) {

        int[][] path = { {1, 2, 3},
                         {4, 8, 2},
                         {1, 5, 3} };
        int[][] cost = new int[path.length][path[0].length];

        for(int i = 0;i < cost.length;i++){
            for(int j=0;j < cost[0].length;j++){
                if(i==0 && j==0) cost[i][j]=path[i][j];
                else if(i==0) cost[i][j]=cost[i][j-1]+path[i][j];
                else if(j==0) cost[i][j]=cost[i-1][j]+path[i][j];
                else cost[i][j]=Math.min(cost[i][j-1],Math.min(cost[i-1][j],cost[i-1][j-1]))+path[i][j];   
            }
        }
        System.out.println(cost[path.length-1][path[0].length-1]);
    }
}