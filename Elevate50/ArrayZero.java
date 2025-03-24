package Elevate50;

import java.util.Arrays;

public class ArrayZero {
    public static int arrayZero(int[] arr){
        Arrays.sort(arr);
        int steps = 0;
        int lastReduced = 0;

        for(int elem : arr){
            if(elem > lastReduced){
                steps++;
                lastReduced = elem;
               }
        }
        return steps;
    }
    public static void main(String[] args) {
        int[] arr = {5,1,3};
        System.out.println(arrayZero(arr));
    }
}
