package DSA.Recursion;

public class NaturalNumbers {
    public static void Assending(int n){
        if(n<=0) return;
        Assending(n-1);
        System.out.println(n);
    }
    public static void Desending(int n){
        if(n ==0) return;
        System.out.println(n);
        Desending(n-1);
    }
    public static void main(String[] args) {
        Assending(5);
        Desending(5);
    }
}
