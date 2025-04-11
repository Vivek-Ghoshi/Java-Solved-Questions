package DSA.SortingAlgorithms;

import java.util.Arrays;

public class QuickSort {
    public static int pivot(int[] arr,int start,int end){
        int piv = arr[end];
        int i = start-1;
        for(int j=start;j<end;j++){
            if(arr[j] < piv){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        } 
        i++;
        int temp = arr[i];
        arr[i] = arr[end];
        arr[end] = temp;
        return i;
    }
    public static void sort(int[] arr,int start,int end){
        if(start>=end) return;
        int pIndex = pivot(arr, start, end);

        sort(arr, start, pIndex-1);
        sort(arr, pIndex+1, end);

    }
    public static void main(String[] args) {
         int[] arr = {10,2,5,4,8};
         sort(arr, 0, arr.length-1);
         System.out.println(Arrays.toString(arr));
    }
}
