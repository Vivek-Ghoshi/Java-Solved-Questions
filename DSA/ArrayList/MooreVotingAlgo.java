package DSA.ArrayList;

public class MooreVotingAlgo {
    public static int maxElement(int[] arr){
        int key = arr[0];
        int count = 0;
        for(int elem:arr){
            if(count ==0) key = elem;
            count += (key == elem)? 1 : -1;
        }
        count = 0;
        for(int elem : arr){
            if(key == elem) count++;
        }
        return (count > arr.length/2)?key : -1;
    }
    public static void main(String[] args) {
        int[] arr = {2,2,1,1,1,2,2};
        System.out.println(maxElement(arr));
    }
}
