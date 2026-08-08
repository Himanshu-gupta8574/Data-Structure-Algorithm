package Backtracking;

public class rate_in_maze_path {
    public static void maze(int sr, int sc, int er, int ec, String s){
        if (sr > er || sc > ec) {
            return;
        }
        if (sr == er && sc == ec) {
            System.out.println(s);
            return;
        }
        maze(sr+1, sc, er, ec, s+"R");
        maze(sr, sc+1, er, ec, s+"D");
    }
    public static void main(String[] args) {
        int er = 3;
        int ec = 3;
        maze(1,1,er,ec, "");
    }
}
