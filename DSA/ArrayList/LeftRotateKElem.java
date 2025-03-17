package DSA.ArrayList;

import java.util.Arrays;

public class LeftRotateKElem {
    //Inplace two pointer algoritham O(n)&O(1) time and space complexity
    public static void rotate(int[] arr,int start,int end){
        // this method i have made for reversing the elemnts required
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static int[] leftRotate(int[] arr, int k){
        int n = arr.length;
        if(k==n) return arr;
        k = k%n; // incase k is larger then n;

        //step1: rotate the whole array
        rotate(arr, 0, n-1);

        //step2: rotate n-k elements of array
        rotate(arr, 0, n-k-1);

        //step3: rotate k elements from the last
        rotate(arr, n-k, n-1);

        return arr;
    }

    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5}; 
        int k = 3;
        leftRotate(arr, k);
        System.out.println(Arrays.toString(arr));
    }
}
