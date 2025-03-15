package DSA.Recursion;

public class PrimeNumber {
    public static boolean isPrime(int n){
        if(n <= 1) return false;
        if(n==2 || n==3) return true;
        if(n%2==0 || n%3==0){
           return false;
        }
        for(int i=5;i<n/i;i+=2){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int n = 20;
        System.out.print(isPrime(n));
    }
}
