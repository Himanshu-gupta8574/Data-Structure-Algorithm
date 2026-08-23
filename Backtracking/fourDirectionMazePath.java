package Backtracking;

public class fourDirectionMazePath {
    public static void maze(int sr, int sc, int er, int ec,String s, boolean isVisited[][]){
        if (sr < 0 || sc < 0) {
            return;
        }
        if (sr > er || sc > ec) {
            return;
        }
        if (isVisited[sr][sc] == true) {
            return;
        }
        if (sr == er && sc == ec) {
            System.out.println(s);
            return;
        }
        isVisited[sr][sc] = true;

        maze(sr+1, sc, er, ec, s+"D", isVisited);
        maze(sr, sc+1, er, ec, s+"R", isVisited);
        maze(sr-1, sc, er, ec, s+"L", isVisited);
        maze(sr, sc-1, er, ec, s+"U", isVisited);
        isVisited[sr][sc] = false;
    }
    public static void main(String[] args) {
        int row = 3;
        int col = 3;
        boolean isVisited[][] = new boolean[row][col];
        maze(0,0,row-1,col-1,"",isVisited);
    }
}
