public class target_sum {
    public static int targetSum(int arr[], int val){
        int  count  = 0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i] + arr[j] ==  val){
                    System.out.println(arr[i]+" "+arr[j]);
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int arr[] =  {4,6,3,5,8,2};
        System.out.println(targetSum(arr, 7));
    }
}
