package DSA.Recursion;

public class Lcm {
    public static int findGcd(int a,int b){
        if (b==0) {
            return a;
        }
        return findGcd(b, a%b);
    }
    public static int findlcm(int a , int b){
        return (a*b/findGcd(a, b));
    }
    public static void main(String[] args) {
        int a = 12, b =18;
        System.out.println(findlcm(a, b));
    }
}
