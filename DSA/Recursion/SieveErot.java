package DSA.Recursion;

import java.util.Arrays;

public class SieveErot {
    public static void primeSeive(int n){
        boolean[] prime = new boolean[n+1];
        Arrays.fill(prime, true);
        for(int i =2;i*i <=n ;i++){
            if(prime[i]){
                for(int j=i*i;j<=n; j+=i){
                   prime[j] = false;
                }
            }
        }
        //printing of all prime numbers upto n;
        System.out.print("all prime numbers upto " + n + " : ");
        for(int i=2;i<=n;i++){
            if(prime[i]){
                System.out.print(i + " ");
            }
            
        }
    }
    public static void main(String[] args) {
        int n =10;
        primeSeive(n);
    }
}
