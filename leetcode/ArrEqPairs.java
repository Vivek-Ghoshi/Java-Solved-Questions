package Leetcode;

import java.util.Arrays;

public class ArrEqPairs {
    //leetcode:2206,
    public static void main(String[] args) {
        int[] arr = {3,2,3,2,2,2};
         Arrays.sort(arr);
         int count = 0, n = arr.length;
         for(int i=0;i<n-1;){
            if(arr[i] == arr[i+1]){
                count++;
                i = i+2;
            }else{
                i++;
            }
         }
         System.out.println(n/2 == count);
    }
}
