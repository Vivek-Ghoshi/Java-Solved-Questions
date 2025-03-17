package ArrayQuestions;

import java.util.Arrays;

public class LeftRotations {
    //left-roatation of array by brute force
    static int[] leftRotate(int[] arr){
        int n = arr.length;
        int first = arr[0];
        for(int i =0;i<n-1;i++){
           arr[i] = arr[i+1];
        }
        arr[n-1] = first;
        return arr;
    }
    static int[] rightRotations(int[] arr){
        int n = arr.length;
        int last = arr[n-1];
        for(int i=n-2;i>=0;i--){
           arr[i+1] = arr[i];
        }
        arr[0] = last;
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int[] arr2 = {1,2,3,4,5};
        System.out.println(Arrays.toString(leftRotate(arr)));
        System.out.println(Arrays.toString(rightRotations(arr2)));

    }
}
