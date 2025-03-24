package Elevate25;

public class Hcf {
    public static int gcd(int a,int b){
        System.out.println(a+ " " + b);
        if(b==0)
            return a;
        return gcd(b, a%b);
    }
    public static void main(String[] args) {
        int a = 12;
        int b = 18;
        // System.out.println(gcd(a, b));
        for(int i = Math.min(a, b);i>=1;i--){
            if(a%i==0 && b%i==0){
                System.out.println(i);
                break;
            }
        }
    }
}
