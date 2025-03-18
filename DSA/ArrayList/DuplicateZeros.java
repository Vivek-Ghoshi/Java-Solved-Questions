package DSA.ArrayList;

import java.util.Arrays;

public class DuplicateZeros {
    //duplicate zeros of the array in place without changing the actual size of the array;
    public static void duplicateZeros(int[] arr){
        int zeros = 0;
        int n = arr.length;
        for(int elem : arr){
            if(elem == 0) zeros ++;
        }
        int i = n-1 ;
        int j = n + zeros - 1;
        while(i>=0){
            if(j<n){
                arr[j] = arr[i];
            }
            j--;
            if(arr[i] ==0){
                if(j<n){
                    arr[j] = 0;
                }
                j--;
            }
            i--;
        }

    }
    public static void main(String[] args) {
        int [] arr = {1,0,2,3,0,4,5,0};
        duplicateZeros(arr);
        System.out.println(Arrays.toString(arr));
    }
}
