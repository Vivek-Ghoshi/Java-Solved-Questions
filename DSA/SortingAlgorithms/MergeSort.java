package DSA.SortingAlgorithms;

import java.util.Arrays;

public class MergeSort {
    public static void mergeSort(int[] arr,int first,int last){
        if(first == last) return;
        int mid = first + (last - first)/2;

        mergeSort(arr, first, mid);
        mergeSort(arr, mid+1, last);
        conquer(arr, first, mid, last);

    }
    public static void conquer(int[] arr,int first,int mid,int last){
        int[] temp = new int[last - first +1];
        int i = first, j = mid+1, k = 0;
        while (i<= mid && j<=last) {
            if(arr[i] < arr[j]) temp[k++] = arr[i++];
            else temp[k++] = arr[j++];
        }

        while (i<= mid) {
            temp[k++] = arr[i++];
        }
        while (j<= last) {
            temp[k++] = arr[j++];
        }
        for(int t = first,p=0;p<temp.length;t++,p++){
            arr[t] = temp[p];
        }
    }
    public static void main(String[] args) {
        int[] arr = {10,2,5,8,3};
        mergeSort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
