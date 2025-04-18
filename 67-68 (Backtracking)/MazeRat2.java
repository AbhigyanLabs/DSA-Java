// import java.util.*;
// class MazeRat2 {
//     static void Print(int sr, int sc, int er, int ec, String s)
//     {
//         if(sr<1 || sc<1) return;
//         if(sr>er || sc>ec) return;
//         if(sr==er && sc==ec){
//             System.out.println(s);
//             return;
//         }
//         Print(sr+1,sc,er,ec,s+"D");
//         Print(sr,sc+1,er,ec,s+"R");
//         Print(sr,sc-1,er,ec,s+"L");
//         Print(sr-1,sc,er,ec,s+"U");
//     }


//     public static void main(String[] args) 
//     {
//         int row=2;
//         int col=2;
//         //System.out.println(maze(1,1,row,col));
//         Print(1,1,row,col,"");
//     }
// }

//infinite loop problem





import java.util.*;

class MazeRat2 {
    static void Print(int sr, int sc, int er, int ec, String s, boolean[][] visited) {
        if (sr < 1 || sc < 1 || sr > er || sc > ec || visited[sr][sc]) return;
        if (sr == er && sc == ec) {
            System.out.println(s);
            return;
        }

        visited[sr][sc] = true;
        Print(sr, sc + 1, er, ec, s + "R", visited);
        Print(sr + 1, sc, er, ec, s + "D", visited);
        Print(sr, sc - 1, er, ec, s + "L", visited);
        Print(sr - 1, sc, er, ec, s + "U", visited);

        visited[sr][sc] = false;
    }

    public static void main(String[] args) {
        int row = 3;
        int col = 3;
        boolean[][] visited = new boolean[row + 1][col + 1];
        Print(1, 1, row, col, "", visited);
    }
}