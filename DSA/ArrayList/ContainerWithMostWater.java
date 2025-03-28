package DSA.ArrayList;

public class ContainerWithMostWater {
    public static int mostWater(int[] arr){
        int n = arr.length;
        int maxArea = 0;
        int left = 0,right = n-1;
        while (left < right) {
            int area = Math.min(arr[left], arr[right]) * (right - left);
            maxArea = Math.max(maxArea, area);

            if(arr[left]<arr[right]) left++;
            else right--;
        } 
        return maxArea;
    }
    public static void main(String[] args) {
        int[] arr = {1,8,6,2,5,4,8,3,7};
        System.out.println(mostWater(arr));
    }
}
