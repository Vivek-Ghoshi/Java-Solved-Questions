package CollectionFramework;

import java.util.HashSet;

public class DuplicateElem {
    //find the first duplicate element from the array
    public static void main(String[] args) {
        int[] arr = {1,3,5,7,3,5,1};
        HashSet<Integer> set= new HashSet<>();
        for(int elem : arr){
            if(set.contains(elem)){
                System.out.println(elem);
                return;
            }
            set.add(elem);
        }
    }
}
