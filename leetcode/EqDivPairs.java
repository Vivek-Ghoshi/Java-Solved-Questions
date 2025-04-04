package Leetcode;


public class EqDivPairs {
    //leetcode: 2176,
    public static void main(String[] args) {
        int [] arr = {3,1,2,2,2,1,3};
        int k = 2;
        int pairs = 0;
        int n = arr.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i] == arr[j] && (i*j)%k==0){
                    pairs++;
                }
            }
        }
        System.out.println(pairs);
    }
}
