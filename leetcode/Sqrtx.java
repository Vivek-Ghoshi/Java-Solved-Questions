package leetcode;

public class Sqrtx {
    //By using binary search;
    public static int squareRoot(int x){
        if(x==0 || x==1) return x;
        int left = 0, right = x;
        int ans = 0;
        while (left <= right) {
            int mid = left + (right - left)/2;
            long square =  mid*mid;
            if(square == x){
                return mid;
            }else if(square < x){
                ans = mid;
                left = mid +1;
            }else{
                right = mid - 1;
            }
            
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(squareRoot(15));
        
    }
}
