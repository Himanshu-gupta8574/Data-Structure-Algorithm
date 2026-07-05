public class array_notation {
    public static void main(String[] args) {
        int  feq[] = new int[1000];
        int arr[] =  {1,5,6,32,4,1,5,32,4};
        for(int  i=0;i<arr.length;i++){
            feq[arr[i]]++;
        }
        for(int i=0;i<feq.length;i++){
            if(feq[i] == 1){
                System.out.println(i);      //  
            }
            // else{
            //     System.out.println(i);
            // }
        }
    }
}
