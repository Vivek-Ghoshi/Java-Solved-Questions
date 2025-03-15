package DSA.Recursion;

public class PrintHello {
    public static void Hello(int n){
        if(n==0) return;
        System.out.println("Hello");
        Hello(n-1);
    }
    public static void main(String[] args) {
        Hello(5);
    }
}
