public class nearest_sqrt {
    public static void main(String[] args) {
        int target = 67;
        int idx = -1;
        for(int i=0;i<=8;i++){
            if (target > i*i) {
                idx = i;
            }
        }
        System.out.println(idx);
    }
}
