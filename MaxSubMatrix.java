public class MaxSubMatrix{
    public static void main(String[] args) {
        // int[][] matrix = {{0, 1, 1, 0, 1}, 
        // {1, 1, 0, 1, 0}, 
        // {0, 1, 1, 1, 0},
        // {1, 1, 1, 1, 0},
        // {1, 1, 1, 1, 1},
        // {0, 0, 0, 0, 0}};

        int[][] matrix ={{0,1, 1, 0},
        {1, 1, 1, 1},
        {1, 1, 1 ,1},
        {1 ,1, 0, 0}};
        
        

        int m = matrix.length;
        int n = matrix[0].length;

        int[][] auxMatrix = new int[m][n];
        int max = auxMatrix[0][0];
        int iMax =0;
        int jMax =0;
        for(int i=0;i<m;i++){
            for(int j = 0;j<n;j++){
                if(i==0 || j==0){
                    auxMatrix[i][j] = matrix[i][j];
                }else if(matrix[i][j]==0){
                    auxMatrix[i][j]=0;
                }else{
                    auxMatrix[i][j]= Math.min(auxMatrix[i-1][j], Math.min(auxMatrix[i][j-1],auxMatrix[i-1][j-1]))+1;
                }
                if(auxMatrix[i][j]>max){
                    max = auxMatrix[i][j];
                    iMax = i;
                    jMax =j;
                }
            }
        }
        for(int i = iMax-max+1;i<=iMax;i++){
            for(int j = jMax-max+1;j<=jMax;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println("");
        }
    }
}