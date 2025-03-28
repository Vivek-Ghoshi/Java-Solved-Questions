package DSA.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public static ArrayList<List<Integer>> threeSum(int[] arr){
        int n = arr.length;
        Arrays.sort(arr);
        ArrayList<List<Integer>> result = new ArrayList<>();

        for(int i=0;i<n-2;i++){
            if(i>0 && arr[i]==arr[i-1]) continue;
            int left = i+1; int right = n-1;
            while(left < right){
                int sum = arr[i] + arr[left] + arr[right];
                if(sum ==0){
                    result.add(Arrays.asList(arr[i],arr[left],arr[right]));
                    while(left < right && arr[left] == arr[left+1]) left++;
                    while(left < right && arr[right] == arr[right-1]) right--;

                    left++;
                    right--;
                }else if(sum < 0) left ++;
                else right--;

            }
        }
        return result;
    }
    public static void main(String[] args) {
        int [] arr = {-1,0,1,2,-1,-4};
        System.out.println(threeSum(arr));
    }
}
