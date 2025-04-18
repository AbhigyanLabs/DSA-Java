import java.util.*;
public class MazeRat 
{
    static int maze(int sr, int sc, int er, int ec)
    {
        if(sr>er || sc>ec) return 0;
        if(sr==er || sc==ec) return 1;
        int downways=maze(sr+1, sc, er, ec);
        int rightways=maze(sr, sc+1,er,ec);
        int totalways=downways+rightways;
        return totalways;
    }

    static void Print(int sr, int sc, int er, int ec, String s)
    {
        if(sr>er || sc>ec) return;
        if(sr==er && sc==ec){
            System.out.println(s);
            return;
        }
        Print(sr+1,sc,er,ec,s+"D");
        Print(sr,sc+1,er,ec,s+"R");
    }


    public static void main(String[] args) 
    {
        int row=15;
        int col=15;
        System.out.println(maze(1,1,row,col));
        Print(1,1,row,col,"");
    }
}