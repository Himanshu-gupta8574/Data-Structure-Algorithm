public class array_problem_1 {
    public static void main(String[] args) {
        int  num[]  = {5,8,1,3,6,2};
        int arr[] = new int[2];
        int  min = num[1];
        for(int  i=0;i<num.length;i++){
            if(num[i] <  min){
                min = num[i];
            }
        }

        arr[0] = min;
        int max  =  arr[0];
        for(int i=0;i<num.length;i++){
            if(num[i]  > max){
                max =  num[i];
            }
        }
        arr[1] = max;

        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
