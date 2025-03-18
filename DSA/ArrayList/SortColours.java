package DSA.ArrayList;

import java.util.Arrays;

public class SortColours {
    // sort colours with dutch national flag algoritham
    public static void sortColors(int[] arr){
        int n = arr.length;
        int low = 0;
        int mid = 0;
        int high = n-1;
        while(mid<=high){
            if(arr[mid] ==0){
                swap(arr, mid,low);
                low++;
                mid++;
            }else if(arr[mid] == 1){
                mid++;
            }else{
                swap(arr, high, mid);
                high--;
            }
        }
    }

    //helper function for swaping
    public static void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void main(String[] args) {
        int [] arr = {2,0,1,1,0,2};
        sortColors(arr);
        System.out.println(Arrays.toString(arr));
    }
}
