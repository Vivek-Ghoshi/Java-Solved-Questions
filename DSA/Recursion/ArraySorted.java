package DSA.Recursion;

public class ArraySorted {
    public static boolean isSorted(int[] arr, int index){
      if(index == arr.length-1) return true;
      
      if(arr[index] > arr[index+1]) return false;
       
      return isSorted(arr, index+1);
        
    }

    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,7,6};
        System.out.println(isSorted(arr, 0));
    }
}
