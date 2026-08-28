package Backtracking;

public class ratInMazeWithoutExtraSpace {
    public static void maze(int sr, int sc, int er, int ec, String s, int arr [][]){
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
        if (arr[sr][sc] == -1) {
            return;
        }
        arr[sr][sc] = -1;
        maze(sr+1, sc, er, ec, s+"D", arr);
        maze(sr, sc+1, er, ec, s+"R", arr);
        maze(sr-1, sc, er, ec, s, arr);
        maze(sr, sc-1, er, ec, s, arr);
        arr[sr][sc] = 1;
    }
    public static void main(String[] args) {
        int row = 3;
        int col = 4;
        int arr[][] = {
            {1,0,1,0},
            {1,1,1,1},
            {0,1,1,1}
        };
        maze(0,0,row-1,col-1,"", arr);
    }
}
