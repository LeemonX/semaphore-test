public class BubbleSort {
    public static int[] bubbleSort(int[] arr, int len){
        if (len == 1 || len == 0)
            return arr;
        for (int i = 0; i < len -1; i++){
            if (arr[i] > arr[i+1]){
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
        }
        return bubbleSort(arr, len-1);
    }
}