package DSA.SortingAlgorithms;

public class BinarySearch {
    public static int binary(int[] arr, int start,int end,int target){
        if(start > end) return -1;

        int mid = start + (end - start)/2;
        if(arr[mid] == target) return mid;
        else if(arr[mid] > target) return binary(arr, start, mid-1, target);
        else return binary(arr, mid+1, end, target);
    }
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,60};
        System.out.println(binary(arr, 0, arr.length-1, 30));
    }
}
