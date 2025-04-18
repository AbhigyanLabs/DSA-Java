import java.util.*;
public class RatMaze3 
{
    static void Print(int sr, int sc, int er, int ec, String s,int[][] maze)
    {
        if(sr>er || sc>ec) return;
        if(sr==er && sc==ec){
            System.out.println(s);
            return;
        }
        if(maze[sr][sc]==0) return;
        Print(sr+1,sc,er,ec,s+"D",maze);
        Print(sr,sc+1,er,ec,s+"R",maze);
    }


    public static void main(String[] args) 
    {
        int row=3;
        int col=5;
        int maze[][]={{1,0,1,1,1,1},
                      {1,1,1,1,0,1}, 
                      {0,1,1,1,1,1},
                      {0,0,1,0,1,1}};

        Print(0,0,row,col,"",maze);
    }
}