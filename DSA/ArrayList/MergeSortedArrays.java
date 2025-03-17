package DSA.ArrayList;

import java.util.Arrays;

public class MergeSortedArrays {
    //merge sorted arrays in O(m+n) time&space complexity;
    public static int[] mergeArrays(int[] arr1, int[] arr2){
        int n = arr1.length, m = arr2.length;
        int[] result = new int[m+n];
        int i=0,j=0,k=0;
        while (i<n && j<m) {
            if(arr1[i] < arr2[j]){
                result[k++] = arr1[i++];
            }else{
                result[k++] = arr2[j++];
            }
        }

        while (i<n) {
            result[k++] = arr1[i++];
        }
        while (j<m) {
            result[k++] = arr2[j++];
        }
     return result;
    }
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4};
        int[] arr2 = {2,3,4};
        System.out.println(Arrays.toString(mergeArrays(arr1, arr2)));
    }
}
