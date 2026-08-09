package Backtracking;

public class rateInCazeFourDirection {
    public static void maze(int sr, int sc, int er, int ec, String s,boolean isVisited[][], int arr [][]){
        if (sr<0 || sc<0) {
            return;
        }
        if (sr > er || sc > ec) {
            return;
        }
        if (sr == er && sc == ec) {
            System.out.println(s);
            return;
        }
        if (arr[sr][sc] == 0) {
            return;
        }
        if (isVisited[sr][sc] == true) {
            return;
        }
        isVisited[sr][sc] = true;
        maze(sr+1, sc, er, ec, s+"D",isVisited, arr);
        maze(sr, sc+1, er, ec, s+"R",isVisited, arr);
        maze(sr-1, sc, er, ec, s, isVisited, arr);
        maze(sr, sc-1, er, ec, s, isVisited, arr);
        isVisited[sr][sc] = false;
    }
    public static void main(String[] args) {
        int row = 4;
        int col = 6;
        boolean isVisited[][] = new boolean[row][col];
        int arr[][] = {
            {1,0,1,0,1,1},
            {1,1,1,1,1,0},
            {0,1,1,1,1,1},
            {0,0,1,1,1,1}
        };
        maze(0,0,row-1,col-1,"",isVisited, arr);
    }
}
