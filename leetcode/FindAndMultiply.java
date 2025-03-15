package leetcode;

public class FindAndMultiply {
    //leetcode:2154, keep multiply found values by two
    public static void main(String[] args) {
        int[] arr = {5,3,6,1,12};
        int origial = 3;
        for(int i=0;i<arr.length;i++){
            if(arr[i] == origial){
                origial *=2;
                i= -1;
            }
        }
        System.out.println(origial);
    }
    
}
