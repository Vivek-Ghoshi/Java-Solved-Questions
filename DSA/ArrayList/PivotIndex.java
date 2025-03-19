package DSA.ArrayList;

public class PivotIndex {
    public static int pivotIndex(int[] arr){
        int leftSum = 0;
        int totalSum = 0;
        for(int elem: arr){
            totalSum += elem;
        }
        for (int i = 0; i < arr.length; i++) {
            if(leftSum == totalSum - leftSum - arr[i]){
                return i;
            }else{
                leftSum += arr[i];
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int [] arr = {1,7,3,6,5,6};
        System.out.println(pivotIndex(arr));
    }
}
