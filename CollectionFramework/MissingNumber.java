package CollectionFramework;

import java.util.HashSet;

public class MissingNumber {
    public static int missing(int[] arr,int n){
        HashSet<Integer> set = new HashSet<>();
        for(int elem : arr) set.add(elem);
        for(int i=1;i<=n;i++){
            if(!set.contains(i)) return i;
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,4,5,6};
        System.out.println(missing(arr, 6));

    }
}
