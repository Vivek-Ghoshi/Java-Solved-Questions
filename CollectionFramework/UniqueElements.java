package CollectionFramework;

import java.util.HashSet;

public class UniqueElements {
    //print all the unique elements from the array;
    public static void main(String[] args) {
        int [] arr = {1,2,5,3,8,6,2,4,7};
        HashSet<Integer> set = new HashSet<>();
        for(int elem : arr){
            set.add(elem);
        }
        System.out.println(set);
    }
}
