import java.util.LinkedList;
import java.util.Queue;

public class RotOranges{

    final static class Position{
        int x;
        int y;
        Position(int x,int y){
            this.x=x;
            this.y=y;
        }
    }

    static void findRotPositions(int[][] array,Queue<Position> q){
        int m=array.length;
        int n=array[0].length;

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(array[i][j]==2){
                    Position position=new Position(i, j);
                    q.add(position);
                }
            }
        }
        Position pos=new Position(-1, -1);
        q.add(pos);
    }

    static boolean isValidPosition(int[][] array,int x,int y){
        int m=array.length;
        int n=array[0].length;
        if(x<m && y<n && x>=0 && y>=0) return true;
        else return false;
    }

    static boolean checkAllRotton(int[][] array){
        int m=array.length;
        int n=array[0].length;

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(array[i][j]==1) return false;
            }
        }
        return true;
    }

    static int rotOranges(int[][] array){
        int ans=0;
        Queue<Position> q=new LinkedList<>();
        findRotPositions(array,q);

        while(!q.isEmpty()){
            Position pos=q.remove();
            int x=pos.x;
            int y=pos.y;
    
            if(isValidPosition(array, x+1, y) && array[x+1][y]==1){
                array[x+1][y]=2;
                Position rotPos=new Position(x+1, y);
                q.add(rotPos);
            }
            if(isValidPosition(array, x, y+1) && array[x][y+1]==1){
                array[x][y+1]=2;
                Position rotPos=new Position(x, y+1);
                q.add(rotPos);
            }
            if(isValidPosition(array, x-1, y) && array[x-1][y]==1){
                array[x-1][y]=2;
                Position rotPos=new Position(x-1, y);
                q.add(rotPos);
            }
            if(isValidPosition(array, x, y-1) && array[x][y-1]==1){
                array[x][y-1]=2;
                Position rotPos=new Position(x, y-1);
                q.add(rotPos);
            }
            if(x==-1 && y==-1){ 
                ++ans; 
                Position limitingPos=new Position(-1, -1);
                q.add(limitingPos); 
            }
        }
        boolean isAllRotton=checkAllRotton(array);
        return isAllRotton?ans:-1;
    }

    public static void main(String[] args) {
        int arr[][] = { {2, 1, 0, 2, 1},
        {1, 0, 1, 2, 1},
        {1, 0, 0, 2, 1}};
        int ans = rotOranges(arr);
        if(ans == -1)
        System.out.println("All oranges cannot rot");
        else
        System.out.println("Time required for all oranges to rot = " + ans);
    }
}