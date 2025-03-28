package DSA.ArrayList;

public class RainWater {
    public static int trapRainWater(int[] arr){
        int n = arr.length;
        int water = 0;
        int[] leftMax = new int[n];
        int[] rightMax = new int[n];
        
        leftMax[0] = arr[0];
        rightMax[n-1] = arr[n-1];
        for(int i=1;i<n;i++){
            leftMax[i] = Math.max(leftMax[i-1], arr[i]);
        }
        for(int i= n-2;i>=0;i--){
            rightMax[i] = Math.max(rightMax[i+1], arr[i]);
        }

        for(int i = 0;i<n;i++){
            water += Math.min(leftMax[i], rightMax[i]) - arr[i] ;
        }
        return water;
    }
    public static void main(String[] args) {
        int [] arr = {4,2,0,3,2,5};
        System.out.println(trapRainWater(arr));
    }
}
