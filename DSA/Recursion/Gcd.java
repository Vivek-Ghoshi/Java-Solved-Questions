package DSA.Recursion;

public class Gcd {

    public static int findGcd(int a,int b){
        if(b==0)
          return a;
          return findGcd(b, a%b);
    }
    public static void main(String[] args) {
        int a = 48 , b= 98;
        System.out.println(findGcd(a, b));

    //by bruteforce method//
    //     int i;
    //     for(i = Math.min(a, b);i>0;i--){
    //         if(a%i==0 && b%i==0){
    //             break;
    //         }
    //     }
    //   System.out.println(i);
    }
}