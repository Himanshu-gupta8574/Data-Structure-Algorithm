public class second_largest {
    public static void main(String[] args) {
        int arr[] = {9,8,9,6,9,5,4,7};
        int max =  arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println("the max value is "+ max);
        int second_largestt  = arr[3];
        for(int i=0;i<arr.length;i++){
            if(arr[i] > second_largestt  &&  arr[i] != max){
                second_largestt =  arr[i];
            }
        }
        System.out.println("the second largest is : "+ second_largestt);
    }
}
