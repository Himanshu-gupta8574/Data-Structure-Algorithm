package Quick_Sort;

public class Quick_Sort {
    public static int partition(int arr[], int st, int end){
        int pivot = arr[st];
        int count = 0;
        for(int i=st+1;i<=end;i++){
            if (arr[i] <= pivot) {
                count++;
            }
        }
        int pivotIdx = st+count;

        int temp = arr[st];
        arr[st] = arr[pivotIdx];
        arr[pivotIdx] = temp;

        int i = st;
        int j = end;

        while (i < pivotIdx && j > pivotIdx) {
            while (arr[i] <= pivot) i++;
            while (arr[j] > pivot) j--;

            if (i < pivotIdx && j > pivotIdx) {
                int temp2 = arr[i];
                arr[i] = arr[j];
                arr[j] = temp2;
                i++;
                j--;
            }
        }

        return pivotIdx;
    }
    public static void quickSort(int arr[], int st, int end){
        if (st >= end) {
            return;
        }
        int pivot = partition(arr, st, end);
        quickSort(arr, st, pivot - 1);
        quickSort(arr, pivot+1, end);
    }
    public static void main(String[] args) {
        int arr[] = {7,13,8,5,10,2,4,2};
        int n = arr.length - 1;
        quickSort(arr, 0, n);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
