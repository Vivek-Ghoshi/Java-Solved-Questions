package DSA.Recursion;

public class NumPower {
    public static int power(int a , int b){
        if(b==0) return 1;
        if(b%2 ==0){
            int halfPower = power(a, b/2);
            return halfPower * halfPower;
        }else{
            return a * power(a, b-1);
        }
    }
    public static void main(String[] args) {
        int a = 2, b = 5;
        System.out.println(power(a, b));
    }
}
