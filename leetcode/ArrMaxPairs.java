package leetcode;

import java.util.Arrays;

public class ArrMaxPairs {
    //leetcode:2341, find the maximum numbers of pairs in the array of elements which are equal and return array of answer containing number of pairs & count of remaining unpaired elements in array;
    public static void main(String[] args) {
        int[] arr = {1,3,2,1,3,2,2};
        Arrays.sort(arr);
        int pairs = 0, n = arr.length, rem =0;
        for(int i=0;i<n-1;){
            if(arr[i] == arr[i+1]){
                pairs++;
                i +=2;
            }else{
                i++;
            }
        }
        rem =  n - (pairs*2) ;
        int[] ans = new int[]{pairs,rem};
        System.out.println(Arrays.toString(ans));
    }
}
