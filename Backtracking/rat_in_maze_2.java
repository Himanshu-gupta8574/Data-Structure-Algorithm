package Backtracking;

public class rat_in_maze_2 {
    public static void maze(int sr, int sc, int er, int ec, String s, int arr [][]){
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
        maze(sr+1, sc, er, ec, s+"D", arr);
        maze(sr, sc+1, er, ec, s+"R", arr);
        
    }
    public static void main(String[] args) {
        int row = 4;
        int col = 6;
        int arr[][] = {
            {1,0,1,1,1,1,},
            {1,1,1,1,1,0},
            {0,1,1,1,1,1},
            {0,0,1,1,1,1}};
            maze(0,0,row-1,col-1,"", arr);
        }
    }

