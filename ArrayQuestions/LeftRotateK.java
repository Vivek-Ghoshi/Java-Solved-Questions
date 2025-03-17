package ArrayQuestions;

import java.util.Arrays;

public class LeftRotateK {
    //by brute force method in O(n)time&space complexcity;
    static int[] rotateK(int[] arr, int k){
        int n = arr.length;
        k = k%n; //incase k is larger then n;
        int[] temp = new int[n];
        //copying the elements from k to n-1 in temp array; 
        for(int i=0;i<n-k;i++){
            temp[i] = arr[i+k];
        }
        //putting the k elemnts at the end
        for(int i=n-k,j=0;i<n;i++,j++){
            temp[i] = arr[j];
        }
        System.arraycopy(temp, 0, arr, 0, n);
        return arr;
    }
  public static void main(String[] args) {
      int[] arr = {1,2,3,4,5};
      int k =2;
      System.out.println(Arrays.toString(rotateK(arr, k)));
  }
    
}