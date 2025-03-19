package DSA.ArrayList;

public class KadaneAlgorithm {
    public static int maxSumByKadane(int[] arr){
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;
        for(int elem: arr){
            currentSum += elem;
            maxSum = Math.max(maxSum, currentSum);

            if(currentSum < 0){
                currentSum = 0;
            }
        }
        return maxSum;
    }
    public static void main(String[] args) {
        int[] arr = {5,4,-1,7,8};
        System.out.println(maxSumByKadane(arr));
    }
}
