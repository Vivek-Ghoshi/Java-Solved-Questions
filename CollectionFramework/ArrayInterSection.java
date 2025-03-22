package CollectionFramework;

import java.util.ArrayList;
import java.util.HashSet;

public class ArrayInterSection {
    public static ArrayList<Integer> commanElements( int[] arr1 ,int[] arr2){
       HashSet<Integer> set1 = new HashSet<>();
       HashSet<Integer> set2 = new HashSet<>();

       for(int elem : arr1) set1.add(elem);
       for(int elem : arr2){
        if(set1.contains(elem)){
            set2.add(elem);
        }
       }
       return new ArrayList<>(set2);
    }
    public static void main(String[] args) {
        int[] arr1 = {1,3,6,2,8};
        int[] arr2 = {1,4,2,6,5};
        System.out.println(commanElements(arr1, arr2));
    }
}
