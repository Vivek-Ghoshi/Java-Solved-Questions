package DSA.ArrayList;

import java.util.Arrays;

public class RemoveDup {
    // in this we will be removing the duplicate elements from the array;
    public static int removeDuplicates(int[] arr){
        int n = arr.length;
        if(n==0) return 0;

        int i=0;
        for(int j=1;j<n;j++){
            if(arr[i] != arr[j]){
                i++;
                arr[i] = arr[j];
            }
        }
        return i+1;
    }
    public static void main(String[] args) {
        int [] arr = {1,1,2,2,3,4,4,5,5};
        int newLength = removeDuplicates(arr);

        System.out.println(Arrays.toString(Arrays.copyOf(arr, newLength)));
    }
}
